package com.hjw.diveinspringboot.annotation;

import org.springframework.stereotype.Repository;

import java.lang.annotation.*;

/**
 *
 * @Author H_jw
 * @Date 2022-11-02 0002 上午 11:33
 * @since
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Repository
public @interface FirstCaching {

    String value() default "";

}
