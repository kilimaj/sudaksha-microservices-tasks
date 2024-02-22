package dev.kilima.sudaksha.task.employee.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import dev.kilima.sudaksha.task.employee.entity.EmployeeDetails;
@Repository
public interface EmployeeDetailsRepository extends JpaRepository<EmployeeDetails, String>{
	@Query(value = "select max(emp.empid) from EmployeeDetails emp")
	Optional<Long> getMaxId();

	@Query(value = "select emp.availability from EmployeeDetails emp where emp.empid=?1")
	String checkAvailability(String empid);

	@Query(value = "select emp from EmployeeDetails emp where emp.empid=?1")
	EmployeeDetails getEmployeeDetailsById(String empid);
}
