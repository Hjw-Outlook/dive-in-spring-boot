package com.hjw.diveinspringboot.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.MultiValueMap;

import java.util.Map;
import java.util.Properties;

/**
 * @ClassName OnSystemPropertyCondition
 * @Description TODO
 * @Author H_jw
 * @Date 2022-11-05 0005 上午 10:30
 * @Version 1.0
 */
public class OnSystemPropertyCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Map<String, Object> propertiesMap = metadata.getAnnotationAttributes(ConditionalOnSystemProperty.class.getName());
        if (propertiesMap == null || propertiesMap.isEmpty()) return false;
        String systemName = System.getProperty(String.valueOf(propertiesMap.get("name")));
        return String.valueOf(propertiesMap.get("value")).equals(systemName);
    }

}
