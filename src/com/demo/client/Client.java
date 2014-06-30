package com.demo.client;

import java.util.ArrayList;
import java.util.List;

import com.demo.ws.Cat;
import com.demo.ws.HelloWorldws;
import com.demo.ws.User;
import com.demo.ws.imp.HelloWorld;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld stHelloWorld = new HelloWorld();
		
		HelloWorldws stHelloWorldws = stHelloWorld.getHelloWorldPort();
		System.out.println(stHelloWorldws.sayHello("sdgasgjl"));
		
		
		
		User user = new User();
		
		user.setNameString("wumohai");
		user.setAddrString("add");
		user.setAgeInteger(10);
		
		ArrayList<Cat> cats = (ArrayList<Cat>) stHelloWorldws.getCatbyUser(user);
		
		for (Cat cat: cats){
		System.out.println("cat = " + cat.getName());
		}
		
		
	}

}
