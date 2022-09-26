package Org.Testing.TestCases;

import java.io.IOException;
import java.util.Properties;

import Org.Testing.TestResponseValidation.ResponseValidation;
import Org.Testing.TestSteps.HttpMethods;
import Org.Testing.TestUtilities.JsonResParsing;
import Org.Testing.TestUtilities.PropertiesFileLoad;
import io.restassured.response.Response;

public class TC_01 {

	public void testcase1() throws IOException{
//		Properties Pr = PropertiesFileLoad.PropFileLoad("../RestAssuredFrameWork_Project/Env.Properties");
//		HttpMethods http = new HttpMethods(Pr);
//		Response Res = http.GetRequest("QA_URI2");
//		ResponseValidation ResObj =new  ResponseValidation();
//		ResObj.ResponseValidation(Res);
		
//		validate response 
	//	System.out.println("Now I am Executing TC1 and will get records based upon Id from Test case2");
		
		System.out.println("Executing Test Case1");
		Properties Pr = PropertiesFileLoad.PropFileLoad("../RestAssuredFrameWork_Project/Env.Properties");
		HttpMethods http = new HttpMethods(Pr);
		Response Res = http.GetRequest("QA_URI1");
		ResponseValidation.ResponseStatusCodeVal(200,Res);
		String parseData =JsonResParsing.JsonDataResParsing(Res, "firstname");
		System.out.println("The Value of Json Key is fetched and it is:  " +parseData);
		ResponseValidation.ResponseDataValid("Sushil", parseData);
		System.out.println(Res.asString() +"\n");
		
	}

}
