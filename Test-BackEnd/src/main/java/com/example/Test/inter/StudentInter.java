package com.example.Test.inter;

import java.util.List;

import com.example.Test.entity.Student;

public interface StudentInter {
	public void addStudent(Student studentInfo);
	public List<Student> getAllStudent();
	public void deleteStudent(Long studentId);
	public void updateStudent(Student updateStudent);
}
