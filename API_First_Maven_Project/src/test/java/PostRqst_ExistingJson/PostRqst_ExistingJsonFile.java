package PostRqst_ExistingJson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Pattern;
import org.json.JSONTokener;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import org.json.*;

public class PostRqst_ExistingJsonFile {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException {

		// File f = new File("../API_First_Maven_Project/Body.json");
		File f = new File("../API_First_Maven_Project/JsonVariables.json");
		FileReader fr = new FileReader(f);
		JSONTokener jt = new JSONTokener(fr);
		JSONObject jo = new JSONObject(jt);
		//System.out.println(jo.toString());
		String firstName, id, lastName, designation;
		Scanner Variables = new Scanner(System.in);
		id=Variables.next();
		firstName=Variables.next();
		lastName=Variables.next();
		designation=Variables.next();
		
		  String Data =jo.toString();
		  Data=Data.replaceAll(Pattern.quote("{{"+"id"+"}}"),id);
		  Data=Data.replaceAll(Pattern.quote("{{"+"firstName"+"}}"),firstName);
		  Data=Data.replaceAll(Pattern.quote("{{"+"lastName"+"}}"),lastName);
		  Data=Data.replaceAll(Pattern.quote("{{"+"designation"+"}}"),designation);
		
		Response Res = 
				RestAssured.given()
				.contentType(ContentType.JSON)
				.body(Data)
				.when()
				.post("http://localhost:3000/friends");
		System.out.println(
				"Ststus Code For Post Request :" + Res.getStatusCode() + " " + "ContentType :" + Res.getContentType());
		System.out.println("Data Posted Is :");
		System.out.println(Res.asString());
	}
}
