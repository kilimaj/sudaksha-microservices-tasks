package dev.kilima.sudaksha.task.projectservice.entity;

public class ProjectEntity {

	private int project_id;

	private String title;

	private int teamSize;

	private String duration;

	public int getProjectid() {
		return project_id;
	}

	public void setProjectid(int projectid) {
		this.project_id = projectid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}
	
}
