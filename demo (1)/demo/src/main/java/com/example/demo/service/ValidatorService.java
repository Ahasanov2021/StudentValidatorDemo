package com.example.demo.service;

import com.example.demo.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ValidatorService {

    private final List<Validator> validator;

    private final StudentAgeValidator studentAgeValidator;
    private final StudentStatusValidator studentStatusValidator;
    private final StudentSubscriptionValidator studentSubscriptionValidator;

    public ValidatorService(List<Validator> validator, StudentAgeValidator studentAgeValidator, StudentStatusValidator studentStatusValidator, StudentSubscriptionValidator studentSubscriptionValidator) {
        this.validator = validator;
        this.studentAgeValidator = studentAgeValidator;
        this.studentStatusValidator = studentStatusValidator;
        this.studentSubscriptionValidator = studentSubscriptionValidator;
    }

    public void validateAll(Student student) {
        validator.forEach(validator1 -> validator1.validate(student));
    }
}
