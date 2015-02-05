package com.leonardoz.cditech.identifiers;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;
import javax.interceptor.InterceptorBinding;


@InterceptorBinding
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface Audit {

}
