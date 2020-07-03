package com.project.composite;

import java.util.ArrayList;
import java.util.List;

import com.project.Developer;

public class Team {
	
	private List<Developer> developers = new ArrayList<Developer>();
	
	public void addDeveloperInTeam(Developer developer) {
		developers.add(developer);
	}
	
	public void createProject() {
		for (Developer developer : developers) {
			System.out.println(developer.makeJob());
		}
	}
}
