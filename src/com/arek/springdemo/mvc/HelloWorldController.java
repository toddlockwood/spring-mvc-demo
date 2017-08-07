package com.arek.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	
	}
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processFormTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		//Wczytujemy ��danie parametru z html
		String theName = request.getParameter("studentName");
		
		//konwerujemy dan� na upperCase
		theName = theName.toUpperCase();
		
		//tworzymy wiadomos�
		String result = "SIEMA! " +theName;
		
		//dodajemy wiadomo�� do modelu
		model.addAttribute("message",result);
		
		
		return "helloworld";
	}
	
	
	@RequestMapping("/processFormThree")
	public String processFormThree(@RequestParam("studentName") String theName
			, Model model) {
		
		//konwerujemy dan� na upperCase
		theName = theName.toUpperCase();
		
		//tworzymy wiadomos�
		String result = "Co tam? " +theName;
		
		//dodajemy wiadomo�� do modelu
		model.addAttribute("message",result);
		
		
		return "helloworld";
	}
}
