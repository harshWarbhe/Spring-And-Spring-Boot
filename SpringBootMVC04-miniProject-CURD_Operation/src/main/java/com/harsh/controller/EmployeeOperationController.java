package com.harsh.controller;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.harsh.model.Employee;
import com.harsh.service.IEmployeeMgmtService;

@Controller
public class EmployeeOperationController {

	@Autowired
	private IEmployeeMgmtService service;

	@GetMapping
	public String showHome() {
		// retrun lvn
		return "home";

	}

	@GetMapping("/emp_report")
	public String showEmployeeReport(Map<String, Object> map) {

		// use service
		Iterable<Employee> itEmps = service.getAllEmployee();

		// put result result in model attribute
		map.put("empList", itEmps);

		return "show_employee_report";

	}

	@GetMapping("/emp_add")
	public String showFormForSaveEmployee(@ModelAttribute("emp") Employee emp) {

		return "register_employee";

	}

	@PostMapping("/emp_add")
	public String saveEmployee(@ModelAttribute("emp") Employee emp, RedirectAttributes attr) {

		// use service
		String msg = service.registerEmployee(emp);

		// keep the result in flashAttribute
		attr.addFlashAttribute("result", msg);

		// return lvn
		return "redirect:emp_report";

	}

	@GetMapping("/emp_edit")
	public String getEmployeeByNO(@RequestParam("no") int no, @ModelAttribute("emp") Employee emp) {

		Employee emp1 = service.getEmployeeByNo(no);

		// copy data
		BeanUtils.copyProperties(emp1, emp);

		return "update_employee";
	}

	@PostMapping("/emp_edit")
	public String editEmployee(RedirectAttributes attr, @ModelAttribute("emp") Employee emp) {

		service.updateEmployee(emp);

		// add the result into flash attribute
		attr.addFlashAttribute("resultMsg", attr);

		return "redirect:emp_report"; 
	}

	@GetMapping("/emp_delete")
	public String deleteEmployee(RedirectAttributes attr, @RequestParam("no") int no) {

		String msg = service.deleteEmployeeByNo(no);

		// keep result in flash Attribute
		attr.addFlashAttribute("resultMsg", msg);

		return "redirect:emp_report";
	}
}
