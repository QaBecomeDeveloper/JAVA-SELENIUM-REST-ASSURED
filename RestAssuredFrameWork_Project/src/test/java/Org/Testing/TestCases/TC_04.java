package Org.Testing.TestCases;

import java.io.IOException;
import java.util.Properties;

import Org.Testing.Payloads.PojoBodyData;
import Org.Testing.Payloads.PojoSimpleUpdatedData;
import Org.Testing.TestResponseValidation.ResponseValidation;
import Org.Testing.TestSteps.HttpMethods;
import Org.Testing.TestUtilities.JsonResParsing;
import Org.Testing.TestUtilities.PropertiesFileLoad;
import io.restassured.response.Response;

public class TC_04 {

	public void testcase4() throws IOException
	{
	System.out.println("Executing Test Case 4");
	// STEP 1: Loading the property file in Pr object and we will pass it in calling method
	Properties Pr= PropertiesFileLoad.PropFileLoad("../RestArruredFrameWork_Project/Env.properties");
	// Step 2: Called GetUpdatedBodyData method of class PojoSimpleUpdatedData which return simple Json data Object
	PojoBodyData Body= PojoSimpleUpdatedData.GetUpdatedBodyData();
	// STEP 3: Initializing the HttpMethods class with latest value of Properties Object
	HttpMethods http=new HttpMethods(Pr);
	//STEP 4: Calling the put() Request method, Passing URI Key, updated data and Collecting Response
	Response Res=http.PutRequest(Body,"QA_URI1",TC_02.JsonKeyValue);
	System.out.println("Data Updated by put() http request");
	//STEP 5: Validating the Response by calling ResponseValidation method and passing Response data
	ResponseValidation.ResponseStatusCodeVal(200,Res);
	String UpdatedData= JsonResParsing.JsonResDataParsing(Res,"lastName");
	System.out.println("The value of Updated Json Key fecthed is :"+UpdatedData);
	ResponseValidation.ResponseDataValid("Singh Bhatti", UpdatedData);
	}
}
