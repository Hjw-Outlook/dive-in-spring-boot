package com.hjw.diveinspringboot.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.Ordered;

/**
 * @ClassName AfterHelloWorldApplicationListener
 * @Description TODO
 * @Author H_jw
 * @Date 2022-11-07 0007 下午 02:12
 * @Version 1.0
 */
public class AfterHelloWorldApplicationListener implements ApplicationListener<ContextRefreshedEvent>, Ordered {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("AfterHelloWorldApplicationListener contextId : " + event.getApplicationContext().getId() + ", timestamp:" + event.getTimestamp());
    }

    @Override
    public int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }
}
