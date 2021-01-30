package pages;

import wrapper.ProjectSpecificWrapper;

public class ViewLeadPage extends ProjectSpecificWrapper{
         
	public ViewLeadPage verifyFirstName(String firstName) {
		verifyTextByXpath("//span[@id='viewLead_firstName_sp']", firstName);
		
		return this;
	}
		
	
}
