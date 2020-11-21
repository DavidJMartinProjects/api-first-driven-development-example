package com.apidrivenfirst.demo;

import org.openapitools.api.StudentsApi;
import org.openapitools.model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController implements StudentsApi {

	@Override
	public ResponseEntity<Student> getStudents() {
		return new ResponseEntity<Student>(new Student().id(100).name("John Doe").age(30), HttpStatus.OK);
	}
	
}
