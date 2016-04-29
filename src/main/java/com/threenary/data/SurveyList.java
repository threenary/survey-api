package com.threenary.data;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

import com.threenary.builders.SurveyBuilder;
import com.threenary.domain.Survey;

public class SurveyList {

	private static final ArrayList<Survey> surveyList = new ArrayList<Survey>();

	private static SurveyBuilder surveyBuilder = new SurveyBuilder();

	private static final AtomicLong counter = new AtomicLong(100);

	static {

		surveyList.add(surveyBuilder.withId(counter.getAndIncrement()).withName("CustomerSurvey")
				.withResults(SurveyResultList.getInstance()).build());
		surveyList.add(surveyBuilder.withId(counter.getAndIncrement()).withName("InTimeSurvey")
				.withResults(SurveyResultList.getInstance()).build());
		surveyList.add(surveyBuilder.withId(counter.getAndIncrement()).withName("FoodSurvey")
				.withResults(SurveyResultList.getInstance()).build());
		surveyList.add(surveyBuilder.withId(counter.getAndIncrement()).withName("OnBoarServiceSurvey")
				.withResults(SurveyResultList.getInstance()).build());
		surveyList.add(surveyBuilder.withId(counter.getAndIncrement()).withName("TurbulenceSurvey")
				.withResults(SurveyResultList.getInstance()).build());
	}

	public static ArrayList<Survey> getInstance() {
		return surveyList;
	}
}
