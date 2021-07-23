package com.twoweeks.spring.covid.domestic.model.vo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Body {

	private List<Item> items;
	private int numOfRows;
	private int pageNo;
	@JsonProperty("totalCount")
	private int totalCount;
}
