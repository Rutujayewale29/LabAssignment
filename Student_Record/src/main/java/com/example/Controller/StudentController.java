package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Student;
import com.example.Service.StudentService;

@RestController//creation of RESTful web services
public class StudentController {
@Autowired//used for dependency injection
StudentService studentService;
@PostMapping("/student")//maps HTTP POST requests onto specific handler method
 public Student addStudent(@RequestBody Student student)
 {
	System.out.println(student.getName());
	return studentService.addStudent(student);
	
 }
@GetMapping("/student")//for get the data
public List<Student> findAllStudent()
{
	return studentService.findAllStudent();
	
}
@GetMapping("/student/{rollno}")//get the specific  data
public Student findByrollno(@PathVariable int rollno)
{
	return studentService.findByrollno(rollno);
}
@GetMapping("/student/{name}")
public List<Student> findByname(@PathVariable String name)
{
 return studentService.findByname(name);	
}
@PutMapping("/student")//for update data
public Student updateStudent(@RequestBody Student student)
{
	return studentService.updateStudent(student);
}
@DeleteMapping("/student/{rollno}")//delete any specific data
public String deleteStudent(@PathVariable int rollno)
{
	studentService.deleteStudent(rollno);
	return "Record is deleted";
 	
}
}
