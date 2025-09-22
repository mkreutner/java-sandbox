package main.java.com.mkdevs.dyma;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface Model {
    String value();
    String author() default "mkdevs";
    String date() default "2024-06-10";
    String version() default "1.0";
}
