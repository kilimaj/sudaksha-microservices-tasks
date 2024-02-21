package dev.kilima.sudaksha.task.employee.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
	
	@ManyToMany
	@JoinTable(
			name = "employee_skils",
			joinColumns = @JoinColumn(name = "employee_id"),
			inverseJoinColumns = @JoinColumn(name = "skill_id"))
	private List<Skills> employeeSkills;
	
	@Column
	private String availability;
	
	@Column(length = 13, columnDefinition = "varchar default 'not assigned'")
	private String projectId;
	
	@Column(columnDefinition = "varchar default 'not assigned'")
	private String projectName;

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

	public List<Skills> getEmployeeSkills() {
		return employeeSkills;
	}

	public void setEmployeeSkills(List<Skills> employeeSkills) {
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

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	
	
}
