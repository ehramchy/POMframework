package pages;

import wrapper.ProjectSpecificWrapper;

public class HomePage extends ProjectSpecificWrapper {
	
	public LoginPage clickLogout() {
		clickByXpath("//input[@value='Logout']");
		return new LoginPage();
	}
	
	public MyHomePage clickCRMSFA() {
		clickByLinkText("CRM/SFA");
		return new MyHomePage();
	}

}
