package com.example.gateway1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Gateway1Application {

    public static void main(String[] args) {
        SpringApplication.run(Gateway1Application.class, args);
    }
    @Bean
    DiscoveryClientRouteDefinitionLocator definitionLocator(
            ReactiveDiscoveryClient rdc , DiscoveryLocatorProperties properties){
        return new  DiscoveryClientRouteDefinitionLocator(rdc , properties);
    }
}
