package pages;

import wrapper.ProjectSpecificWrapper;

public class ViewLead extends ProjectSpecificWrapper{
         
	public ViewLead verifyFirstName(String firstName) {
		verifyTextByXpath("//span[@id='viewLead_firstName_sp']", firstName);
		
		return this;
	}
		
	
}
