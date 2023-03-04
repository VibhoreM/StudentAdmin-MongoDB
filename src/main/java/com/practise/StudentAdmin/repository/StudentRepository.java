package com.practise.StudentAdmin.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.practise.StudentAdmin.model.Student;

public interface StudentRepository extends MongoRepository<Student, String>{

}
