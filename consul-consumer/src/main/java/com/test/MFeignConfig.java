package com.test;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MFeignConfig {

    @Bean
    Logger.Level fiegnLoggerLevel(){
        return Logger.Level.FULL;
    }
}
