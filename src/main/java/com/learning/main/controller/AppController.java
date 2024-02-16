package com.learning.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.main.entity.Course;
import com.learning.main.entity.Student;
import com.learning.main.service.CourseService;
import com.learning.main.service.StudentService;

@RestController
@RequestMapping("/app")
public class AppController {
	
	@Autowired
	StudentService stuService;
	
	@Autowired
	CourseService courseService;
	@PostMapping("/saveStudent")
	public String saveStudent(@RequestBody Student student) {
		return "Saved Details:"+stuService.saveStudent(student);
	}
	
	@GetMapping("/getStudent/{id}")
	public String saveStudent(@PathVariable(name="id") Integer id) {
		return "Details:"+stuService.getStudent(id);
	}
	
	@PostMapping("/saveCourse")
	public String saveCourse(@RequestBody Course course) {
		return "Saved Details:"+courseService.saveCourse(course);
	}
}
