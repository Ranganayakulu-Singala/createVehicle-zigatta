package com.zigatta.error.validator;

import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Documented
@Constraint(validatedBy = TransmissionTypeValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface TransmissionTypeValidatorConstraint {
   String message() default "Invalid TransmissionType. It should be AUTO or MANUAL";
   Class<?>[] groups() default {};
   Class<? extends Payload>[] payload() default {};
}
