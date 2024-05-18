package dev.joewilson.beans.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Remember! You can find @bean annotation inside a class that use @Configuration
 * 
 * then you can wired that restTemplate in controller
 */
@Configuration
public class WebConfig {
  
  @Bean
  RestTemplate restTemplate() {
    return new RestTemplateBuilder().build();
  }

}
