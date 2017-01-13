package com.fm.xprj.dao;

import java.util.List;

import com.fm.xprj.model.User;

public interface IUserDao {
	
	public User createUser(User user);  
	public User getUserById(int id);
	public User getUserByLoginId(String loginId);
	public void deleteUserByid(int id);
	public void updateUser(User user);
	public List<User> getAllUsers();
	public void reserveMatch(int userId,int matchId);
	
	public User login(String loginId,String loginPwd);
	

}
