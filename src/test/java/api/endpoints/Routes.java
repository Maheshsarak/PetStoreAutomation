package api.endpoints;


/*
       swagger URI------https://petstore.swagger.io
       
       create user--post---https://petstore.swagger.io/v2/user
       Get user----get------https://petstore.swagger.io/v2/user/{username}
       update user----post---https://petstore.swagger.io/v2/user/{username}
       Delete user---delete----https://petstore.swagger.io/v2/user/{username}
*/
public class Routes{
	
	public static String base_url="https://petstore.swagger.io/v2";
	
	//User Module
	
	public static String post_url="https://petstore.swagger.io/v2/{username}";
	public static String get_url="https://petstore.swagger.io/v2/{username}";
	public static String update_url="https://petstore.swagger.io/v2/{username}";
	public static String delete_url="https://petstore.swagger.io/v2/{username}";
	
	//Store Module
	            //here you will create store module urls
}
