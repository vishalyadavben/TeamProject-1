package com.example.Test.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Test.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long>{

}
