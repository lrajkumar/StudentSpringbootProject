package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Repository
public class Student_Dao {
	@Autowired
	Student_Repo studentrepo;
	public String saveDetails(Student e) {
		studentrepo.save(e);
		return "Saved Successfully";
	}
	
	public Student getDetails(int id) {
		return studentrepo.findById(id).get();
	}
	public String updateInformation(Student e) {
		studentrepo.save(e).getId();
		return "Data Updated";
	}

	public String deleteInformation(Integer id) {
		studentrepo.deleteById(id);
		return "Data has been Deleted";
	}
	
	public List<Student> getList(Student e) {
		return studentrepo.findAll();
	}
	
	public String saveAll(List<Student> e) {
		for(Student i:e) {
			studentrepo.save(i);
		
		}
		return "Saved Successfully";
	}
}
