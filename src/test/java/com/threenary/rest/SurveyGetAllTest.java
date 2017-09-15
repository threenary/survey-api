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

import javax.ws.rs.NotFoundException;

import org.junit.Test;

public class SurveyGetAllTest extends SurveyServiceBaseTest {

	private final String PATH = "surveys/all";
	
	@Test
	public void testGetAll() {
		String responseMsg = target.path(PATH).request().get(String.class);

		assertThat(responseMsg, is(notNullValue()));
		
		logging(PATH, responseMsg);

		ArrayList<String> parsed = new ArrayList<String>(Arrays.asList(responseMsg.split("\n")));
		assertThat(parsed, not(empty()));
		assertThat(parsed, hasSize(6));
		assertThat(parsed, hasItem(containsString("Survey")));
	}
	
	@Test(expected=NotFoundException.class)
	public void unhappyPath() {
		String finalPath = "weather/noValidPath";
		target.path(finalPath).request().get(String.class);
	}

}
