package com.example.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Entity.Student;

@Service//service annotation is denoted a class that perform a specific service or methods
public interface StudentService {
 Student addStudent(Student student);
 List<Student> findAllStudent();
 Student updateStudent(Student student);
 void deleteStudent(int rollno);
 List<Student> findByname(String name);
 Student findByrollno(int rollno);
}
