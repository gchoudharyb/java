package com.gaurav.java.reflection;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Retryble {
public int numOfRetires();
public enum retryType{FIXED,DAILY};
public int count() default 2;
}
