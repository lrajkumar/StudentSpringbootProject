package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Student_service {
	@Autowired
	Student_Dao studentdao;
	public String saveDetails(Student e) {
	return	studentdao.saveDetails(e);
	}

	public Student getDetails(int id) {
		return studentdao.getDetails(id);
		
	}
	public String updateInformation(Student e) {
		return studentdao.updateInformation(e);
	}
	public String deleteInformation(Integer id) {
		return studentdao.deleteInformation(id);
	}
	
	public List<Student> getList(Student e) {
		return studentdao.getList(e);
	}
	
	public String saveAll(List<Student> e) {
		return studentdao.saveAll(e);
		
	}
}
