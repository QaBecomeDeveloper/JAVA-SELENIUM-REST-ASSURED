package Org.Testing.TestSteps;

import java.util.Properties;

import Org.Testing.Payloads.PojoBodyData;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class HttpMethods {
		static Properties Pr;
		public HttpMethods(Properties Pr)
		{
		this.Pr=Pr;
		}
		public Response GetRequest(String URI)
		{
		Response Res=
		RestAssured.given()
		.contentType(ContentType.JSON)
		.when()
		.get(Pr.getProperty(URI));
		return Res;
		}
		
		public Response PostRequest(PojoBodyData Body, String URI) {
			Response Res=
					RestAssured.given()
					.contentType(ContentType.JSON)
					.when()
					.post(Pr.getProperty(URI));
					return Res;
			
		}
		public Response DeleteData(String Id, String URI) {
			String FinalUri = (String) Pr.getProperty(URI)+"/"+Id;
			Response Res=
					RestAssured.given()
					.contentType(ContentType.JSON)
					.when()
					.delete(FinalUri);
					return Res;
			
		}
		
		public Response PutRequest(PojoBodyData Body, String URI, String id) {
			String FinalURI = (String) Pr.getProperty(URI)+"/"+id;
			Response Res=
			RestAssured.given()
			.contentType(ContentType.JSON)
			.when()
			.put(FinalURI);
			return Res;
		
			
			
		}
		
	

}
