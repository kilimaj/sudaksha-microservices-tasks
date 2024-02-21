package dev.kilima.sudaksha.task.employee.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class Skills {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int skillId;
	
	@Column
	private String skillName;
	
	@ManyToMany(mappedBy = "employeeSkills")
	private List<EmployeeDetails> employee;

	public int getSkillId() {
		return skillId;
	}

	public void setSkillId(int skillId) {
		this.skillId = skillId;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public List<EmployeeDetails> getEmployee() {
		return employee;
	}

	public void setEmployee(List<EmployeeDetails> employee) {
		this.employee = employee;
	}
	
	
}
