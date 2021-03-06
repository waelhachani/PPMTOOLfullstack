package com.wael.ppmtool.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wael.ppmtool.domain.Project;
import com.wael.ppmtool.repositories.ProjectRepository;

@Service
public class ProjectService {
	
	
	@Autowired
	private ProjectRepository projectRepository;
	
	
	public Project saveOrUpdateProject(Project project) {
		//Logic
		
		return projectRepository.save(project);
	}

}
