package com.club_app.fixture.annotation.validation;

import com.club_app.fixture.annotation.CategoryConstraint;
import com.club_app.fixture.enums.CATEGORIAS;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CategoryValidator implements ConstraintValidator<CategoryConstraint, String> {

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {


        if (s == null || s.isEmpty()) {
            return false;
        }

        try{
            CATEGORIAS.valueOf(s.toUpperCase());
            return true;
        }catch(IllegalArgumentException e){
            return false;
        }
    }
}
