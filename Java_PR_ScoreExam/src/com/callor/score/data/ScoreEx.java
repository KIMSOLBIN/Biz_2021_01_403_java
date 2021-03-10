package com.callor.score.data;

import com.callor.score.service.ScoreService;
import com.callor.score.service.impl.ScoreServiceImplV1;

public class ScoreEx {

	public static void main(String[] args) {
		
		ScoreService ssVO = new ScoreServiceImplV1();
		
		ssVO.inputScore();
		ssVO.makeScore();
		ssVO.saveScoreFile();
		ssVO.loadScoreFromFile();
		ssVO.totalAndAvg();
		ssVO.printScore();
	}

}
