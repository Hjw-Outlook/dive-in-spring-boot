package com.hjw.diveinspringboot.autoconfigure;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;

/**
 * @ClassName AfterHelloWorldApplicationContextInitializer
 * @Description TODO
 * @Author H_jw
 * @Date 2022-11-06 0006 下午 05:04
 * @Version 1.0
 */
public class AfterHelloWorldApplicationContextInitializer implements ApplicationContextInitializer, Ordered {

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.out.println("AfterHelloWorldApplicationContextInitializer#initialize" + applicationContext.getId());
    }

    @Override
    public int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }
}
