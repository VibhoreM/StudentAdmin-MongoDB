package com.practise.StudentAdmin.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practise.StudentAdmin.model.Student;
import com.practise.StudentAdmin.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	Student student;
	
	@Autowired
	StudentRepository studentRepository;
	
	public List<Student> getAllStudents(){
		//List<Student> students = new ArrayList<>(); 
		//studentRepository.findAll().forEach(student -> students.add(student));
		return studentRepository.findAll(); // In case o mongoRepo findAll returns a list already, while crudOps returned iterable
	}
}
