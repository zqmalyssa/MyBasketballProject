package com.fm.xprj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fm.xprj.dao.IUserDao;
import com.fm.xprj.model.User;

@Service
public class UserService implements IUserService {

	@Autowired
	IUserDao userDao;
	@Override
	public User getUserById(int id) {
	    User user=userDao.getUserById(id);
		return user;
	}

	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByLoginId(String loginId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUserByid(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		  user=userDao.getUserById(0);
			return user;
		
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void reserveMatch(int userId, int matchId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User logIn(String loginId, String loginPwd) {
		// TODO Auto-generated method stub
		return userDao.getUserById(0);
	}

}
