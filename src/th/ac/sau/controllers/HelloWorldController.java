package th.ac.sau.controllers;

import th.ac.sau.models.HelloWorldModel;

public class HelloWorldController {
	public String helloByName(String name) {
		HelloWorldModel model = new HelloWorldModel();
		
		return model.helloByName(name);
	}
	
	public String howAreYou(String name) {
		HelloWorldModel model = new HelloWorldModel();
		
		return model.helloByName(name) + "  How Are You?";
	}
}
