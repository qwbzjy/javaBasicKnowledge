package com.annotation.demo02;

import java.lang.annotation.*;

/**
 * @author created by qwb on 2018/9/14 10:57
 */
@Target(ElementType.METHOD)

@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyAnnotation {
    String name();

    int age();

    boolean sex();

}
