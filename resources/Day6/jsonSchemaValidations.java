package Day6;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*
import static io.restassured.matcher.RestAssuredMatchers.*
import static org.hamcrest.Matchers.*

public class jsonSchemaValidations {

@Test
	void jsonschemaValidations()
	{
		given()
		
		.when()
		  .get("https://localhost:3000/store")
		
		.then()
		   .assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("storeJSON".json));
		
		
		
	
	
	
	
	
		
	}
	
	
	
	
	
}
