package com.project.developers.architects;

import com.project.Developer;
import com.project.decorator.DeveloperDecorator;

public class ArchitectPythonDeveloper extends DeveloperDecorator{

	public ArchitectPythonDeveloper(Developer developer) {
		super(developer);
	}
	
	public String makeArchitectyre() {
		return "Make Python architectyre";
	}
	
	@Override
	public String makeJob() {
		return super.makeJob() + " and " + makeArchitectyre(); 
	}
	
	

}
