package com.club_app.fixture.annotation.validation;

import com.club_app.fixture.annotation.CategoryConstraint;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CategoryValidator implements ConstraintValidator<CategoryConstraint, String> {

    @Override
    public void initialize(CategoryConstraint constraintAnnotation) {
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {

        final Set<String> ALLOWED_VALUES = new HashSet<>(Arrays.asList(
                "RUGBY_PS", "HOCKEY_PS", "RUGBY_M19", "RUGBY_M17", "HOCKEY_5TA"
        ));


        if (s == null || s.isEmpty()) {
            return false;
        }



        return ALLOWED_VALUES.contains(s.toUpperCase());
    }
}
