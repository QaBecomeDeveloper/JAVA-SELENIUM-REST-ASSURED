package Org.Testing.TestUtilities;

import io.restassured.response.Response;

public class JsonResParsing {

	public static String JsonDataResParsing(Response Res, String JsonPath) {
		String JsonParseKeyValue = Res.jsonPath().get(JsonPath).toString();
				return JsonParseKeyValue;
		
		
		
	}

	public static String JsonResDataParsing(Response res, String string) {
		String JsonParseKeyValue = res.jsonPath().get(string).toString();
		return JsonParseKeyValue;
}
}
