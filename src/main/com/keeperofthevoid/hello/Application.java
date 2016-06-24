package com.keeperofthevoid.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

/**
 * SpringBootApplication annotation combines:
 *
 * Annotations
 *    Configuration
 *    EnableAutoConfiguration
 *    "EnableWebMvc", but Spring boot adds it if it sees spring-webmvc on classpath: activates DispatcherService
 *    ComponentScan
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);

        System.out.println("Let's inspect the beans provided by Spring Boot:");

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for(String beanName : beanNames) {
            System.out.println(beanName);
        }
    }
}
