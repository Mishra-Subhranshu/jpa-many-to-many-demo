package com.example.jpa.service;

import com.example.jpa.entity.Student;
import com.example.jpa.repositories.StudentRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepositories studentRepositories;

    public List<Student> getStudent() {
        List<Student> studentList=new ArrayList<>();
        studentRepositories.findAll().forEach(student -> studentList.add(student));
        return studentList;
    }

    public void save(Student student) {
        studentRepositories.save(student);

    }
}
