package com.cursospring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cursospring.entity.Student;
import com.cursospring.repository.StudentRepository;

@RestController
public class StudentController {

	@Autowired
	StudentRepository studentRepository;
	
	@GetMapping("/estudantes")
	public List<Student> listStudent() {
		return this.studentRepository.findAll();
	}
	
	@GetMapping("/estudante/{id}")
	public Student findStudentById(@PathVariable String id) {
		return this.studentRepository.findOne(id);
	}
	
	@GetMapping("/estudante/{name}/name")
	public List<Student> findByName(@PathVariable String name) {
		return this.studentRepository.findByNameLikeIgnoreCase(name);
	}
	
	@PostMapping("/cadastrar")
	public Student saveStudent(@RequestBody Student studentEntity) {
		return this.studentRepository.save(studentEntity);
	}
	
}
