package com.example.demo.service;

import com.example.demo.model.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
public class StudentAgeValidator implements Validator{
    @Override
    public boolean validate(Student student) {
        if(student.getAge() > 22) {
            System.out.println("Failed age restriction!");
            return false;
        }
        else {
            System.out.println("Passed age restriction!");
            return true;
        }

    }
}
