package Day5;
import static io.restassured.RestAssured.*
import static io.restassured.matcher.RestAssuredMatchers.*
import static org.hamcrest.Matchers.*
import java.io.file;
import org.testng.annotations.Test;


public class FileUploadAndDownload {
	
	void singlefileupload()
	@Test
	void singlefileupload()
	{
		 File myfile=new File("c:\\AutomationPractice\\Test1.txt");
		//VERY VERY IMPORTANT PART IN GIVEN 
		//REMEMBER !!! 
		 given()
		  .multiPart("file","myfile")
		  .contentType("multipart/form-data")
		 
		
		
		when()
		  .post("https://localhost:8080/uploadFile")
		  
		
		
		then()
		.statuscode(200)
		.body("fileName",equal To("Test1.txt"))
		.log().all();
		
		
		
	}
	}

}
