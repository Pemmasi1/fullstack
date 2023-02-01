package com.siva.fullstack.studentsystem.service;

import com.siva.fullstack.studentsystem.Repository.StudentRepo;
import com.siva.fullstack.studentsystem.model.Student;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface StudentService {



    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
