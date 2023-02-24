package com.example.demo.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Entity.StudentDemo;
import com.example.demo.Repository.StudentRepo;
@Service
public class StudentService 
{
	@Autowired
	StudentRepo stRepo;
	public StudentDemo saveDetails(StudentDemo e)
	{
		return stRepo.save(e);
	}
	
	public List<StudentDemo> getDetails()
	{
		return stRepo.findAll();
	}
	public StudentDemo updateDetails(StudentDemo e1)
	{
		return stRepo.saveAndFlush(e1);
	}
	public void deleteDetails(int Id)
	{
		stRepo.deleteById(Id);
	}
	
	
}
