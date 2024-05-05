package com.example.Test.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Test.entity.Student;
import com.example.Test.inter.StudentInter;
import com.example.Test.repo.StudentRepo;

@Service
public class StudentService implements StudentInter{
	
	@Autowired
	StudentRepo studentRepo;

	@Override
	public void addStudent(Student studentInfo) {
		// TODO Auto-generated method stub
		if(studentInfo != null) {
			studentRepo.save(studentInfo);
		}else {
			System.out.println("empty Data");
		}
		
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return studentRepo.findAll();
	}

	@Override
	public void deleteStudent(Long studentId) {
		// TODO Auto-generated method stub
		studentRepo.deleteById(studentId);
	}

	@Override
	public void updateStudent(Student updateStudent) {
		// TODO Auto-generated method stub
		Optional<Student> existingStudent = studentRepo.findById(updateStudent.getStudentId());
		
		if(existingStudent != null) {
			Student exstudent = existingStudent.get();
			exstudent.setStudentId(updateStudent.getStudentId());
			exstudent.setFirstName(updateStudent.getFirstName());
			exstudent.setLastName(updateStudent.getLastName());
			exstudent.setRollNo(updateStudent.getRollNo());
			exstudent.setAddress(updateStudent.getAddress());
			
			System.out.println(exstudent);
			studentRepo.save(exstudent);
		}else {
			System.out.println("NOt found");
		}
	}

}
