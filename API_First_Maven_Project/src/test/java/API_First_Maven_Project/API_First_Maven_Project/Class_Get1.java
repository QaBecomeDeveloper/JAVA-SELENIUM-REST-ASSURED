//First Automation BDD Framework

package API_First_Maven_Project.API_First_Maven_Project;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Class_Get1 {
	
    public static void main(String[] args) {
    	Response res=
    			RestAssured.given()     		
    			.contentType(ContentType.JSON)
    			.when()
    			.get("http://localhost:3000/friends");

    	System.out.println("Status Code"+res.getStatusCode());
    	System.out.println("Data is");
    	System.out.println(res.asString());
}	
}


