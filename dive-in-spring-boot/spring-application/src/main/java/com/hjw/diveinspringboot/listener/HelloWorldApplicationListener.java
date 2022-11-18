package com.hjw.diveinspringboot.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ApplicationContextEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * @ClassName HelloWorldApplicationListener
 * @Description 监听 {@link ContextRefreshedEvent } -> {@link ApplicationContextEvent} -> {@link ApplicationEvent} 事件
 * @Author H_jw
 * @Date 2022-11-07 0007 下午 02:06
 * @Version 1.0
 */
@Order(Ordered.HIGHEST_PRECEDENCE)
public class HelloWorldApplicationListener implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("HelloWorldApplicationListener contextId : " + event.getApplicationContext().getId() + ", timestamp:" + event.getTimestamp());
    }
}
