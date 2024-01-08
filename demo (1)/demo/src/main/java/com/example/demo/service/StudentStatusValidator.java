package com.example.demo.service;

import com.example.demo.model.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
public class StudentStatusValidator implements Validator {
    @Override
    public boolean validate(Student student) {
        boolean b = false;
        if(student.getStudentStatus().equals("passive")) {
            System.out.println("Your student status is no longer active!");
            b = false;
        }
        else if(student.getStudentStatus().equals("active")) {
            System.out.println("Your student status is still active!");
            b = true;
        }
        return b;

    }
}
