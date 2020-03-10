package th.ac.sau.controllers;

import th.ac.sau.models.UserModel;

public class UserController {
	public String getDetail(String name, int age) {
		UserModel user = new UserModel();
		user.setName(name);
		user.setAge(age);
		
		String reslut = "";
		
		if(age <= 25) {
			reslut = " You Are Young";
		}else {
			reslut = " You Are Not Young";
		}
		
		
		return user.getName() + reslut;
	}
}
