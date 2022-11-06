package com.hjw.diveinspringboot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @ClassName HelloWorldConfiguration
 * @Description TODO
 * @Author H_jw
 * @Date 2022-11-02 0002 上午 11:47
 * @Version 1.0
 */
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String helloWorld() {
        return "helloWorld!!!";
    }
}
