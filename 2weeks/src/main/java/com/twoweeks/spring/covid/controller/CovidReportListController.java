package com.twoweeks.spring.covid.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CovidReportListController {

	@RequestMapping("/covidUpdate/report.do")
	public String reportList() {
		
		return "covidUpdate/reportList";
	}

	
	
}
