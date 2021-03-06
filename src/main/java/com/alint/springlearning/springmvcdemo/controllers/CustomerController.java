  package com.alint.springlearning.springmvcdemo.controllers;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alint.springlearning.springmvcdemo.models.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		theModel.addAttribute("customer",new Customer());
		
		return "customer-form";
	}
	
	@RequestMapping("/processForm")
	public String processCustomer(@Valid @ModelAttribute("customer")Customer customer,
			BindingResult theBindingResult) {
		System.out.println(">>LOG: Last name: |" + customer.getLastName() + "|");
		System.out.println(">>LOG: bidingResult: " + theBindingResult);
		if(theBindingResult.hasErrors())
			return "customer-form";
		
		return "customer-confirmation";
	}

}
