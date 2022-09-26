package API_First_Maven_Project.API_First_Maven_Project;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostReqst_POJOComplx_Main {
	public static void main(String[] args) {
		PostRequest_POJOComplex_Address Addrs[] = new PostRequest_POJOComplex_Address[2];
		Addrs[0] = new PostRequest_POJOComplex_Address();
		Addrs[1] = new PostRequest_POJOComplex_Address();
		
		Addrs[0].setHouse_No("371/98");
		Addrs[0].setStreet("Wazirabad");
		Addrs[0].setZipCode("110009");
		
		Addrs[1].setHouse_No("372/98");
		Addrs[1].setStreet("Mumbai");
		Addrs[1].setZipCode("110009");
		
		PostRequest_POJOComplex_BasicInfo Bsc =new PostRequest_POJOComplex_BasicInfo();
		Bsc.setFirstName("Virat");
		Bsc.setLastName("Kohali");
		Bsc.setCourseName("Cricketer");
		Bsc.setDesignation("Batsman");
		Bsc.setMentorName("Poornima Verma");
		Bsc.setId("9092");
		Bsc.setAddress(Addrs);
		
	Response Res=
			RestAssured.given()
			.contentType(ContentType.JSON)
			.body(Bsc)
			.when()
			.post("http://localhost:3000/friends");
	System.out.println("Ststus Code For Post Request :" +Res.getStatusCode() + " " + "SessionID :" +Res.getSessionId());
	System.out.println("Data Posted Is :");
	System.out.println(Res.asString());
	
	
	}

}
