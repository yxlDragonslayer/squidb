/*
 * Copyright 2015, Yahoo Inc.
 * Copyrights licensed under the Apache 2.0 License.
 * See the accompanying LICENSE file for terms.
 */
package com.yahoo.squidb.annotations;

public @interface ModelGenErrors {

    ModelGenError[] value();

    @interface ModelGenError {

        Class<?> specClass();

        String element() default "";

        String message();
    }
}
