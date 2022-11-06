package com.hjw.diveinspringboot.annotation;

import com.hjw.diveinspringboot.selector.HelloWorldImportSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @enumName EnableHelloWorld
 * @Description TODO
 * @Author H_jw
 * @Date 2022-11-02 0002 上午 11:47
 * @Version 1.0
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import({HelloWorldImportSelector.class})
public @interface EnableHelloWorld {
}
