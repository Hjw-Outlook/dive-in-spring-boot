package com.hjw.diveinspringboot.selector;

import com.hjw.diveinspringboot.configuration.HelloWorldConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @ClassName HelloWorldImportSelector
 * @Description TODO
 * @Author H_jw
 * @Date 2022-11-02 0002 上午 11:58
 * @Version 1.0
 */
public class HelloWorldImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{HelloWorldConfiguration.class.getName()};
    }
}
