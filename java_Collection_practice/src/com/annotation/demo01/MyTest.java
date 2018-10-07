package com.annotation.demo01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author created by qwb on 2018/9/14 10:37
 */

//注解在运行时保留
@Retention(RetentionPolicy.RUNTIME)

//注解只能作用在方法
@Target(ElementType.METHOD)
public @interface MyTest {
}
