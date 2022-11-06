package com.hjw.diveinspringboot.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @ClassName ForCalculateServiceImpl
 * @Description TODO
 * @Author H_jw
 * @Date 2022-11-04 0004 下午 05:57
 * @Version 1.0
 */
@Profile("Java7")
@Service
public class ForCalculateServiceImpl implements CalculateService{

    @Override
    public int sum(Integer... sumArgs) {
        System.out.println("Java7 for 循环计算");
        int count = 0;
        for (Integer sumArg : sumArgs) {
            count += sumArg;
        }
        return count;
    }

    public static void main(String[] args) {
        CalculateService calculateService = new ForCalculateServiceImpl();
        System.out.println(calculateService.sum(1, 2, 3));
    }

}
