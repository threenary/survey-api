package com.caravelo.rest;

import javax.ws.rs.NotFoundException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.glassfish.grizzly.http.server.HttpServer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.threenary.main.Main;

public class SurveyServiceBaseTest {

	private final String PATH = "PATH: ";

	private final String SEPARATOR = "\n==========================\n";

	HttpServer server;
	WebTarget target;

	public SurveyServiceBaseTest() {
		super();
	}

	@Before
	public void setUp() throws Exception {
		server = Main.startServer();
		Client c = ClientBuilder.newClient();
		target = c.target(Main.BASE_URI);
	}

	@After
	public void tearDown() throws Exception {
		server.stop();
	}

	protected void logging(String url, String log) {
		System.out.println(
				new StringBuffer().append(PATH).append(url).append(SEPARATOR).append(log).append(SEPARATOR).toString());
	}
}