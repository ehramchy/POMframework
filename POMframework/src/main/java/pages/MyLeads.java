package pages;

import wrapper.ProjectSpecificWrapper;

public class MyLeads extends ProjectSpecificWrapper {
	
		
public CreateLeadPage clickCreateLead() {
	   clickByLinkText("Create Lead");
		return new CreateLeadPage();
	
   }


  }
