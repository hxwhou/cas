package com.ibm.cas.service;

import java.util.List;

import com.ibm.cas.dao.entity.Score;
import com.ibm.cas.exception.CASSystemException;

public interface ScoreService {
	
	List<Score> getScoreList() throws CASSystemException;

	void updateScoreById(float score, int id) throws CASSystemException;

	int deleteScoreById(int id) throws CASSystemException;
	
}
