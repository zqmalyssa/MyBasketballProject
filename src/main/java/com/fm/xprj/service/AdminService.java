package com.fm.xprj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fm.xprj.dao.IAdminDao;
import com.fm.xprj.dao.IUserDao;
import com.fm.xprj.model.Match;


@Service
@Transactional
public class AdminService implements IAdminService{

	@Autowired
	IAdminDao adminDao;
	
	@Override
	public Match createMatch(Match match) {
		// TODO Auto-generated method stub
		adminDao.createMatch(match);
		match = adminDao.getMatchById(match.getId());
		return match;
	}

	@Override
	public Match getMatchById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Match getMatchByDate(String date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteMatchByid(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Match updateMatch(Match match) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Match> getAllMatches() {
		// TODO Auto-generated method stub
		List<Match> lists =  adminDao.getAllMatches();
		return lists;
	}

	@Override
	public List<Match> getMatchesByPage(int pageSize, int pageNow) {
		// TODO Auto-generated method stub
		List<Match> lists =  adminDao.getMatchByPage(pageSize, pageNow);
		return lists;
	}

}
