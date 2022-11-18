package com.hjw.diveinspringboot.listener;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.boot.env.EnvironmentPostProcessorApplicationListener;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.core.Ordered;

/**
 * @ClassName BeforeEnvironmentPostProcessorApplicationListener
 * @Description 在 {@link EnvironmentPostProcessorApplicationListener} 之后读取文件信息（注意一个order 监听器顺序）
 * @Author H_jw
 * @Date 2022-11-09 0009 下午 05:00
 * @Version 1.0
 */
public class BeforeEnvironmentPostProcessorApplicationListener implements SmartApplicationListener, Ordered {

    @Override
    public boolean supportsEventType(Class<? extends ApplicationEvent> eventType) {
        return ApplicationEnvironmentPreparedEvent.class.isAssignableFrom(eventType)
                || ApplicationPreparedEvent.class.isAssignableFrom(eventType)
                || ApplicationFailedEvent.class.isAssignableFrom(eventType);
    }

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if (event instanceof ApplicationEnvironmentPreparedEvent) {
            ApplicationEnvironmentPreparedEvent environmentPreparedEvent = (ApplicationEnvironmentPreparedEvent) event;
            System.out.println(environmentPreparedEvent.getEnvironment().getProperty("name"));
        }
        if (event instanceof ApplicationPreparedEvent) {
        }
        if (event instanceof ApplicationFailedEvent) {
        }
    }

    @Override
    public boolean supportsSourceType(Class<?> sourceType) {
        return SmartApplicationListener.super.supportsSourceType(sourceType);
    }

    @Override
    public int getOrder() {
        //return EnvironmentPostProcessorApplicationListener.DEFAULT_ORDER + 1;
        return EnvironmentPostProcessorApplicationListener.DEFAULT_ORDER - 1;
    }
}
