package com.example.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>
{
	//customized method for finding student using name and roll number
 public List<Student> findByname(String name);
 public Student findByrollno(int rollno);
}
