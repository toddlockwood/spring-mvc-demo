package com.arek.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		//tworzymy objekt Student
		Student theStudent = new Student();
		
		//dodajemy obiekt student do modelu
		theModel.addAttribute("student", theStudent);
		
		return "student-form";
	}
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		
		
		return "student-confirmation";
	}
	
}
