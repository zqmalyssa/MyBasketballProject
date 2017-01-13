package com.fm.xprj.service;


import java.util.List;

import com.fm.xprj.model.User;

public interface IUserService {
	
	public User createUser(User user);  
	public User getUserById(int id);
	public User getUserByLoginId(String loginId);
	public void deleteUserByid(int id);
	public User updateUser(User user);
	public List<User> getAllUsers();
	public void reserveMatch(int userId,int matchId);
	
	
	public User logIn(String loginId,String loginPwd);
	
	

}
