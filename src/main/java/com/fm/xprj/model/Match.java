package com.fm.xprj.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Match {
	
	private int id;
	private String matchType;
	
	@DateTimeFormat(pattern="yyyy-mm-dd HH:mm")  
	private Date matchDate;
	
	private String matchLocation;
	private String isBooked;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMatchType() {
		return matchType;
	}
	public void setMatchType(String matchType) {
		this.matchType = matchType;
	}
	public Date getMatchDate() {
		return matchDate;
	}
	public void setMatchDate(Date matchDate) {
		this.matchDate = matchDate;
	}
	public String getMatchLocation() {
		return matchLocation;
	}
	public void setMatchLocation(String matchLocation) {
		this.matchLocation = matchLocation;
	}
	public String getIsBooked() {
		return isBooked;
	}
	public void setIsBooked(String isBooked) {
		this.isBooked = isBooked;
	}
	
	public String toString(){
		return "Match [id=" + id + ", matchType=" + matchType + ", matchDate=" + matchDate + ", matchLocation=" + matchLocation
				+ ", isBooked=" + isBooked +"]";
	}

}
