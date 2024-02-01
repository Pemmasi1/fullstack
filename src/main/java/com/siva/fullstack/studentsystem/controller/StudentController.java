package com.siva.fullstack.studentsystem.controller;

import com.siva.fullstack.studentsystem.model.Student;
import com.siva.fullstack.studentsystem.pojo.StudentDto;
import com.siva.fullstack.studentsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity add(@RequestBody StudentDto student) {
        if (!student.getName().isEmpty() || !student.getAddress().isEmpty()) {
            String res = studentService.saveStudent(student);
            if("student is added".equals(res)){
                return new ResponseEntity<>("student is added", HttpStatus.NO_CONTENT);
            } else if ("same student is already present".equals(res)) {
                return new ResponseEntity<>(res, HttpStatus.BAD_REQUEST);
            }
        }
            return new ResponseEntity<>("student Object is empty", HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/getAll")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }


}
