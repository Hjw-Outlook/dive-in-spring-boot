package com.hjw.diveinspringboot.annotationbootstrap;

import com.hjw.diveinspringboot.profile.CalculateService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @ClassName JavaProfileCalculateBootstrap
 * @Description TODO
 * @Author H_jw
 * @Date 2022-11-04 0004 下午 06:05
 * @Version 1.0
 */
@SpringBootApplication(scanBasePackages = "com.hjw.diveinspringboot.profile")
public class JavaProfileCalculateBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new SpringApplicationBuilder(JavaProfileCalculateBootstrap.class)
                        .web(WebApplicationType.NONE)
                        .profiles("Java8")
//                        .profiles("Java7")
                        .run(args);

//        CalculateService calculateService = context.getBean("forCalculateServiceImpl", CalculateService.class);
        CalculateService calculateService = context.getBean("streamCalculateServiceImpl", CalculateService.class);
        System.out.println(calculateService.sum(1, 2, 3));

        context.close();
    }
}
