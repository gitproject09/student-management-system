package com.sopan.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sopan.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
