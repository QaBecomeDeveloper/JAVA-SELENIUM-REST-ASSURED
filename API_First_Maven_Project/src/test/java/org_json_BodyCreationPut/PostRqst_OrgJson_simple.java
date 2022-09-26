package org_json_BodyCreationPut;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostRqst_OrgJson_simple {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		JSONObject BsInfo = new JSONObject();
		BsInfo.put("FirstName", "MS");
		BsInfo.put("LastName", "Dhoni");
		BsInfo.put("Age", "40");
		BsInfo.put("Id", "101");
		
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
