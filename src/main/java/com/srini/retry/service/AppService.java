package com.srini.retry.service;

import io.github.resilience4j.retry.annotation.Retry;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.atomic.AtomicInteger;

@Service
@Slf4j
@RequiredArgsConstructor
public class AppService {

    private final RestTemplate restTemplate ;
    private final AtomicInteger counter = new AtomicInteger() ;


    @Retry(name = "serviceA", fallbackMethod = "fallbackA")
    public String get(){
        log.info("calling get method {} time(s)", counter.incrementAndGet());
        return restTemplate.getForEntity("http://dummy:8080", String.class).getBody() ;
    }

    private String fallbackA(Throwable throwable){
        counter.set(0);
        log.info("falling back to alternative response");
        return "fallback" ;
    }


}
