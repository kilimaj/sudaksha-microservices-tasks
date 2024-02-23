package dev.kilima.sudaksha.task.employee.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import dev.kilima.sudaksha.task.employee.entity.EmployeeDetails;
import dev.kilima.sudaksha.task.employee.repository.EmployeeDetailsRepository;
import dev.kilima.sudaksha.task.employee.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeDetailsRepository repo;
	@Override
	public Optional<Long> getMaxId() {
		// TODO Auto-generated method stub
		return repo.getMaxId();
	}

	@Override
	public Optional<EmployeeDetails> checkEmployeeAvailability(String empid) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public String createNewEmployee(EmployeeDetails emp) {
		// TODO Auto-generated method stub
		return null;
	}

}
