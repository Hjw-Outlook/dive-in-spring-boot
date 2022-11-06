package com.hjw.diveinspringboot.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * @ClassName StreamCalculateServiceImpl
 * @Description TODO
 * @Author H_jw
 * @Date 2022-11-04 0004 下午 05:59
 * @Version 1.0
 */
@Profile("Java8")
@Service
public class StreamCalculateServiceImpl implements CalculateService{
    @Override
    public int sum(Integer... sumArgs) {
        System.out.println("Java8 stream Lambda实现计算");
        return Arrays.stream(sumArgs).reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        CalculateService calculateService = new StreamCalculateServiceImpl();
        System.out.println(calculateService.sum(1, 2, 3));
    }

}
