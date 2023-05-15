package com.srini.retry.controller;

import com.srini.retry.service.AppService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type App controller.
 */
@RestController
@RequestMapping("/app")
@RequiredArgsConstructor
public class AppController {

    private final AppService appService ;

    /**
     * Get string.
     *
     * @return the string
     */
    @GetMapping("/retry")
    public String get(){
        return appService.get();
    }
}
