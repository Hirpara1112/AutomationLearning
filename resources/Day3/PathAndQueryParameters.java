package Day3;

import static io.restassured.RestAssured.*
import static io.restassured.matcher.RestAssuredMatchers.*
import static org.hamcrest.Matchers.*

public class PathAndQueryParameters {
	
	//https://regres.in/api/users?page=2&id=5
	
	
	@Test
	void testQueryAndPathParameters()
	{ 
		given()
		// pre-requisites specifies !!
		
		 .pathParam("mypath","users") // path parameters
		 .queryParam("page","2") // Query parameters
		 .queryParam ("id","5") //Query parameters
		
		.when()
		     .get(https://regres.in/api/{mypath})
		
		
		
		.then()   
		    // HERE WILL DO VALIDATIONS !!!!!
		     .statuscode(200)
		     .log().all();
		     
	
	}
	

}
