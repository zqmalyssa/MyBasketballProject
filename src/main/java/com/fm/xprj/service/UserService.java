package com.fm.xprj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fm.xprj.dao.IUserDao;
import com.fm.xprj.model.Match;
import com.fm.xprj.model.User;

@Service
@Transactional
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
		userDao.createUser(user);
		user=userDao.getUserById(user.getId());
		return user;
	}

	@Override
	public User getUserByLoginId(String loginId) {
		User user=userDao.getUserByLoginId(loginId);
		return user;
	}

	@Override
	public void deleteUserByid(int id) {
		userDao.deleteUserById(id);
		
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		  userDao.updateUser(user);
		  user=userDao.getUserById(user.getId());
			return user;
		
	}

	@Override
	public List<User> getAllUsers() {
		List<User> users=userDao.getAllUsers();
		return users;
	}

	@Override
	public void reserveMatch(int userId, int matchId) {
		userDao.reserveMatch(userId, matchId);
		
	}

	@Override
	public User logIn(String loginId, String loginPwd) {
		// TODO Auto-generated method stub
		return userDao.login(loginId, loginPwd);
	}

	@Override
	public void cancelReservedMatch(int userId, int matchId) {
		userDao.cancelReservedMatch(userId, matchId);
		
	}

	@Override
	public List<Match> getAllMatches() {
		
		return userDao.getAllMatches();
	}

}
