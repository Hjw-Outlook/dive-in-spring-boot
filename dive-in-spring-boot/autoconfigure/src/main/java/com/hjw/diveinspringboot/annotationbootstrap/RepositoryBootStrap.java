package com.hjw.diveinspringboot.annotationbootstrap;

import com.hjw.diveinspringboot.repository.MyFirstCaching;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName RepositoryBootStrap
 * @Description TODO
 * @Author H_jw
 * @Date 2022-11-02 0002 下午 12:31
 * @Version 1.0
 */
@ComponentScan(basePackages = "com.hjw.diveinspringboot.repository")
public class RepositoryBootStrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(RepositoryBootStrap.class).web(WebApplicationType.NONE).run(args);

        System.out.println("context.getBean = " + context.getBean("myFirstCaching", MyFirstCaching.class));


        context.close();
    }
}
