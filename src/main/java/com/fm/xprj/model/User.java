package com.fm.xprj.model;

import java.util.Date;

public class User {
	
	private int id;
	private String loginId;
	private String loginPwd;
	private String nickName;
	private String birthDate;
	private String email;
	private String phoneNumber;
	private String teamPosition;
	private int height;
	private double weight;
	private String ranking;
	private String iconUrl;
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
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
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
	public String getIconUrl() {
		return iconUrl;
	}
	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", loginId=" + loginId + ", loginPwd=" + loginPwd + ", nickName=" + nickName
				+ ", birthDate=" + birthDate + ", email=" + email + ", phoneNumber=" + phoneNumber + ", teamPosition="
				+ teamPosition + ", height=" + height + ", weight=" + weight + ", ranking=" + ranking + ", iconUrl="
				+ iconUrl + "]";
	}


}
