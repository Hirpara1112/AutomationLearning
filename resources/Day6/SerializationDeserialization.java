package Day6;
import org.testng.annotations.Test;
import day2.Pojo_PostRequest;

//POJO  -----SERIALIZE---> JSON OBJECT--- DE-SERIALIZED---->POJO

public class SerializationDeserialization {
	
	//POJO -------> JSON  (SERIALIZATION).....!!
	
	@Test
	void convertPojo2Json()
	{
		//CREATED JAVA OBJECT USING POJO CLASS
		Student stupojo=new Student();   //POJO
		
		stupojo.setName("Scott");
		stupojo.setLocation("France");
		stupojo.setPhone("07425384168");
		stupojo.courseArr[]= {"C","C++"};
		stupojo.setCourses(coursesArr);
		
		//CONVERT JAVA OBJECT -----> JSON OBJECT ( SERIALIZATION)
		//USING OBJECT MAPPER MATHOD WE WILL USE HERE !!!!
		
		ObjectMapper objMapper=new ObjectMapper();
		
	// BY USING THIS METHOD, WILL HAVE TO ACCESS 1 METHOD :!!!!
		// THIS IS A STRING METHOD STILL !!
		//JAVA OBJECT CONVERTED INTO JSON !!!!! 
		String jsondata=objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(stupojo);
		
		System.out.println(jsondata);
		
		
	}
	
	
	//JSON -------> POJO  (DE-SERIALIZATION).....!!
	
	@Test
	void convertJson2Pojo() throws JsonProcessingExecption
	{
	 
	 String jsondata= ""{
			 "name" : "scott",
			 "location": "France",
			 "phone" : "123456",
			 "courses" : ["C", "C++"]
			 		
	 }""
		  	 
			//CONVERT JSON DATA ----> POJO OBJECT
	 ObjectMapper objMapper=ObjectMapper.();
	 
	objMapper.readValue(jsondata,Student.class)
	
	// WHAT IS WRITTEN TYPE OBJECT ? !!
	// STU IS STUDENT POJO !!!!!
	
	Student stu=objMapper.readValue/jsondata.Student.class);
	
		System.out.println("Name:"+.getName());
		System.out.println("Location:"+stupojo.getLocation());
		System.out.println("Phone:"+stupojo.getPhone());
		System.out.println("course 1:"+stupojo.getCourses()[0];
		System.out.println("course 2:"+ stupojo.getCourses()[1];
		
	
	
	
	}
	
	
 
}
