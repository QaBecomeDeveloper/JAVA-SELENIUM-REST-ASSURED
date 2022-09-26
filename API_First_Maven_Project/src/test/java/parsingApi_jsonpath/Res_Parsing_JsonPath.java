package parsingApi_jsonpath;


import java.io.FileNotFoundException;

import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class Res_Parsing_JsonPath {

	public static void main(String[] args) throws FileNotFoundException{
		try{
		Response Res =
				RestAssured.given()
				.contentType(ContentType.JSON)
				.when()
				.get("https://dummy.restapiexample.com/api/v1/employees");
		//String First_Name = Res.jsonPath().getString("[6].firstName");
		JSONObject jo=new JSONObject(Res.asString());
		for(int i=1; i<jo.getJSONArray("data").length();i++)
		{
		String Record=jo.getJSONArray("data").getJSONObject(i).get("employee_name").toString(); 
		System.out.println(i+" "+Record);
		}
		}catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
		
		
		
	}
}
