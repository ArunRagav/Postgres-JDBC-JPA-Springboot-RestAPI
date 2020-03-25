package com.javatakies.postgres.controller;

import java.util.HashMap;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatakies.postgres.exception.ResourceNotFoundException;
import com.javatakies.postgres.model.StudentEntity;
import com.javatakies.postgres.repos.StudentRepo;

@RestController
@RequestMapping("/college/student-info/")
public class AppController {
	/*
	 * create data --POST (repo --save(entity)) 
	 * get all data[LIST] --GET (repo --findAll()) 
	 * get data using id --GET 
	 * update data using id --PUT 
	 * delete data --DELETE
	 * 
	 */
	@Autowired
	StudentRepo studentRepo;

	// json to java obj to postgresql table
	@PostMapping("student")
	public StudentEntity createStudent(@RequestBody StudentEntity student) {
		/*
		 * use postman app, from StudentEntity class[each args are each colm] post
		 * request like following: { "Id": 1, "name": "Arun ragavan", "dept": "CSE",
		 * "grade": "A+" }
		 */

		return this.studentRepo.save(student);
	}

	@GetMapping("students")
	public List<StudentEntity> StudentsList() {
		return this.studentRepo.findAll();

	}
	
	@GetMapping("student/{id}")
	public ResponseEntity<StudentEntity> getStudentByID(@PathVariable(name = "id") int id) throws ResourceNotFoundException {
		StudentEntity se1 = studentRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Id not found"+id));
		
		return ResponseEntity.ok().body(se1);

	}
	
	
	@PutMapping("student/{id}")
	public ResponseEntity<StudentEntity> updateStudentData(@PathVariable(value = "id") int id,
			@Valid @RequestBody StudentEntity se) throws ResourceNotFoundException {
		//handle exception using custom exception if no ID
		StudentEntity se1 = studentRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Id not found"+id));
		se1.setDept(se.getDept());
		se1.setGrade(se.getGrade());
		se1.setId(se.getId());
		se1.setName(se.getName());
		//master piece of update
		final StudentEntity updatedStudent = studentRepo.save(se1);
		return ResponseEntity.ok().body(updatedStudent);
	}
	
	@DeleteMapping("student/{id}")
	public HashMap<String, Boolean> deleteStudent(@PathVariable(name = "id") int id) throws ResourceNotFoundException {
		StudentEntity se1 = studentRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("id not found : "+id));
		studentRepo.delete(se1);
		HashMap< String, Boolean> map = new HashMap<String, Boolean>();
		map.put("deleted", true);
		
		return map;
	}
}
