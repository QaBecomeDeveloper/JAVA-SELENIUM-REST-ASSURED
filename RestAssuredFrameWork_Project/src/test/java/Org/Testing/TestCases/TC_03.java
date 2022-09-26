package Org.Testing.TestCases;

import java.io.IOException;
import java.util.Properties;

import Org.Testing.TestResponseValidation.ResponseValidation;
import Org.Testing.TestSteps.HttpMethods;
import Org.Testing.TestUtilities.PropertiesFileLoad;
import io.restassured.response.Response;

public class TC_03 {

	public void testcase3 () throws IOException{
	try {
		Properties Pr = PropertiesFileLoad.PropFileLoad("../RestAssuredFrameWork_Project/Env.Properties");
		HttpMethods http=new HttpMethods(Pr);
		String id="177";
		Response Res= http.DeleteData(TC_02.JsonKeyValue,"QA_URI1");
//		ResponseValidation ResObj=new ResponseValidation();
//		ResObj.ResponseValidation(Res);
		ResponseValidation.ResponseStatusCodeValid(200, Res);
		System.out.println("Data Deleted Successfully :" + Res.getStatusCode());
		
		
	} catch (Exception e) {
		System.out.println(e.getMessage());
		
		
		
	}
	}
}
