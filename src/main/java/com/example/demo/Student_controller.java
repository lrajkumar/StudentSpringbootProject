package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Student_controller {
	@Autowired
	Student_service studentser;
	
	@PostMapping(value="/add")
	
	public String saveDetails(@RequestBody Student e) {
	return	studentser.saveDetails(e);
		}
	@GetMapping(value="/show/{id}")
	public Student getDetails(@PathVariable int id) {
		return studentser.getDetails(id);
		
	}
	@PutMapping(value="/update")
		public String updateInformation(@RequestBody Student e) {
		return studentser.updateInformation(e);
	}
	@DeleteMapping(value="/delete/{id}")
		public String deteleInformation(@PathVariable Integer id) {
			return studentser.deleteInformation(id);
		}
	
	@GetMapping(value="/display")
	public List<Student> getList(@RequestBody Student e) {
		return studentser.getList(e);
		}
	@PostMapping(value="/saveAll")
	public String saveAll(@RequestBody List<Student> e) {
		return studentser.saveAll(e);
	
	}
	
}
