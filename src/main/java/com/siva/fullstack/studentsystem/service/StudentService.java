package com.siva.fullstack.studentsystem.service;

import com.siva.fullstack.studentsystem.Repository.StudentRepo;
import com.siva.fullstack.studentsystem.model.Student;
import com.siva.fullstack.studentsystem.pojo.StudentDto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface StudentService {



    public String saveStudent(StudentDto student);
    public List<Student> getAllStudents();
}
