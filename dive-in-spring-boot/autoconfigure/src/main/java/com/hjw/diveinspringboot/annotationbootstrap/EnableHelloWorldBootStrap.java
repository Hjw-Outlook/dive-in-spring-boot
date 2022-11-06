package com.hjw.diveinspringboot.annotationbootstrap;

import com.hjw.diveinspringboot.selector.HelloWorldImportSelector;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

/**
 * @ClassName EnableHelloWorldBootStrap
 * @Description TODO
 * @Author H_jw
 * @Date 2022-11-02 0002 上午 11:36
 * @Version 1.0
 */
//@EnableHelloWorld
@Import({HelloWorldImportSelector.class})
public class EnableHelloWorldBootStrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(EnableHelloWorldBootStrap.class).web(WebApplicationType.NONE).run(args);

        System.out.println("context.getBean = " + context.getBean("helloWorld", String.class));


        context.close();
    }
}
