package Day5;
import static io.restassured.RestAssured.*
import static io.restassured.matcher.RestAssuredMatchers.*
import static org.hamcrest.Matchers

import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;.*

public class ParsingXMLResponseBody {

	@Test
	void testXMLResponse()
	{
		//Approach 1 !!
		 given()
		 //no pre-requisites !!!!
		 {
			 
			  
		 }
		
		.when()
		//url are here!!!!!!!
		   .get("https://restapi.adequateshop.com/api/Traveler?page=1")
		   
		
		.then()
		   .statuscode("200")
		   .header("content-Type","text/html; charset=us-ascii")
		   // WE NEED TO WRITE FIRST ROOT OF THE INFO, THEN GO TO THE UPDATE INFO !!
		   .body("TravelerinformationResponse.page",equalTo("1"))
		   .body("TravelerinformationResponse.travelers.Travelerinformation[1].name",equalTo("vijay Bharat Reddy"));
	
		
		//Approach 2 !!!
		
		{
			Response res= 
		
				given()
				
				when()
				   .get("https://restapi.adequateshop.com/api/Traveler?page=1")
				   
				   Assert.assertEquals(res.getstatuscode(),200);
		           Assert.assertEquals(res.headers("content-Type"),"application/xml; charset=utf-8");
		           
		           res.xmlPath().get("TravelerinformationResponse.page").toString();
		           Asserts.assertEquals(pageNo, "1");
		           
		           res.xmlPath().get("TravelerinformationResponse.page").toString();
		           Asserts.assertEquals("travelers.Travelerinformation[1].name"),equalTo("vijay Bharat Reddy");
		           
		           	
		}
		@Test
		void testXMLResponseBody()
	{
	 
			Response res=
		    given()
		    
		    .when()
		       .get("https://restapi.adequateshop.com/api/Traveler?page=1\");
		     // XML PATH WRITE HERE !!!
		    		   
 XmlPath xmlobj=new XmlPath(res.asString());
		   //WRITE AN METHOD HERE : 
		   //matching with all the nodes which represents XMLPATH !!
		   //verify total number of travellers !!!
		   travellers=xmlobj.getList("TravelerinformationResponse.travelers.TravelerInformation")
			List<String> travellers=xmlobj.getList("TravelerinformationResponse.travelers.TravelerInformation ")	   
		       
			// ASSERT(SIZE) METHOD FOR ALL TOTAL NUMBER OF TRAVELLERS !!1
			
			Assert.assertEquals("travellers.size(),10");
		   
		   //verify traveller name is present in response 
		   
		   List<String> travellers_name=xmlobj.getList("TravelerinformationResponse.travelers.TravelerInformation.name ")	   
			       
		   //how to use a seraching technique ? 
				   
		   for(String travellername:traveller_names)
		   {
		   System.out.println("travellername");
		   
		   }
		   Assert.assertEquals(status,true);
		   
		   
		   
		}
				
				
		
			
}
