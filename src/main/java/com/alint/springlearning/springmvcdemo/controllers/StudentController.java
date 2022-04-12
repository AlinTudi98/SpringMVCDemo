package com.alint.springlearning.springmvcdemo.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alint.springlearning.springmvcdemo.models.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Value("#{countryOptions}")
	private Map<String,String> countryOptions;
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		Student student = new Student();
		
		theModel.addAttribute("student", student);
		theModel.addAttribute("theCountryOptions",countryOptions);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		
		System.out.println(">>Log -> theStudent: " + theStudent.getFirstName() +
				" " + theStudent.getLastName());
		
		return "student-confirmation";
	}
}
