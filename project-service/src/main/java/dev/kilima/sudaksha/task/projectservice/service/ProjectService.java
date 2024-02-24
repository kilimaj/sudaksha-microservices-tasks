package dev.kilima.sudaksha.task.projectservice.service;

import java.util.List;

import dev.kilima.sudaksha.task.projectservice.entity.ProjectEntity;

public interface ProjectService {

	int addProject(ProjectEntity project);

	int updateProject(ProjectEntity project);

	int deleteProject(int project_id);

	List<ProjectEntity> getAllProjects();

	ProjectEntity getById(int project_id);

}
