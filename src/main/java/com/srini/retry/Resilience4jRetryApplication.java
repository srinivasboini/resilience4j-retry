package com.srini.retry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * The type Resilience 4 j retry application.
 */
@SpringBootApplication
public class Resilience4jRetryApplication {

	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(Resilience4jRetryApplication.class, args);
	}


	/**
	 * Rest template rest template.
	 *
	 * @return the rest template
	 */
	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplateBuilder().build() ;
	}

}
