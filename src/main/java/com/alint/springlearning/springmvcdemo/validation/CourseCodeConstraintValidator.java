package com.alint.springlearning.springmvcdemo.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator
        implements ConstraintValidator<CourseCode,String> {

    private String coursePrefix;


    @Override
    public boolean isValid(String code, ConstraintValidatorContext constraintValidatorContext) {
        System.out.println(">>LOG: Entered isValid method");
        if(code != null)
            return code.startsWith(coursePrefix);
        else
            return false;
    }

    @Override
    public void initialize(CourseCode courseCode) {
        System.out.println(">>LOG: Entered init method");
        coursePrefix = courseCode.value();
    }
}
