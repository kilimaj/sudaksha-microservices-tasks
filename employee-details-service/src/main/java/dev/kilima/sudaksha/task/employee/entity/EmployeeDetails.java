package dev.kilima.sudaksha.task.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class EmployeeDetails {
	@Id
	@Column(length = 13)
	private String empid;

	@Column
	private String empname;

	@Column
	private String designation;

	@Column(columnDefinition = "date")
	private String dateOfJoin;

	@Column
	private String employeeSkills;

	@Column
	private String availability;

	@Column(length = 13)
	private String projectId;

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDateOfJoin() {
		return dateOfJoin;
	}

	public void setDateOfJoin(String dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}

	public String getEmployeeSkills() {
		return employeeSkills;
	}

	public void setEmployeeSkills(String employeeSkills) {
		this.employeeSkills = employeeSkills;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	
	

}
