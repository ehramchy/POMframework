package pages;

import wrapper.ProjectSpecificWrapper;

public class MyHomePage extends ProjectSpecificWrapper {
	
	
		
	public MyLeads clickLeadsLink() {
		
		clickByLinkText("Leads");
		return new MyLeads();
	}
	
	/*public CreateLead clickMyHome() {
		clickByXpath("//div[text()='My Home']");
		return new CreateLead();
	}*/
	
}
