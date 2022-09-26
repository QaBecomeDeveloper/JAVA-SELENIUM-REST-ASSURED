package API_First_Maven_Project.API_First_Maven_Project;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostRequest1 {
	public static void main(String[] args) {
		Class_POJO_Post1 Data = new Class_POJO_Post1();
		Data.setFirstName("Suhani");
		Data.setLastName("Sharma");
		Data.setDesignation("Project Lead");
		Data.setMentorName("Poornima Verma");
		Data.setCourseName("API_Testing");
		Data.setId("367_6");
				
	Response Res=
		 RestAssured.given()
		 .contentType(ContentType.JSON)
		 .body(Data)
		 .when()
		 .post("http://localhost:3000/friends");
		System.out.println("Status Code For Post Request=:" +Res.getStatusCode());
		System.out.println("Data Posted is :");
		System.out.println(Res.asString()); //Store Data	
	}
	
}
