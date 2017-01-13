package com.fm.xprj.dao;
import java.util.ArrayList;
import java.util.List;

import com.fm.xprj.model.User;

public class UserRepository {
	
	public static User getOneUser(){
		User user=new User();
		user.setName("fuen01");
		user.setEmail("fuen01@xprj.com");
		user.setGender("Male");
		user.setHeight(175);
		user.setWeight(56);
		user.setPhoneNumber("1234567");
		return user;
	}
	public static List<User> getUsers(){
		User user=new User();
		user.setName("fuen02");
		user.setEmail("fuen02@xprj.com");
		user.setGender("Male");
		user.setHeight(175);
		user.setWeight(56);
		user.setPhoneNumber("1234567");
		
		User user1=new User();
		user1.setName("fuen02");
		user1.setEmail("fuen02@xprj.com");
		user1.setGender("Male");
		user1.setHeight(175);
		user1.setWeight(56);
		user1.setPhoneNumber("1234567");
		
		
		
		User user2=new User();
		user2.setName("fuen02");
		user2.setEmail("fuen02@xprj.com");
		user2.setGender("Male");
		user2.setHeight(175);
		user2.setWeight(56);
		user2.setPhoneNumber("1234567");
		
		List<User> users=new ArrayList<>();
		users.add(user);
		users.add(user1);
		users.add(user2);
		return users;
	}

}
