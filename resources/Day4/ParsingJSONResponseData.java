package Day4;

import static io.restassured.RestAssured.*
import static io.restassured.matcher.RestAssuredMatchers.*
import static org.hamcrest.Matchers.*

public class ParsingJSONResponseData {
   
	@Test(priority=1)
	void testJSONResponse()
	{
	  //APPROACH1
		
	   given()
	     .contentType("ContentType","JSON")
	      
	   
	   .when()
	      .get("https://localhost:3000/store")
	   
	   .then()
	      .statuscode("200")
	      .header("content-Type","application/json; charset=utf-8")
	      .body("book[3],title",equalTo("The Lord of the Rings"));
	   
	   //APPROACH2
	    
	        given()
	           .contentType("contentType","JSON");
	           
	        
	        when()
	           .get("https://localhost:3000/store\");
	           		
	        Assert.assertEquals(res.getStatusCode(),200);   //validation 1
	        Assert.assertEquals(res.headers("content-Type"),"application/json; charset=utf-8");
	        
	        
	}
	
	
	
}
