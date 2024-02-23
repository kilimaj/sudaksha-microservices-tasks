package dev.kilima.sudaksha.task.employee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.kilima.sudaksha.task.employee.entity.EmployeeDetails;
import dev.kilima.sudaksha.task.employee.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	EmployeeService service;
	
	@PostMapping
	public ResponseEntity<String> createNewEmployee(@RequestBody EmployeeDetails employee){
		String empid = service.createNewEmployee(employee);
		String mesg = "Created new EMployee with ID: " + empid;
		return new ResponseEntity<String>(mesg, HttpStatus.CREATED);
	}
	
	@GetMapping("/{empid}")
	public ResponseEntity<String> checkEmployeeAvailability(@PathVariable String empid) {
		Optional<EmployeeDetails> employee = service.checkEmployeeAvailability(empid);
		String availabilty = employee.get().getAvailability();
		return new ResponseEntity<String>(availabilty, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<EmployeeDetails>> getAllEmployees(){
		List<EmployeeDetails> employees = service.getAllEmployees().get();
		return new ResponseEntity<List<EmployeeDetails>>(employees, HttpStatus.OK);
	}
}
