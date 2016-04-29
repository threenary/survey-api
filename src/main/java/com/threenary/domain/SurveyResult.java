package com.threenary.domain;

public class SurveyResult {

	private long id;

	private String name;

	private long value;

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

	public long getValue() {
		return value;
	}

	public void setValue(long value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "SurveyResult [id=" + id + ", name=" + name + ", value=" + value + "]";
	}

}
