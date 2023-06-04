package Day2;



public class POJOPostRequest {
	
//THIS CLASS IS CONTAINS SETTERS, GATTERS &VARIABLES !!!!!!	
	
   string name;
   string location;
   string phone;
   string courses[];
   
   //SELECT ABOVE & GO ON SOURCES, SELECT SETTERS GATTERS ALL !!
   
   public String getName() {
	   return name;
   }
   public void setName(String name) {
	   this.name = name;
   }
   public String getLocation() {
	   return location;
   }
   public void setLocation(String location) {
	   this.location = location;
   }   
   public String getPhone() {
	   return phone;
   }
   public void setPhone(String phone) {
	   this.phone = phone;
   }
   public String[] getCourses() {
	   return courses;
   }
   public void setCourses(String[] courses) {
	   this.courses = courses;
   }
   
  	
}
