
package org_json_BodyCreationPut;

import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;
import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostRqst_OrgJson_Array {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		
		Map<Integer,JSONObject> addressMap = new HashedMap<>();
		
		JSONObject Primary_AddInfo = new JSONObject();
		Primary_AddInfo.put("House_No", "1202");
		Primary_AddInfo.put("StreetName", "Goa");
		Primary_AddInfo.put("Zip", "334409");
		
		JSONObject Secondary_AddInfo = new JSONObject();
		Secondary_AddInfo.put("House_No", "1203");
		Secondary_AddInfo.put("StreetName", "Bali");
		Secondary_AddInfo.put("Zip", "334499");
		
		addressMap.put(0, Primary_AddInfo);
		addressMap.put(1, Secondary_AddInfo);
		
		
		JSONObject BsInfo = new JSONObject();
		BsInfo.put("FirstName", "SuryaKumar");
		BsInfo.put("LastName", "Yadav");
		BsInfo.put("Age", "32");
		BsInfo.put("Id", "104");
		BsInfo.put("Address", addressMap);
		
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
	
