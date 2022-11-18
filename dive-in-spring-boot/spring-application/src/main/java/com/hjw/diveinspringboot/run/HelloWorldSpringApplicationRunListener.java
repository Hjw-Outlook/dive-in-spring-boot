package com.hjw.diveinspringboot.run;

import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;

/**
 * @ClassName HelloWorldSpringApplicationRunListener
 * @Description {@link SpringApplicationRunListener} 监听springboot运行事件
 * @Author H_jw
 * @Date 2022-11-09 0009 上午 10:35
 * @Version 1.0
 */
public class HelloWorldSpringApplicationRunListener implements SpringApplicationRunListener {

    public HelloWorldSpringApplicationRunListener(SpringApplication application, String[] args) {

    }

    @Override
    public void starting(ConfigurableBootstrapContext bootstrapContext) {
        System.out.println("bootstrap : starting......");
    }
}
