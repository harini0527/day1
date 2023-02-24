package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.StudentDemo;
import com.example.demo.Service.StudentService;

@RestController
public class StudentController {
	@Autowired 
	StudentService stuService;
	
	@PostMapping("/addDetails")
	public StudentDemo addinfo(@RequestBody StudentDemo st) {
		return stuService.saveDetails(st);
	}
	@GetMapping("/showDetails")
	public List<StudentDemo> fetchDetails()
	{
		return stuService.getDetails();
	}
	@PutMapping("/updateDetails")
	public StudentDemo updateInfo(@RequestBody StudentDemo st1)
	{
		return stuService.updateDetails(st1);
	}
	@DeleteMapping("/deleteDetails/{sid}")
	public String deleteInfo(@PathVariable("sid") int sid) {
		stuService.deleteDetails(sid);
		
		return "Details is Deleted";
		//return stuService.getDetails();
		
	}
}