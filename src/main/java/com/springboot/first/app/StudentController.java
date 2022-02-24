package com.springboot.first.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	//return single object in JSON Format.
	@GetMapping("/student")
	public Student getStudent() {
		return new Student("Bhushan", "Jain");
	}
	
	//Return list
	@GetMapping("/students")
	public List<Student> getStudents() {
		List<Student> students = new ArrayList<>();
		
		students.add(new Student("Bhushan", "Jain"));
		students.add(new Student("Bhushan", "Patil"));
		students.add(new Student("Bhushan", "Patel"));
		students.add(new Student("Bhushan", "Mehra"));
		students.add(new Student("Bhushan", "Kushal"));
		students.add(new Student("Bhushan", "Pawan"));
		
		return students;
	}
	
	//@PathVariable annotation
	@GetMapping("student/{fname}/{lname}")
	public Student getStudentPathVariable(@PathVariable("fname") String fname1, 
			@PathVariable("lname") String lname1) {
		
		return new Student(fname1, lname1);
		
	}
	
	
	// http://localhost:8080/student/query?firstName=Bhushan&lastName=Jain
	@GetMapping("/student/query")
	public Student getStudentRequestParam( 
			@RequestParam(name = "firstName") String fname,
			@RequestParam(name = "lastName") String lname) {
		return new Student(fname, lname);
	}
}
