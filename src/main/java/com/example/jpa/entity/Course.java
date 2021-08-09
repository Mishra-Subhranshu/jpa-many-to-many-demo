package com.example.jpa.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "title")
    private String title;
    @Column(name = "abbreviation")
    private String abbreviation;
    @Column(name = "modules")
    private int modules;
    @Column(name="fee")
    private double fee;

//    @ManyToMany(fetch = FetchType.LAZY,cascade = {
//            CascadeType.PERSIST,
//            CascadeType.MERGE
//    },
//            mappedBy = "courses")
//    private Set<Student>students=new HashSet<>();

    @ManyToMany(mappedBy="courses")
    private List<Student> students = new ArrayList<>();

    public Course() {

    }
    public Course(String title,String abbreviation,int modules,double fee) {
        this.title=title;
        this.abbreviation=abbreviation;
        this.modules=modules;
        this.fee=fee;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public int getModules() {
        return modules;
    }

    public void setModules(int modules) {
        this.modules = modules;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }



//    public Set<Student> getStudents() {
//        return students;
//    }
//
//    public void setStudents(Set<Student> students) {
//        this.students = students;
//    }
}
