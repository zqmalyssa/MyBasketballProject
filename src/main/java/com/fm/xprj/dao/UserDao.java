package com.fm.xprj.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.fm.xprj.model.User;

@Repository
public class UserDao implements IUserDao{

	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub

		return UserRepository.getOneUser();
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return UserRepository.getOneUser();
	}

	@Override
	public User getUserByLoginId(String loginId) {
		// TODO Auto-generated method stub
		return UserRepository.getOneUser();
	}

	@Override
	public void deleteUserByid(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return UserRepository.getUsers();
	}

	@Override
	public void reserveMatch(int userId, int matchId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User login(String loginId, String loginPwd) {
		// TODO Auto-generated method stub
		return UserRepository.getOneUser();
	}

}
