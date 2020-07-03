package com.project.developers.seniors;

import com.project.Developer;
import com.project.decorator.DeveloperDecorator;

public class SeniorPythonDeveloper extends DeveloperDecorator{

	public SeniorPythonDeveloper(Developer developer) {
		super(developer);
	}

	public String codeReview() {
		return "Make Python code review";
	}

	@Override
	public String makeJob() {
		return super.makeJob() + " and " + codeReview();
	}
}
