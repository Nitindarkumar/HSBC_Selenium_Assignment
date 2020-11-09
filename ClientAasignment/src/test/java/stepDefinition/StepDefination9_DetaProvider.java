package stepDefinition;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class StepDefination9_DetaProvider {
	@Test(dataProvider = "date")
	public void specificdate(String date,String api)  {
		System.out.println(date+api);
	Response r;
	r= RestAssured.when().get("https://api.ratesapi.io/"+api+"/"+date);
	
	Assert.assertEquals(200, r.getStatusCode());
	}

	@org.testng.annotations.DataProvider(name = "date")
	public Object[][] futureDate() {
		Object[][] obj = new Object[2][2];

		
		obj[0][0]="2015-01-12";
		obj[0][1]="api";
				obj[1][0]="2016-01-12";
				obj[1][1]="api";
		return obj;
	}

}
