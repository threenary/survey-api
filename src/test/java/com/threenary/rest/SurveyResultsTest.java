package com.threenary.rest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.notNullValue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import com.threenary.data.SurveyList;
import com.threenary.domain.Survey;

public class SurveyResultsTest extends SurveyServiceBaseTest {

	@Test
	public void testGetAllAvailableSurveyResults() {
		for (Survey s : SurveyList.getInstance()) {
			String finalPath = "surveys/" + s.getId();

			String responseMsg = target.path(finalPath).request().get(String.class);

			assertThat(responseMsg, is(notNullValue()));

			logging(finalPath, responseMsg);

			ArrayList<String> parsed = new ArrayList<String>(Arrays.asList(responseMsg.split("\n")));
			assertThat(parsed, not(empty()));
			assertThat(parsed, hasSize(10));
			assertThat(parsed, hasItem(containsString("Result")));
		}
	}

	@Test
	public void testGetOneResult() {
		String finalPath = "surveys/" + 100;
		String responseMsg = target.path(finalPath).request().get(String.class);

		assertThat(responseMsg, is(notNullValue()));

		logging(finalPath, responseMsg);

		ArrayList<String> parsed = new ArrayList<String>(Arrays.asList(responseMsg.split("\n")));
		assertThat(parsed, not(empty()));
		assertThat(parsed, hasSize(10));
		assertThat(parsed, hasItem(containsString("Result")));
	}
	
	@Test
	public void testNonExistingSurvey() {
		String finalPath = "surveys/10";
		String responseMsg = target.path(finalPath).request().get(String.class);

		assertThat(responseMsg, is(notNullValue()));

		logging(finalPath, responseMsg);

		ArrayList<String> parsed = new ArrayList<String>(Arrays.asList(responseMsg.split("\n")));
		assertThat(parsed, not(empty()));
		assertThat(parsed, hasItem(containsString("No results")));
	}
}
