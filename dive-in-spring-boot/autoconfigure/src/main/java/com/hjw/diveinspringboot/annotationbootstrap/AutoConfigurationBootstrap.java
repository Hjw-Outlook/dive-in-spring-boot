package com.hjw.diveinspringboot.annotationbootstrap;

import com.hjw.diveinspringboot.configuration.AutoHelloWorldConfiguration;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @ClassName AutoConfigurationBootstrap
 * @Description TODO
 * @Author H_jw
 * @Date 2022-11-05 0005 下午 04:01
 * @Version 1.0
 */
@SpringBootApplication(scanBasePackages = "com.hjw.diveinspringboot.configuration")
public class AutoConfigurationBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(AutoConfigurationBootstrap.class).web(WebApplicationType.NONE).run(args);
        System.out.println(context.getBean("helloWorld", String.class));
        System.out.println(context.getBean(AutoHelloWorldConfiguration.class));
        context.close();
    }
}
