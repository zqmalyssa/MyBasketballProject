package com.fm.xprj.model;

import java.util.Date;

public class User {
	
	private int id;
	private String loginId;
	private String loginPwd;
	private String name;
	private String nickName;
	private String gender;
	private String email;
	private String phoneNumber;
	private String birthDate;
	private String teamPosition;
	private int height;
	private double weight;
	private String ranking;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getLoginPwd() {
		return loginPwd;
	}
	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getTeamPosition() {
		return teamPosition;
	}
	public void setTeamPosition(String teamPosition) {
		this.teamPosition = teamPosition;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getRanking() {
		return ranking;
	}
	public void setRanking(String ranking) {
		this.ranking = ranking;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", nickName=" + nickName + ", gender=" + gender + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + ", birthDate=" + birthDate + ", teamPosition=" + teamPosition
				+ ", height=" + height + ", weight=" + weight + ", ranking=" + ranking + "]";
	}
	
	
	

}
