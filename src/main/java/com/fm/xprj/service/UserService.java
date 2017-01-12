package com.fm.xprj.service;

import org.springframework.stereotype.Service;

import com.fm.xprj.model.User;

@Service
public class UserService implements IUserService {

	@Override
	public User getUserById(int id) {
	    User user=new User();
	    user.setName("fuen");
	    user.setHeight(175);
	    user.setWeight(56);
		return user;
	}

}
