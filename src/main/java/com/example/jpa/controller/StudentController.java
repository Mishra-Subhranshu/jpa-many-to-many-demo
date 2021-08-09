package com.example.jpa.controller;

import com.example.jpa.entity.Course;
import com.example.jpa.entity.Student;
import com.example.jpa.service.CourseService;
import com.example.jpa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/get")
    public List<Student> getStudent() {
        return studentService.getStudent();
    }

    @PostMapping("/save")
    public long save( @RequestBody Student student) {
        studentService.save(student);
        return student.getId();

    }

    @Autowired
    private CourseService courseService;

    @GetMapping("/list")
    public List<Course> getCourse() {
        return courseService.getCourse();
    }

    @PostMapping("/post")
    public long saveCourse(@RequestBody Course course) {
        courseService.saveCourse(course);
        return course.getId();
    }

}
