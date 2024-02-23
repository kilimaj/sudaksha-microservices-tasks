package dev.kilima.sudaksha.task.employee.service.impl;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import dev.kilima.sudaksha.task.employee.entity.EmployeeDetails;
import dev.kilima.sudaksha.task.employee.repository.EmployeeDetailsRepository;
import dev.kilima.sudaksha.task.employee.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDetailsRepository repo;

	@Override
	public Optional<Integer> getMaxId() {
		// TODO Auto-generated method stub
		return repo.getMaxId();
	}

	@Override
	public Optional<EmployeeDetails> checkEmployeeAvailability(String empid) {
		Optional<EmployeeDetails> employee = repo.findById(empid);
		return employee;
	}

	@Override
	public String createNewEmployee(EmployeeDetails emp) {
		Optional<Integer> id = getMaxId();
		if (id.isEmpty())
			id = Optional.of(1000);
		else {
			int employeeId = id.get().intValue();
			id = Optional.of(employeeId + 2);
		}

		emp.setEmpid("EMP" + id.toString() + LocalDate.now().getYear());
		String dateOfJoin = LocalDate.now().toString();
		emp.setDateOfJoin(dateOfJoin);
		emp.setAvailability("Not assigned");
		repo.save(emp);
		return emp.getEmpid();
	}

}
