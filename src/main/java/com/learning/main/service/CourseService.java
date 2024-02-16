package com.learning.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.learning.main.entity.Course;
import com.learning.main.repos.CourseRepo;

@Component
public class CourseService {
	@Autowired
	CourseRepo courseRepo;

	public Course saveCourse(Course course) {
		return courseRepo.save(course);
	}
}
