package com.example.demo.service;

import com.example.demo.model.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class StudentServiceImpl implements StudentService{


    @Override
    public Student create(Student student) {
        log.info("Student service create method is working");
        return null;
    }

    @Override
    public Student update(Integer id, Student student){
        log.info("Student service update method is working");
        return null;
    }

    @Override
    public void delete(Integer id){
        log.info("Student service delete method is working");
    }

    @Override
    public Student get(Long id) {
        log.info("Student service update method is working");
        return null;
    }
}
