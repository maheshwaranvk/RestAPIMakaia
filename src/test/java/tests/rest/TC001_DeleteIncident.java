package tests.rest;

import java.io.File;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import lib.rest.RESTAssuredBase;


public class TC001_DeleteIncident extends RESTAssuredBase{
	
	@BeforeTest//Reporting
	public void setValues() {
		testCaseName = "Delete a existing Incident (REST)";
		testDescription = "Delete a existing Incident and Verify";
		nodes = "Incident";
		authors = "Sarath";
		category = "REST";

	}

	@Test(dependsOnMethods="tests.rest.TC001_CreateIncident.createIncident")
	public void deleteIncident() {		
				
		Response response = delete("incident/"+sysID);
		response.prettyPrint();
		verifyResponseCode(response, 204);
	}


}




















