package com.mylabsSE.lab162;

import com.mylabsSE.lab162.User.PermAction;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = ElementType.METHOD)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface MyAnnot {
    PermAction value() ;

}
