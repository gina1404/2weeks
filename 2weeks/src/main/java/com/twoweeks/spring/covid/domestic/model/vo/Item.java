package com.twoweeks.spring.covid.domestic.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {

	private double accDefRate;
	private int accExamCnt;
	private int accExamCompCnt;
	private int careCnt;
	private int clearCnt;
	private String createDt;
	private int deathCnt;
	private int decideCnt;
	private int examCnt;
	private int resultNegCnt;
	private int seq;
	private int stateDt;
	private String stateTime;
	private String updateDt;
}
