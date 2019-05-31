package com.microservice.service;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.vouser.VOUser;

@RestController
@RequestMapping(path = "/services")
public class RestUser {

	@RequestMapping(method = RequestMethod.POST, 
			path = "/calcu", 
			consumes = "application/json", 
			produces = "application/json")
	public @ResponseBody VOUser validateUser(@RequestBody VOUser user) throws Exception {
		VOUser response = new VOUser();
		//response.setFind(false);
		System.out.println("Num1: " + user.getNum1());
		System.out.println("Num2: " + user.getNum2());
		
	
		//response.setSum(user.getNum1()+user.getNum2());
		//response.setRest(user.getNum1()-user.getNum2());
		response.setNum1(user.getNum1());
		response.setNum2(user.getNum2());
		response.setSum(user.getNum1()+user.getNum2());
		response.setRest(user.getNum1()-user.getNum2());
		
		return response;
		
	}
}
