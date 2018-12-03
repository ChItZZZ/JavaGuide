package org.shzhong.annotation;


import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface MyMessage {

    String name() default "sam";

    int num() default 0;

    String desc();

}
