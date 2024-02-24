package dev.kilima.sudaksha.task.projectservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.kilima.sudaksha.task.projectservice.entity.ProjectEntity;
import dev.kilima.sudaksha.task.projectservice.service.ProjectService;

@RestController
@RequestMapping("/projects")
public class ProjectController {

	@Autowired
	ProjectService service;
	
	@PostMapping
	public ResponseEntity<String> addProject(@RequestBody ProjectEntity project) {
		String mesg;
		int rows = service.addProject(project);
		if (rows > 0)
			mesg = "inserted";
		else
			mesg = "not-inserted";
		return new ResponseEntity<String>(mesg, HttpStatus.CREATED);
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> updateProject(@RequestBody ProjectEntity project) {
		String mesg;
		int rows = service.updateProject(project);
		if (rows > 0)
			mesg = "updated";
		else
			mesg = "not-updated";
		return new ResponseEntity<String>(mesg, HttpStatus.OK);

	}
	
	@DeleteMapping("/{project_id}")
	public ResponseEntity<String> deleteProject(@PathVariable int project_id) {
		String mesg;
		int rows = service.deleteProject(project_id);
		if (rows > 0)
			mesg = "deleted";
		else
			mesg = "not-deleted";
		return new ResponseEntity<String>(mesg, HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<ProjectEntity>> getAllProjects() {
		List<ProjectEntity> allProj = service.getAllProjects();
		return new ResponseEntity<List<ProjectEntity>>(allProj, HttpStatus.OK);
	}

	@GetMapping("/{project_id}")
	public ResponseEntity<ProjectEntity> getProjectById(@PathVariable int project_id) {
		ProjectEntity project = service.getById(project_id);
		return new ResponseEntity<ProjectEntity>(project, HttpStatus.OK);
	}
}
