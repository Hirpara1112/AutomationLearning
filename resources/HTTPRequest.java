pacakge Day1; 

import.io.restassured.RestAssured.*
import.io.restassured.matcher.RestAssuredMatchers.*
import.org.hamcrest.Matchers.*
import java.utill.HashMap;

//REST Assured 3 METHODS: ITS VERY VERY FUNDAMENTAL !!!!!!!

Given()

  //content type, set cookies, add auth, add paraqm, set headers info etc.....


when()
  // get, post, put, delete....ALL REQUEST URL'S WILL KEEP IN THIS SECTION !!!!!!


then()
// ALL VALIDATIONS WILL KEEP IN THIS SECTION !!!! 
// EX; Validate status code, extract Response, extract headers cookies & response body.....

  

public class HTTPRequest {
	
	@Test Method: 
		
	void getUser() {
		
		Given()
		//what type of data we are sending !!!
		//body()

		
		when()
		//request("url");
		
		
		then()  
		//statuscode 
		//body()

}
}