package com.project.developers.seniors;

import com.project.Developer;
import com.project.decorator.DeveloperDecorator;

public class SeniorJavaDeveloper extends DeveloperDecorator {

	public SeniorJavaDeveloper(Developer developer) {
		super(developer);
	}

	public String codeReview() {
		return "Make Java code review";
	}

	@Override
	public String makeJob() {
		return super.makeJob() + " and " + codeReview();
	}
}
