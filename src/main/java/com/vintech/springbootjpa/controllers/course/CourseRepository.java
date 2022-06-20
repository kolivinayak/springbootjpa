package com.vintech.springbootjpa.controllers.course;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository <Course, String> {
	
}
