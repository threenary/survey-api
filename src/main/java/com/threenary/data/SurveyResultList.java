package com.threenary.data;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

import com.threenary.builders.SurveyResultBuilder;
import com.threenary.domain.SurveyResult;

public class SurveyResultList {

	private static final ArrayList<SurveyResult> resultList = new ArrayList<>();

	private static SurveyResultBuilder srBuilder = new SurveyResultBuilder();

	private static final AtomicLong counter = new AtomicLong(100);

	static {
		for (int i = 0; i < 9; i++) {
			resultList.add(srBuilder.withId(counter.get()).withName("Result-" + counter).withValue(counter.getAndIncrement()).build());
		}
	}

	public static ArrayList<SurveyResult> getInstance() {
		return resultList;
	}

}
