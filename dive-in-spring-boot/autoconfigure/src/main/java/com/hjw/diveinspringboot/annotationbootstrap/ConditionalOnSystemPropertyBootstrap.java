package com.hjw.diveinspringboot.annotationbootstrap;

import com.hjw.diveinspringboot.condition.ConditionalOnSystemProperty;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * @ClassName ConditionalOnSystemPropertyBootstrap
 * @Description TODO
 * @Author H_jw
 * @Date 2022-11-05 0005 上午 10:32
 * @Version 1.0
 */
public class ConditionalOnSystemPropertyBootstrap {

    @Bean
    @ConditionalOnSystemProperty(name = "user.name", value = "Runde")
    public String helloWorld(){
        return "helloWorld!!! 202211051034";
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new SpringApplicationBuilder(ConditionalOnSystemPropertyBootstrap.class).web(WebApplicationType.NONE).run(args);

        System.out.println(context.getBean("helloWorld", String.class));

        context.close();
    }
}
