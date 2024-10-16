package net.sourceforge.beanbin.annotations;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Target({ElementType.METHOD}) @Retention(RUNTIME)
public @interface IndexSearch {}
