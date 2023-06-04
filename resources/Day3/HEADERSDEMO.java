package Day3;

import org.testng.annotations.Test;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*
import static io.restassured.matcher.RestAssuredMatchers.*
import static org.hamcrest.Matchers.*
import static io.restassured.RestAssured.*
import static io.restassured.matcher.RestAssuredMatchers.*
import static org.hamcrest.Matchers.*

public class HEADERSDEMO {
// @Test (priority=1)
	void testHeaders()
	
	get()
	  
      //HERE NO PRE-REQUISITES !!!!!
	
	
	when()
	  .get("https://www.google.com/")
	
	
	
	then()
	   
	   .headers("Content-Type","text/html; charset=utf-8")
       .header("Content-Encoding","gzip")
       .header("server","gws"); 
	    // WE CAN PUT/ADD MULTIPLE VALIDATIONS HERE !!!
	

}

//HOW TO GET THE INFO FROM THE HEADERS ? 
@Test (priority=2)
	void getHeaders()
	
	Response res= get()
	 
	
	
	when()
	  .get("https://www.google.com/");
	
	//get single header info 

res.Headervalue("Content-type");
System.out.println("The value of content-type header is:"+headervalue);
	
	

}



