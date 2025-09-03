package com.harsh.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.harsh.model.Student;

@Controller
public class StrudentOperationController {

	@GetMapping("/")
	public String showHomePage() {
		return "welcome";

	}

	@GetMapping("/register")
	public String showStudentFormData(@ModelAttribute("stud") Student st) {
		System.out.println("StrudentOperationController.showStudentFormData()");
		System.out.println("Model class object data: " + st);

		return "student_register";
	}

	@PostMapping("/register")
	public String registerStudent(Map<String, Object> map, @ModelAttribute("stud") Student st) {

		System.out.println("StrudentOperationController.registerStudent()");
		System.out.println("Model class object data: " + st);
		
		String grade = null;

		if (st.getAvg()>=75) {
			grade= "first class with dist";
		}
		else if (st.getAvg()>=60) {
			grade= "first class";
		}
		else if (st.getAvg()>=50) {
			grade= "second class";
		}
		else if (st.getAvg()>=35) {
			grade= "third class";
		}
		else 
			grade = "FAIL";
		
		map.put("g", grade);
		
		return "show_result";

	}

}
