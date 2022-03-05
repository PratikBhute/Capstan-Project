package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@Controller
public class EmployeeController {

	//display list of employee
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/")
	public String ViewHomePage(Model model) 
	{
		model.addAttribute("listEmployee",employeeService.getAllEmployees());
		return "index";
	}
	@GetMapping("/showNewEmployeeform")
	public String showNewEmployeeform(Model model) {
		Employee employee=new Employee();
		model.addAttribute("employee", employee);
		return "new_employee";
		
	}
	@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {
		employeeService.saveEmployee(employee);
		return "redirect:/" ; 		
	}
	@GetMapping("/showFormforUpdate/{id}")
	public String showFormforUpdate(@PathVariable (value = "id") long id, Model model) {
		Employee employee=employeeService.getEmployeeById(id);
		model.addAttribute("employee", employee);
		return "update_employee";
	}
	
	@GetMapping("/deleteEmployee/{id}")
	public String deleteEmployee (@PathVariable (value = "id") long id, Model model) {
		this.employeeService.deleteEmployee(id);
		return "redirect:/";
	}
	
}
