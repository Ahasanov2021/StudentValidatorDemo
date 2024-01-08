package com.example.demo.service;

import com.example.demo.model.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
public class StudentSubscriptionValidator implements Validator{
    @Override
    public boolean validate(Student student) {
        boolean b = false;
        if(student.getSubscriptionStatus().equals("passive")) {
            System.out.println("Your subscription status is no longer active!");
            b = false;
        }
        else if(student.getSubscriptionStatus().equals("active")) {
            System.out.println("Your subscription status is still active!");
            b = true;
        }
        return b;
    }
}
