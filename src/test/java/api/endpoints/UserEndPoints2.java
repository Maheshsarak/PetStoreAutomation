package api.endpoints;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.ResourceBundle;

import api.payload.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

    // created for perform create, read, update, delete (CRUD) request the user

public class UserEndPoints2 {
	
	//method created for getting properties file
	static ResourceBundle getUrl()
	{
		ResourceBundle routes=ResourceBundle.getBundle("routes") ;  //load properties file
		return routes;
	}
	
	

	public static Response createUser(User payload)
	{
		 String post_url= getUrl().getString("post_url");
		Response response=given()
		            .contentType(ContentType.JSON)
		            .accept(ContentType.JSON)
		            .body(payload)
		       .when()
		            .post(post_url);
		
		return response;
	}
	
	public static Response readUser(String  USERNAME)
	{
		String get_url= getUrl().getString("get_url");
		
		Response response=given()
		            .pathParam("username", USERNAME)
		       .when()
		            .get(get_url);
		
		return response;
	}
	
	public static Response updateUser(String Username, User payload)
	{
		String update_url= getUrl().getString("update_url");
		
		Response response=given()
		            .contentType(ContentType.JSON)
		            .accept(ContentType.JSON)
		            .pathParam("username", Username)
		            .body(payload)
		       .when()
		            .post(update_url);
		
		return response;
	}
	
	public static Response deleteUser(String  Username)
	{
		String delete_url= getUrl().getString("delete_url");
		
		Response response=given()
		            .pathParam("username", Username)
		       .when()
		            .delete(delete_url);
		
		return response;
	}
}
