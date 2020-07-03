package com.project;

import com.project.composite.Team;
import com.project.developers.types.DeveloperTypes;
import com.project.factory.DeveloperFactory;

public class Main {
	public static void main(String[] args) {
		
		DeveloperFactory factory = new DeveloperFactory();
		
		Developer javaDeveloper = factory.createDeveloper(DeveloperTypes.JAVA);
		Developer seniorJavaDeveloper = factory.createDeveloper(DeveloperTypes.SENIORJAVA);
		Developer architectJavaDeveloper = factory.createDeveloper(DeveloperTypes.ARCHITECTJAVA);
		
		Developer javaScriptDeveloper = factory.createDeveloper(DeveloperTypes.JAVASCRIPT);
		Developer seniorJavaScriptDeveloper = factory.createDeveloper(DeveloperTypes.SENIORJAVASCRIPT);
		Developer architectJavaScriptDeveloper = factory.createDeveloper(DeveloperTypes.ARCHITECTJAVASCRIPT);
		
		Developer pythonDeveloper = factory.createDeveloper(DeveloperTypes.PYTHON);
		Developer seniorPythonDeveloper = factory.createDeveloper(DeveloperTypes.SENIORPYTHON);
		Developer architectPythonDeveloper = factory.createDeveloper(DeveloperTypes.ARCHITECTPYTHON);
		
		Team team = new Team();
		team.addDeveloperInTeam(javaDeveloper);
		team.addDeveloperInTeam(seniorJavaDeveloper);
		team.addDeveloperInTeam(architectJavaDeveloper);
		team.addDeveloperInTeam(javaScriptDeveloper);
		team.addDeveloperInTeam(seniorJavaScriptDeveloper);
		team.addDeveloperInTeam(architectJavaScriptDeveloper);
		team.addDeveloperInTeam(pythonDeveloper);
		team.addDeveloperInTeam(seniorPythonDeveloper);
		team.addDeveloperInTeam(architectPythonDeveloper);
		
		team.createProject();
		
		
	
	}
}
