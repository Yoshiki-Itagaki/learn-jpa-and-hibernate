package com.in28minutes.springboot.learn_jpa_and_hibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springboot.learn_jpa_and_hibernate.course.Course;
import com.in28minutes.springboot.learn_jpa_and_hibernate.course.jdbc.CourseJdbcRepository;
import com.in28minutes.springboot.learn_jpa_and_hibernate.course.jpa.CourseJpaRepository;
import com.in28minutes.springboot.learn_jpa_and_hibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
	
//	@Autowired
//	private CourseJpaRepository repository;
//	@Autowired
//	private CourseJdbcRepository repository;
	@Autowired
	private CourseSpringDataJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {
		// JDBC & JPA
//		repository.insert(new Course(1, "Learn AWS Now", "in28minutes"));
//		repository.insert(new Course(2, "Learn Azure Now", "in28minutes"));
//		repository.insert(new Course(3, "Learn DevOps Now", "in28minutes"));
//		repository.insert(new Course(4, "Learn GCP Now", "in28minutes"));
//		
//		repository.deleteById(1);
//		
//		System.out.println(repository.findById(2));
//		System.out.println(repository.findById(3));
		
		// Spring Data JPA
		repository.save(new Course(1, "Learn AWS Now", "in28minutes"));
		repository.save(new Course(2, "Learn Azure Now", "in28minutes"));
		repository.save(new Course(3, "Learn DevOps Now", "in28minutes"));
		repository.save(new Course(4, "Learn GCP Now", "in28minutes"));
		
		repository.deleteById(1l);
		
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));		
		
	}
		

}
