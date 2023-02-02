package com.siva.fullstack.studentsystem.service;

import com.siva.fullstack.studentsystem.Repository.StudentRepo;
import com.siva.fullstack.studentsystem.model.Student;
import com.siva.fullstack.studentsystem.pojo.StudentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public String saveStudent(StudentDto stu) {
        Student std = studentRepo.findByNameAndAddress(stu.getName(), stu.getAddress());
        if(Objects.nonNull(std) && stu.getName().equals(std.getName()) && stu.getAddress().equals(std.getAddress())) {
            return "same student is already present";
        }
        Student student = new Student();
        student.setAddress(stu.getAddress());
        student.setName(stu.getName());
        student.setBranch(stu.getBranch());
        student.setWorking(stu.getIsWorking().equals("Yes") ? true : false);

        studentRepo.save(student);
        return "student is added";
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }
}
