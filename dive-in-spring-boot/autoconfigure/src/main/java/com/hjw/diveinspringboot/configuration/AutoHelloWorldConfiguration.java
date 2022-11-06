package com.hjw.diveinspringboot.configuration;

import com.hjw.diveinspringboot.annotation.EnableHelloWorld;
import com.hjw.diveinspringboot.condition.ConditionalOnSystemProperty;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName AutoHelloWorldConfiguration
 * @Description TODO
 * @Author H_jw
 * @Date 2022-11-05 0005 上午 11:55
 * @Version 1.0
 */
@Configuration // 模式、范式注解
@ConditionalOnSystemProperty(name = "user.name", value = "Runde")
@EnableHelloWorld // Enable* 模块 -> HelloWorldImportSelector#selectImports -> HelloWorldConfiguration Bean
public class AutoHelloWorldConfiguration {
}
