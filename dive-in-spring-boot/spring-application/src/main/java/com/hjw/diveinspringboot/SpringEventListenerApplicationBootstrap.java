package com.hjw.diveinspringboot;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName SpringEventListenerApplicationBootstrap
 * @Description TODO
 * @Author H_jw
 * @Date 2022-11-07 0007 下午 04:08
 * @Version 1.0
 */
public class SpringEventListenerApplicationBootstrap {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        // 增加 应用事件监听器
        context.addApplicationListener((event) -> {System.out.println("监听的事件：" + event);});

        context.refresh();

        context.publishEvent("hello");
        context.publishEvent("world");
        context.publishEvent(new ApplicationEvent("2022") {
        });

        context.stop();
    }
}
