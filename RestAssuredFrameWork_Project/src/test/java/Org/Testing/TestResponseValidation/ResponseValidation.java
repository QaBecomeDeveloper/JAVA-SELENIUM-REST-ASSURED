package Org.Testing.TestResponseValidation;

import org.testng.Assert;

import io.restassured.response.Response;

public class ResponseValidation {
	
	public static void ResponseStatusCodeVal(int ExpStatCode, Response Res)
	{
	Assert.assertEquals(Res.getStatusCode(), ExpStatCode);
	System.out.println("Response Status Validated");
	}
	
	public static void ResponseStatusCodeValid(int i, Response res)
	{
	Assert.assertEquals(i, res);
	System.out.println("Response Data Validated");
	}
//	public void ResponseValidation (Response Res) {
//		
//		System.out.println(Res.getStatusLine());
//		System.out.println(Res.asString());
//		
//	}

	public static void ResponseDataValid(String ExpData, String ActualData) {
		Assert.assertEquals(ExpData, ActualData);
		System.out.println("Response Data Validated");
		// TODO Auto-generated method stub
		
	}

	public void ResponseValidation(Response res) {
		System.out.println("Response Data Validated");
		// TODO Auto-generated method stub
		
	}

}
