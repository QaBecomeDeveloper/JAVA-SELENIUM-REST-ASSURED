package Org.Testing.TestCases;
import java.io.IOException;
import java.util.Properties;

import Org.Testing.Payloads.PojoBodyData;
import Org.Testing.Payloads.PojoSimpleBody;
import Org.Testing.TestResponseValidation.ResponseValidation;
import Org.Testing.TestSteps.HttpMethods;
import Org.Testing.TestUtilities.JsonResParsing;
import Org.Testing.TestUtilities.PropertiesFileLoad;
import io.restassured.response.Response;

public class TC_02 {
	
	static String JsonKeyValue;
	public void testcase2() throws IOException{
		try {
			System.out.println("Executing Test Case 2");
			Properties Pr = PropertiesFileLoad.PropFileLoad("../RestAssuredFrameWork_Project/Env.Properties");
			HttpMethods http = new HttpMethods(Pr);
			PojoBodyData Body= PojoSimpleBody.GetBodyData();
			Response Res = http.PostRequest(Body,"QA_URI1");
			ResponseValidation.ResponseStatusCodeVal(201,Res);
			System.out.println("Status code checked and found Ok");
			JsonKeyValue= JsonResParsing.JsonResDataParsing(Res,"id");
			ResponseValidation.ResponseDataValid("2016", JsonKeyValue);
		
			System.out.println("The value of Json Key fecthed is :"+JsonKeyValue);
			ResponseValidation ResObj =new  ResponseValidation();
			ResObj.ResponseValidation(Res);
			
		} catch (Exception e) {
	          System.out.println(e.getMessage());
		}

}
}
