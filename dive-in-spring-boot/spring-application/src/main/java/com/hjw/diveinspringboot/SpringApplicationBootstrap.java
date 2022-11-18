package com.hjw.diveinspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName SpringApplicationBootstrap
 * @Description TODO
 * @Author H_jw
 * @Date 2022-11-06 0006 下午 04:05
 * @Version 1.0
 */
//@SpringBootApplication
public class SpringApplicationBootstrap {

    public static void main(String[] args) {
        // 1
        //SpringApplication.run(SpringApplicationBootstrap.class, args);

        // 2
        //SpringApplication.run(ApplicationConfiguration.class, args);

        // 3
        //new SpringApplication(ApplicationConfiguration.class)
        //        .run(args);

        // 4
        SpringApplication springApplication = new SpringApplication();
        Set<String> sources = new HashSet<>();
        sources.add(ApplicationConfiguration.class.getName());
        springApplication.setSources(sources);

        springApplication.setWebApplicationType(WebApplicationType.SERVLET);

        springApplication.run(args);

        // Lambda 代码示例
        //Supplier<String> stringSupplier = () -> "1213";
        //System.out.println(stringSupplier.get());
        //Consumer<String> stringConsumer = (a) -> {
        //    a = a + a;
        //    System.out.println(a);
        //};
        //stringConsumer.accept("123");

        //A a = new A(String.class);
    }

    @SpringBootApplication
    public static class ApplicationConfiguration {

    }


    //static class A{
    //    public A(Class<?>... cls){
    //        System.out.println(cls);
    //    }
    //}

    //@SpringBootApplication
    //static class ApplicationConfiguration{
    //
    //}

}
