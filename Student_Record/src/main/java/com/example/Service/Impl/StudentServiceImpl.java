package com.example.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Entity.Student;
import com.example.Repository.StudentRepository;
import com.example.Service.StudentService;

@Repository//this annotation indicate that the class provide mechanism for save,fetch ,update and delete operation on object.
public class StudentServiceImpl implements StudentService {
    @Autowired //for dependency injection,inject the data
	StudentRepository studentRepository;
	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public List<Student> findAllStudent() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		Student _student=studentRepository.findByrollno(student.getRollno());
		_student.setRollno(student.getRollno());
		_student.setName(student.getName());
		_student.setEmail(student.getEmail());
		_student.setAge(student.getAge());
		_student.setAddress(student.getAddress());
		return studentRepository.save(_student);
	}

	@Override
	public void deleteStudent(int rollno) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(rollno);
	}

	@Override
	public List<Student> findByname(String name) {
		// TODO Auto-generated method stub
		return studentRepository.findByname(name);
	}

	@Override
	public Student findByrollno(int rollno) {
		// TODO Auto-generated method stub
		return studentRepository.findByrollno(rollno);
	}

}
