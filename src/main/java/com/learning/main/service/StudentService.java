package com.learning.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.learning.main.entity.Student;
import com.learning.main.repos.StudentRepo;

@Component
public class StudentService {
	@Autowired
	StudentRepo studentRepo;

	public Student saveStudent(Student student) {
		return studentRepo.save(student);
	}

	public Student getStudent(Integer id) {
		return studentRepo.findById(id).get();
	}
}
