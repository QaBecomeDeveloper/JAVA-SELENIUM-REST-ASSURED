package Org.Testing.TestTrigger;

import java.io.IOException;

import Org.Testing.TestCases.TC_01;
import Org.Testing.TestCases.TC_02;
import Org.Testing.TestCases.TC_03;

public class Trigger {
	public static void main(String[] args) throws IOException {
		try {
			System.out.println("Executing Test Case1- get() Request");
			TC_01 TC_01Obj = new TC_01();
			TC_01Obj.testcase1();
			
			System.out.println("Executing Test Case2- Post() Request");
			TC_02 TC_02Obj = new TC_02();
			TC_02Obj.testcase2();
			

			System.out.println("Executing Test Case2- Delete() Request");
			TC_03 TC_03Obj = new TC_03();
			TC_03Obj.testcase3();
			
		} catch (Exception e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
		}
		
	}

}
