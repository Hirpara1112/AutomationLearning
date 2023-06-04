package Day3;

import org.testng.annotations.Test;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*
import static io.restassured.matcher.RestAssuredMatchers.*
import static org.hamcrest.Matchers.*

public class CookiesDemo {
  @Test
 void testCookies()
 
 {
	  
	  given()
	  
	  
	  
	  .when()
	      .get("https://www.google.com/")
	      
	  
	  
	  
	  
	  .then() 
	      .cookie("AEC","//INFORMATION COPY ")
	  .log().all();
	  
 
 }
  @Test(priority=2)
  void getCookiesInfo()
  {
	  Response res=given()
			  
      .when()
          .get("https://www.google.com/");
	  
	  //get single cookies info
	  //String cookie_value=res.getCookies("AEC");
      //System.out.println("value of cookie is===>"+cookie_value);
  
     //get all cookies info
	  Map<String,String>cookies_values=res.getCookies();
	
	 // System.out.println(cookies_values.keySet());
	  
	  
	  
	  
	  
  }
  
  
}
