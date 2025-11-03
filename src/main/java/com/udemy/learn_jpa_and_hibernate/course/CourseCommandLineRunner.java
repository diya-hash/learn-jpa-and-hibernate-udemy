package com.udemy.learn_jpa_and_hibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.udemy.learn_jpa_and_hibernate.course.Course;
import com.udemy.learn_jpa_and_hibernate.course.jpa.CourseJpaRepository;
import com.udemy.learn_jpa_and_hibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{

//	@Autowired
//	private CourseJdbcRepository repository;
	
//	@Autowired
//	private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	@Override
	public void run(String... args) throws Exception {
		repository.save(new Course(1, "Learn AWS now!", "Udemy"));
		repository.save(new Course(2, "Learn azure now!", "Udemy"));
		repository.save(new Course(3, "Learn GCP now!", "Udemy"));
		System.out.println(repository.findById(1l));
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		System.out.println(repository.findByAuthor("Udemy"));
		System.out.println(repository.findByName("Learn AWS now!"));
	}
}
