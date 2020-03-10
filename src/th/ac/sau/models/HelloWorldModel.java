package th.ac.sau.models;

public class HelloWorldModel {
	public String hello() {
		return "Hello World";
	}
	
	public String helloByName(String name) {
		return "Hello World, " + name.toUpperCase();
	}
}
