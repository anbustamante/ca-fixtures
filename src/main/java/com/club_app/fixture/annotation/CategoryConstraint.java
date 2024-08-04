package com.club_app.fixture.annotation;

import com.club_app.fixture.annotation.validation.CategoryValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = CategoryValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface CategoryConstraint {
    String message() default "Categoria invalida.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
