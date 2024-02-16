package com.learning.main.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.main.entity.Course;

public interface CourseRepo extends JpaRepository<Course, Integer> {

}
