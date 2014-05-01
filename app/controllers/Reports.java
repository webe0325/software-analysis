package controllers;

import play.*;
import play.mvc.*;
import play.data.*;
import static play.data.Form.*;

import java.util.*;

import com.fasterxml.jackson.databind.JsonNode;

import models.*;
import models.Action;
import views.html.*;
import play.libs.Json;

@Security.Authenticated(Authenticated.class)
public class Reports extends Controller {

	// get a list of all incidents owned by the user
	public static Result getIndex() 
	{
		return ok(Json.toJson(Incident.find.all()));		
	}	
}