package com.ibm.cas.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.cas.dao.IScoreDao;
import com.ibm.cas.dao.entity.Score;
import com.ibm.cas.exception.CASSystemException;
import com.ibm.cas.service.ScoreService;


@Service
public class ScoreServiceImpl implements ScoreService {
	
	@Autowired
	private IScoreDao scoreDao;

	@Override
	public List<Score> getScoreList() throws CASSystemException {
		
		return scoreDao.getScoreList();
	}

	@Override
	public void updateScoreById(float score, int id) throws CASSystemException {
		scoreDao.updateScoreById(score, id);
	}

	@Override
	public int deleteScoreById(int id) throws CASSystemException {
		return scoreDao.deleteScoreById(id);
	}

}
