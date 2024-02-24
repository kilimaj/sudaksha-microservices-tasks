package dev.kilima.sudaksha.task.projectservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import dev.kilima.sudaksha.task.projectservice.dao.ProjectDao;
import dev.kilima.sudaksha.task.projectservice.entity.ProjectEntity;
import dev.kilima.sudaksha.task.projectservice.service.ProjectService;

public class ProjectServiceImpl implements ProjectService {

	@Autowired
	ProjectDao dao;

	@Override
	public int addProject(ProjectEntity project) {
		return dao.addProject(project);
	}

	@Override
	public int updateProject(ProjectEntity project) {
		return dao.updateProject(project);
	}

	@Override
	public int deleteProject(int project_id) {
		// TODO Auto-generated method stub
		return dao.deleteProject(project_id);
	}

	@Override
	public List<ProjectEntity> getAllProjects() {
		// TODO Auto-generated method stub
		return dao.getAllProjects();
	}

	@Override
	public ProjectEntity getById(int project_id) {
		// TODO Auto-generated method stub
		return dao.getById(project_id);
	}

}
