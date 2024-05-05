package com.example.Test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Test.entity.Student;
import com.example.Test.inter.StudentInter;

@CrossOrigin("*")
@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentInter studentInter;
	
	StudentController(StudentInter studentInter){
		this.studentInter = studentInter;
	}
	
	@PostMapping("/addStudent")
	public void addStudent(@RequestBody Student studentInfo) {
	    System.out.println(studentInfo);
		studentInter.addStudent(studentInfo);
	}
	
	@GetMapping("/getStudent")
	public List<Student> getAllStudent(){
		return studentInter.getAllStudent();	
		}
	
	@DeleteMapping("/{studentId}")
	public void deleteStudent(@PathVariable Long studentId ) {
		System.out.println(studentId);
		studentInter.deleteStudent(studentId);
	}
	
	@PutMapping("/updateStudent")
	public void updateStudent(@RequestBody Student updateStudent) {
		studentInter.updateStudent(updateStudent);
	}
	
}
