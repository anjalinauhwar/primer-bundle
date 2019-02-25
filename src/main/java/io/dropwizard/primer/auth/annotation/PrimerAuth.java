package io.dropwizard.primer.auth.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;

@Retention(RetentionPolicy.RUNTIME)
@Target({TYPE, METHOD})
public @interface PrimerAuth {

    String[] value() default {};

    PrimerAuthParam[] authParams() default {};

}