package com.nitish.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nitish.model.Employee;
import com.nitish.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/home")
	public ModelAndView home(Model m) {
		Employee employee = new Employee();
		m.addAttribute("employee", employee);
		ModelAndView modelAndView = new ModelAndView("register");
		return modelAndView;
	}

	@PostMapping("/register")
	public String register(@ModelAttribute("employee") Employee employee, Model model) {
		employeeService.registerEmployee(employee);
		model.addAttribute("success", "Registered Successfully");

		return "register";
	}

	@GetMapping("/login")
	public String loginDisplay(Model m, HttpSession session) {

		Employee employee = new Employee();

		if (session.getAttribute("employee") != null) {
			session.invalidate();
			System.out.println("here");
			m.addAttribute("success", "You have logout Successfully!!!");
		}
		m.addAttribute("employee", employee);
		return "login";
	}

	@PostMapping("/login")
	public String login(@ModelAttribute("employee") Employee employee, Model model, HttpSession session) {
		Employee employee1 = employeeService.loginStudent(employee);
		System.out.println("employee1" + employee1);
		if (employee1 != null) {
			System.out.println("hello");
			model.addAttribute("employee", employee1);
			session.setAttribute("employee", employee1);
			return "home";
		}
		if (employee1 == null) {
			System.out.println("please give right credentials");
			model.addAttribute("error", "Invalid Credentials");
		}
		return "login";

	}

}
