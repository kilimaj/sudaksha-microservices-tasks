package dev.kilima.sudaksha.task.projectservice.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import dev.kilima.sudaksha.task.projectservice.entity.ProjectEntity;

@Mapper
public interface ProjectDao {

	@Insert("insert into projects values (#{project_id},#{title}, #{teamsize}, #{duration})")
	int addProject(ProjectEntity project);

	@Update("update projects set title=#{title}, teamsize=#{teamsize}, duration=#{duration}")
	int updateProject(ProjectEntity project);

	@Delete("delete from projects where project_id=#{project_id}")
	int deleteProject(int project_id);

	@Select("select * from projects")
	List<ProjectEntity> getAllProjects();

	@Select("select * from projects where project_id=#{project_id}")
	ProjectEntity getById(int project_id);

}
