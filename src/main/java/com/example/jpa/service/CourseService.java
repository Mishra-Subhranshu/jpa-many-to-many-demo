package com.example.jpa.service;

import com.example.jpa.entity.Course;
import com.example.jpa.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getCourse() {
        List<Course> courseList=new ArrayList<>();
        courseRepository.findAll().forEach(course -> courseList.add(course));
        return courseList;
    }

    public void saveCourse(Course course) {
        courseRepository.save(course);
    }
}
