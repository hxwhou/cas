package com.ibm.cas.subb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.logging.LogLevel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.cas.dao.entity.Score;
import com.ibm.cas.exception.CASSystemException;
import com.ibm.cas.log.LoggerContext;
import com.ibm.cas.service.ScoreService;


@RestController
@RequestMapping("/rest/cas/v1/score")
public class ScoreController {
	
	@Autowired
	private ScoreService scoreService;
	
	@RequestMapping("/list")
	public List<Score> getScoreList() throws CASSystemException{
		LoggerContext.recordLog("从数据库读取Score表数据", LogLevel.INFO);
		return scoreService.getScoreList();
	}
	
	@RequestMapping("/update")
	public void updateScoreById() throws CASSystemException{
		LoggerContext.recordLog("更新Score表中的数据", LogLevel.INFO);
		scoreService.updateScoreById(88.8f, 2);
	}
	
	@RequestMapping("/delete")
	public int deleteScoreById() throws CASSystemException{
		LoggerContext.recordLog("删除Score表中的指定数据", LogLevel.INFO);
		return scoreService.deleteScoreById(1);
	}

}
