package pages;

import wrapper.ProjectSpecificWrapper;

public class MyLeads extends ProjectSpecificWrapper {
	
		
public CreateLead clickCreateLeadLink() {
	   clickByLinkText("Create Lead");
		return new CreateLead();
	
   }


  }
