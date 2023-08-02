package api.endpoints;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import api.payload.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

    // created for perform create, read, update, delete (CRUD) request the user

public class UserEndPoints {

	public static Response createUser(User payload)
	{
		Response response=given()
		            .contentType(ContentType.JSON)
		            .accept(ContentType.JSON)
		            .body(payload)
		       .when()
		            .post(Routes.post_url);
		
		return response;
	}
	
	public static Response readUser(String  USERNAME)
	{
		Response response=given()
		            .pathParam("username", USERNAME)
		       .when()
		            .get(Routes.get_url);
		
		return response;
	}
	
	public static Response updateUser(String Username, User payload)
	{
		Response response=given()
		            .contentType(ContentType.JSON)
		            .accept(ContentType.JSON)
		            .pathParam("username", Username)
		            .body(payload)
		       .when()
		            .post(Routes.update_url);
		
		return response;
	}
	
	public static Response deleteUser(String  Username)
	{
		Response response=given()
		            .pathParam("username", Username)
		       .when()
		            .delete(Routes.delete_url);
		
		return response;
	}
}
