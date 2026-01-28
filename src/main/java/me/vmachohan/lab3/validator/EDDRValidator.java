package me.vmachohan.lab3.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class EDDRValidator implements ConstraintValidator<EDDR, String> {
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return true;
    }
}
