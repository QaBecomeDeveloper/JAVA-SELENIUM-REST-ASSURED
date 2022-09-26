package org_json_BodyCreationPut;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostRqst_OrgJson_Complex {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
	
		JSONObject AddInfo = new JSONObject();
		AddInfo.put("House_No", "1201");
		AddInfo.put("StreetName", "Kolaba");
		AddInfo.put("Age", "34");
		
		JSONObject BsInfo = new JSONObject();
		BsInfo.put("FirstName", "Rohit");
		BsInfo.put("LastName", "Sharma");
		BsInfo.put("Age", "34");
		BsInfo.put("Id", "102");
		BsInfo.put("Address", AddInfo);
		
		Response Res=
				RestAssured.given()
				.contentType(ContentType.JSON)
				.body(BsInfo.toString())
				.when()
				.post("http://localhost:3000/friends");
		System.out.println("Ststus Code For Post Request :" +Res.getStatusCode() + " " + "ContentType :" +Res.getContentType());
		System.out.println("Data Posted Is :");
		System.out.println(Res.asString());
		
	}

}
