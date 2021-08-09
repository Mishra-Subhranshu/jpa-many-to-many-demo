package com.example.jpa;

import com.example.jpa.entity.Course;
import com.example.jpa.entity.Student;
import com.example.jpa.repositories.CourseRepository;
import com.example.jpa.repositories.StudentRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Arrays;
@SpringBootApplication
public class JpaManyToManyDemoApplication {


	public static void main(String[] args) {

		SpringApplication.run(JpaManyToManyDemoApplication.class, args);
	}

}


