package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;
import views.html.rdioHelper;

public class Application extends Controller {
	/*
	 * Register your app at http://www.rdio.com/developers/create/ and replace
	 * RDIO_CLIENT_ID below with yours
	 */
	private final static String RDIO_CLIENT_ID = "ppJo1acOvcWl8ZlpTnXUkA";

	public static Result index() {
		return ok(index.render(RDIO_CLIENT_ID));
	}

	public static Result rdioHelper() {
		return ok(rdioHelper.render());
	}
}
