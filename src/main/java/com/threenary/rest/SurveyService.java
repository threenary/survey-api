
package com.threenary.rest;

import java.util.Optional;
import java.util.stream.Collectors;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.threenary.data.SurveyList;
import com.threenary.domain.Survey;

@Path("/surveys")
public class SurveyService {

	@GET
	@Path("/all")
	@Produces(MediaType.TEXT_PLAIN)
	public String getAllSurveys() {
		return "--- Survey List ---\n"
				+ SurveyList.getInstance().stream().map(s -> s.toString()).collect(Collectors.joining("\n"));
	}

	@GET
	@Path("{id}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getSurveyResults(@PathParam("id") long id) {
		Optional<Survey> survey = SurveyList.getInstance().stream().filter(c -> c.getId() == id).findFirst();
		if (survey.isPresent()) {
			return "--- " + survey.get().getName() + " ---\n" + survey.get().getResults().stream().map(r -> r.toString()).collect(Collectors.joining("\n"));
		} else {
			return "No results found for the given survey " + id;
		}
	}

}