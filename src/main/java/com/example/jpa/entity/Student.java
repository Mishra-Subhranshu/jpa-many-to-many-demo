package com.example.jpa.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name="age")
    private int age;
    @Column(name="grade")
    private String grade;

//    @ManyToMany(fetch = FetchType.LAZY,cascade = {CascadeType.PERSIST,CascadeType.MERGE})
//    @JoinTable(name ="student_courses", joinColumns = {
//            @JoinColumn (name = "student_id")},
//            inverseJoinColumns = {
//            @JoinColumn(name = "course_id") })

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "STUDENT_COURSE",
               joinColumns = {@JoinColumn(name = "STUDENT_ID")},
               inverseJoinColumns = { @JoinColumn(name = "COURSE_ID")})

    private List<Course> courses=new ArrayList<>();

//    private Set<Course> courses=new HashSet<>();

    public Student() {

    }
    public Student(String name,int age,String grade) {
        this.name=name;
        this.age=age;
        this.grade=grade;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    //    public Set<Course> getCourses() {
//        return courses;
//    }
//
//    public void setCourses(Set<Course> courses) {
//        this.courses = courses;
//    }
}
