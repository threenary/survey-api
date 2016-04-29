package com.threenary.domain;

import java.util.List;

public class Survey {

	private long id;

	private String name;

	private List<SurveyResult> results;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<SurveyResult> getResults() {
		return results;
	}

	public void setResults(List<SurveyResult> results) {
		this.results = results;
	}

	@Override
	public String toString() {
		return name + " [id=" + id + "]";
	}

}
