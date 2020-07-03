package com.project.developers.seniors;

import com.project.Developer;
import com.project.decorator.DeveloperDecorator;

public class SeniorJavaScriptDeveloper extends DeveloperDecorator{

	public SeniorJavaScriptDeveloper(Developer developer) {
		super(developer);
	}
	
	public String codeReview() {
		return "Make JavaScript code review";
	}
	
	@Override
	public String makeJob() {
		return super.makeJob() + " and " + codeReview();
	}
	

}
