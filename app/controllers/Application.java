package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;
import views.html.rdiohelper;

public class Application extends Controller {
	/*
	 * Register your app at http://www.rdio.com/developers/create/ and replace
	 * rdioClientId below with yours
	 */
	private static String rdioClientId = "ppJo1acOvcWl8ZlpTnXUkA";

	public static Result index() {
		return ok(index.render(rdioClientId));
	}

	public static Result rdioHelper() {
		return ok(rdiohelper.render());
	}
}
