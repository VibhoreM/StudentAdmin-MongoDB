package com.practise.StudentAdmin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practise.StudentAdmin.model.Student;
import com.practise.StudentAdmin.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping("/get/Students")
	public List<Student> getStudents(){
		return studentService.getAllStudents();
	}
	
	@GetMapping("/test")
	public String test() {
		return "Application is active";
	}
}
