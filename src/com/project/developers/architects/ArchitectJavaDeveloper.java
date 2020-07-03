package com.project.developers.architects;

import com.project.Developer;
import com.project.decorator.DeveloperDecorator;

public class ArchitectJavaDeveloper extends DeveloperDecorator{

	public ArchitectJavaDeveloper(Developer developer) {
		super(developer);
	}

	public String makeArchitectyre() {
		return "Make Java architectyre";
	}

	@Override
	public String makeJob() {
		return super.makeJob() + " and " + makeArchitectyre();
	}

}
