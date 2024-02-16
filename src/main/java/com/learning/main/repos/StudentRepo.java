package com.learning.main.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.main.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
