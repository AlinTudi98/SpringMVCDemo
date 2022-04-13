package com.alint.springlearning.springmvcdemo.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ContactNumberValidator implements
        ConstraintValidator<ContactNumberConstraint, String> {

    @Override
    public void initialize(ContactNumberConstraint contactNumberConstraint){
        System.out.println(">>LOG: Entered init method");
    }

    @Override
    public boolean isValid(String contactField, ConstraintValidatorContext ctx){
        System.out.println(">>LOG: Entered isValid method");
        return contactField != null && contactField.matches("[0-9]+")
                && (contactField.length() > 7) && (contactField.length() < 14);
    }
}
