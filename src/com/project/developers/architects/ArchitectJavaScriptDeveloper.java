package com.project.developers.architects;

import com.project.Developer;
import com.project.decorator.DeveloperDecorator;

public class ArchitectJavaScriptDeveloper extends DeveloperDecorator{

	public ArchitectJavaScriptDeveloper(Developer developer) {
		super(developer);
	}
	
	public String makeArchitectyre() {
		return "Make JavaScript architectyre";
	}
	
	@Override
	public String makeJob() {
		return super.makeJob() + " and " + makeArchitectyre();
	}
	
	

}
