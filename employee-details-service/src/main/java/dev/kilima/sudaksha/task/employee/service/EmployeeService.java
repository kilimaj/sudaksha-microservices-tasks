package dev.kilima.sudaksha.task.employee.service;

import java.util.Optional;

import dev.kilima.sudaksha.task.employee.entity.EmployeeDetails;

public interface EmployeeService {
	Optional<Long> getMaxId();
	Optional<EmployeeDetails> checkEmployeeAvailability(String empid);
	String createNewEmployee(EmployeeDetails emp);
}
