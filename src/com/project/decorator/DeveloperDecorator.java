package com.project.decorator;

import com.project.Developer;

public class DeveloperDecorator implements Developer {

	Developer developer;

	public DeveloperDecorator(Developer developer) {
		super();
		this.developer = developer;
	}

	@Override
	public String makeJob() {
		return developer.makeJob();
	}

}
