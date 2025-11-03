package com.udemy.learn_jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.udemy.learn_jpa_and_hibernate.course.Course;
import com.udemy.learn_jpa_and_hibernate.course.jpa.CourseJpaRepository;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner{

//	@Autowired
//	private CourseJdbcRepository repository;
	@Autowired
	private CourseJpaRepository repository;
	@Override
	public void run(String... args) throws Exception {
		repository.insert(new Course(1, "Learn AWS now!", "Udemy"));
		repository.insert(new Course(2, "Learn azure now!", "Udemy"));
		repository.insert(new Course(3, "Learn GCP now!", "Udemy"));
//		repository.deleteById(3);
		System.out.println(repository.findById(1));
	}
	
}
