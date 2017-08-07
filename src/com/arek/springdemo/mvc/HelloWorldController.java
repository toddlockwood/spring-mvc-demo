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
		
		//Wczytujemy ¿¹danie parametru z html
		String theName = request.getParameter("studentName");
		
		//konwerujemy dan¹ na upperCase
		theName = theName.toUpperCase();
		
		//tworzymy wiadomosæ
		String result = "SIEMA! " +theName;
		
		//dodajemy wiadomoœæ do modelu
		model.addAttribute("message",result);
		
		
		return "helloworld";
	}
	
	
	@RequestMapping("/processFormThree")
	public String processFormThree(@RequestParam("studentName") String theName
			, Model model) {
		
		//konwerujemy dan¹ na upperCase
		theName = theName.toUpperCase();
		
		//tworzymy wiadomosæ
		String result = "Co tam? " +theName;
		
		//dodajemy wiadomoœæ do modelu
		model.addAttribute("message",result);
		
		
		return "helloworld";
	}
}
