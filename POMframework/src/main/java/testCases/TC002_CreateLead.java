package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrapper.ProjectSpecificWrapper;

public class TC002_CreateLead extends ProjectSpecificWrapper {
	
	@BeforeTest
	public void setData() {
		excelfile = "TC002_CreateLead";
	}
	
	@Test(dataProvider = "getData")
	public void CreateLead(String uname, String pwd, String cName, String fName, String lName) {
		
		new LoginPage()
		.enterUserName(uname)
		.enterPassword(pwd)
		.clickLogin()
		.clickCRMSFA()
		.clickLeadsLink()
		.clickCreateLeadLink()
		.enterCompanyName(cName)
		.enterLastName(lName)
		.enterLastName(lName)
		.clickCreateLead();
		
		
	}

}
