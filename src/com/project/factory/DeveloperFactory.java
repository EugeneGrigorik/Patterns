package com.project.factory;

import com.project.Developer;
import com.project.developers.JavaDeveloper;
import com.project.developers.JavaScriptDeveloper;
import com.project.developers.PythonDeveloper;
import com.project.developers.architects.ArchitectJavaDeveloper;
import com.project.developers.architects.ArchitectJavaScriptDeveloper;
import com.project.developers.architects.ArchitectPythonDeveloper;
import com.project.developers.seniors.SeniorJavaDeveloper;
import com.project.developers.seniors.SeniorJavaScriptDeveloper;
import com.project.developers.seniors.SeniorPythonDeveloper;
import com.project.developers.types.DeveloperTypes;

public class DeveloperFactory {

	public Developer createDeveloper(DeveloperTypes type) {
		Developer developer;
		switch (type) {
		case JAVA:
			developer = new JavaDeveloper();
			break;
		case SENIORJAVA:
			developer = new SeniorJavaDeveloper(new JavaDeveloper());
			break;
		case ARCHITECTJAVA:
			developer = new ArchitectJavaDeveloper(new SeniorJavaDeveloper(new JavaDeveloper()));
			break;
		case JAVASCRIPT:
			developer = new JavaScriptDeveloper();	
			break;
		case SENIORJAVASCRIPT:
			developer = new SeniorJavaScriptDeveloper(new JavaScriptDeveloper());
			break;
		case ARCHITECTJAVASCRIPT:
			developer = new ArchitectJavaScriptDeveloper(new SeniorJavaScriptDeveloper(new JavaScriptDeveloper()));
			break;
		case PYTHON:
			developer = new PythonDeveloper();
			break;
		case SENIORPYTHON:
			developer = new SeniorPythonDeveloper(new PythonDeveloper());
			break;
		case ARCHITECTPYTHON:
			developer = new ArchitectPythonDeveloper(new SeniorPythonDeveloper(new PythonDeveloper()));
			break;
		default: 
			throw new IllegalArgumentException("Wrong developer type:" + type);
		}
		return developer;
	}
}
