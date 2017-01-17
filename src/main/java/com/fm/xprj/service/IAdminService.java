package com.fm.xprj.service;


import java.util.List;

import com.fm.xprj.model.Match;

public interface IAdminService {
	
	public Match createMatch(Match match);  
	public Match getMatchById(int id);
	public Match getMatchByDate(String date);
	public void deleteMatchByid(int id);
	public Match updateMatch(Match match);
	public List<Match> getAllMatches();
	public List<Match> getMatchesByPage(int pageSize, int pageNow);
	
	
	

}
