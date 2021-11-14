package com.example.ATTENDANCECRUD.StudentController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.ATTENDANCECRUD.Entity.Studententity;
import com.example.ATTENDANCECRUD.Entity.dummyentity;
import com.example.ATTENDANCECRUD.Studentrepository.Studentrepository;


@Controller

public class Studentcontroller {
	
	@Autowired
	Studentrepository stu;
	
	@RequestMapping("/login")
	public String login()
	{
		return "login";
	}
	
	@RequestMapping("/details")
	public String mydetails()
	{
		return "index";
	}
	
	@RequestMapping("/staff")
	public String staffwork()
	{
		return "staff";
	}

	@GetMapping("/getdetails")
	public String[] getdetails()
	{
		String[] studentdetails=stu.studentcheck();//repository ku thevaiyanadhu string array a varum

			return studentdetails;
	}
	
	@PostMapping(path="/staff",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<dummyentity> valuepass(@RequestBody Studententity stuen)
	{
		System.out.println(stuen.getAssignments());
		System.out.println(stuen.getMarksobtained());
		System.out.println(stuen.getRemark());
		System.out.println(stuen.getStudentName());

		System.out.println(stuen.getSubjects());
		System.out.println(stuen.getClass());
		stu.save(stuen);
		dummyentity de = new dummyentity();
		de.setMp("saved successfukky");
		
		return new ResponseEntity<>(de,HttpStatus.CREATED);	
		
	}
	


	
}
