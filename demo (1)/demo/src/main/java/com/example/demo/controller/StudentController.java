package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import com.example.demo.service.ValidatorService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student/v1")
public class StudentController {
    private final StudentService studentService;
    private final ValidatorService validatorService;

    public StudentController(@Qualifier("studentServiceImpl") StudentService studentService, ValidatorService validatorService) {
        this.studentService = studentService;
        this.validatorService = validatorService;
    }

    @GetMapping
    public void validate(@RequestBody Student student){
         validatorService.validateAll(student);
    }

    @GetMapping("/{id}")
    public Student get(@PathVariable Long id) {
        return studentService.get(id);
    }

    @PostMapping
    public Student create(@RequestBody Student student){
        return studentService.create(student);
    }

    @PutMapping("{id}")
    public Student update(@PathVariable Integer id, @RequestBody Student student){
        return studentService.update(id, student);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id){
        studentService.delete(id);
    }


}
