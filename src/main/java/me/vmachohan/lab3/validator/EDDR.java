package me.vmachohan.lab3.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = EDDRValidator.class)
public @interface EDDR  {

    String message() default "Wrong eddr";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
