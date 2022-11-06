package com.hjw.diveinspringboot.annotation;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@FirstCaching
public @interface SecondCaching {

    String value() default "";
}
