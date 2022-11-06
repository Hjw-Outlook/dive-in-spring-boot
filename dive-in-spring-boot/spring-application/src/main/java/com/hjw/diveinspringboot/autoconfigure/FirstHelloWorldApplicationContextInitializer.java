package com.hjw.diveinspringboot.autoconfigure;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * @ClassName FirstHelloWorldApplicationContextInitializer
 * @Description TODO
 * @Author H_jw
 * @Date 2022-11-06 0006 下午 05:01
 * @Version 1.0
 */
@Order(Ordered.HIGHEST_PRECEDENCE)
public class FirstHelloWorldApplicationContextInitializer<C extends ApplicationContextInitializer> implements ApplicationContextInitializer {

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.out.println("FirstHelloWorldApplicationContextInitializer#initialize" + applicationContext.getId());
    }
}
