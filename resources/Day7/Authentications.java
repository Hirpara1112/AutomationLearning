package Day7;

public class Authentications {
	
	
	@Test(Priority=1)
	void testBasicAuthentication()
	{
	given()
		//WE NEED TO USE METHODS:  WILL USE AUTH METHOD !!!
		.auth().basic("postman","password")
		
		
		
	.when()
		   .get("https://postman-echo.com/basic-auth")
		
	.then()
	      .statuscode(200)
	      .body("authenticated",equalTo(true))
	      .log().all();
	
	
	
		
		
		
	}
	
	@Test(Priority=2)
	void testDigestAuthentication()
	{
	given()
		//WE NEED TO USE METHODS:  WILL USE AUTH METHOD !!!
		.auth().Digest("postman","password")
		
		
		
	.when()
		   .get("https://postman-echo.com/basic-auth")
		
	.then()
	      .statuscode(200)
	      .body("authenticated",equalTo(true))
	      .log().all();
	
	@Test(Priority=3)
	void testPreempiveAuthentication()
	{
	given()
		//WE NEED TO USE METHODS:  WILL USE AUTH METHOD !!!
		.auth().Preempive("postman","password")
		
		
		
	.when()
		   .get("https://postman-echo.com/basic-auth")
		
	.then()
	      .statuscode(200)
	      .body("authenticated",equalTo(true))
	      .log().all();
	
	@Test(Priority=4)
	void testBearerTokenAuthentication()
	{
		
		
	}
	
	
	
	
	
	

}
