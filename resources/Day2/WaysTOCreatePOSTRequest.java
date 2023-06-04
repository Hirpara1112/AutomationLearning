package Day2;
import org.json.JSONTokener;
import.io.restassured.RestAssured.*
import.io.restassured.matcher.RestAssuredMatchers.*
import.org.hamcrest.Matchers.*
import java.utill.HashMap;

//HASH MAP IS JAVA COLLECTION :

/*
 * Different APPROACHES ways to create POST request body:
 * 1)POST REQUEST BODY USING HASHMAP
 * 2)POST REQUEST BODY CREATION USING Org.JSON
 * 3)POST REQUEST BODY CREATION USING POJO CLASS
 * 4)POST REQUEST USING EXTERNAL JSON FILE DATA
 */

//Run All
public class WaysTOCreatePOSTRequest {
	
	//@Test(priority=1)
	
	
//1)POST REQUEST BODY USING HASHMAP
	//small set of data you can use this Method !!!!
	
	void testPostusingHashMap()
	
	{
		HashMap data=new HashMap();
		
		data.put("name","scott";)
		data.put("location","France");
		data.put("phone","074253485697");
		 
	    courseArr[]= {"c","c++"};
	    data.put("courses,courseArr);"
	    		
	    		
	   given()
	   .contentType("application/json")
	   .body(data)
	   
	   
	   when()
	   .post("https://localhost:3000/students")
	   
	   
	   then()
	   .statuscode(201)
	   .body("name",equalTo("scott"))
	   .body("location",equalTo("France"))
	   .body("phone",equalTo("074253485697"))
	   .body("courses[0]",("c"))
	   .body("courses[1]",("c++"))
	   	//how to verify Headers ? !!
	   .header("content-Type","application/json; charset=utf-8")
	   //print entire response body ? 
	   .log().all();
	   	
}
	//for deleting student record !!!
	@Test(priority=2)
	
	void testDelete()
	{
		
		.given()
		
		.when()
		.delete("https://localhost:30000/students/4")
		
		.then()
		.statusCode(200);
}
	
	}


//2)POST REQUEST BODY CREATION USING Org.JSON !!!

//@Test(priority=1)

	
	void testPostusingOrg.JsonLibrary() 
	
	{
		JSONObject data=new JSONObject();
		
		data.put("name","scott");
		data.put("Locaion","France");
		data.put("phone","07426583148");
		
		 string coursesArr[]= {"c","c++"};
		 data.put("courses",coursesArr);
		 
		
		

	   given()
	   .contentType("application/json")
	   .body(data)
	   
	   
	   when()
	   .post("https://localhost:3000/students")
	   
	   
	   then()
	   .statuscode(201)
	   .body("name",equalTo("scott"))
	   .body("location",equalTo("France"))
	   .body("phone",equalTo("074253485697"))
	   .body("courses[0]",("c"))
	   .body("courses[1]",("c++"))
	   	//how to verify Headers ? !!
	   .header("content-Type","application/json; charset=utf-8")
	   //print entire response body ? 
	   .log().all();
	   	
}
	
	//3)POST REQUEST BODY CREATION USING POJO CLASS !!!!!!!!!!
	
//@Test(priority=1)

	
	void testPostusingPOJO() 
	
	{
	POJOPostRequest data=new POJOPostRequest();
	data.setName("Scott");
	data.setLocation("France");
	data.setphone("0742588476698");
    String coursesArr[]= {"c","c++"};
	data.setcourses(coursesArr);
	
		
		given()
	   .contentType("application/json")
	   .body(data)
	   
	   
	   when()
	   .post("https://localhost:3000/students")
	   
	   
	   then()
	   .statuscode(201)
	   .body("name",equalTo("scott"))
	   .body("location",equalTo("France"))
	   .body("phone",equalTo("074253485697"))
	   .body("courses[0]",("c"))
	   .body("courses[1]",("c++"))
	   	//how to verify Headers ? !!
	   .header("content-Type","application/json; charset=utf-8")
	   //print entire response body ? 
	   .log().all();
	   	
}
	
	
	//4)POST REQUEST USING EXTERNAL JSON FILE DATA !!
@Test(priority=1)

	
	void testPostusingExternalJsonFile() 
	
	{
	//dot is representing current file location !!!!!
	
	  File f=new File(".\\Body.json");
	  FileReader fr=new FileReader(f);
	   
	  JSONTokener jt=new JSONTokener(fr);
	  JSONObject data=new JSONObject(jt);
	  
	
	
		
		given()
	   .contentType("application/json")
	   .body(data)
	   
	   
	   when()
	   .post("https://localhost:3000/students")
	   
	   
	   then()
	   .statuscode(201)
	   .body("name",equalTo("scott"))
	   .body("location",equalTo("France"))
	   .body("phone",equalTo("074253485697"))
	   .body("courses[0]",("c"))
	   .body("courses[1]",("c++"))
	   	//how to verify Headers ? !!
	   .header("content-Type","application/json; charset=utf-8")
	   //print entire response body ? 
	   .log().all();
	   	
}











 