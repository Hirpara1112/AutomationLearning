package Day3;
import static io.restassured.RestAssured.*
import static io.restassured.matcher.RestAssuredMatchers.*
import static org.hamcrest.Matchers.*

public class LoggingDemo {

	
	void testlog()
	
	{
		given()
		
		.when()
		  .get("https://www,google.com/")
		
		.then()
		  .log().all();
		
		
		
	}
}
