package com.siva.fullstack.studentsystem.controller;

import com.siva.fullstack.studentsystem.model.Student;
import com.siva.fullstack.studentsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student) {
        if (Objects.nonNull(student.getName())) {
            studentService.saveStudent(student);
            return "Student is added" + student.getId();
        } else {
            return "student Object is empty";
        }
    }

    @GetMapping("/getAll")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }


}
