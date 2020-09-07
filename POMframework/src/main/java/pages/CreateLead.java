package pages;

import wrapper.ProjectSpecificWrapper;

public class CreateLead extends ProjectSpecificWrapper{
	
	public CreateLead enterCompanyName(String cName) {
		enterById("createLeadForm_companyName", cName);
		return this;
	}
	
	public CreateLead enteFirstfName(String fName) {
		enterById("createLeadForm_firstName", fName);
		return this;
	}
	
	public CreateLead enterLastName(String lName) {
		enterById("createLeadForm_lastName", lName);
		return this;
	}
	
	public ViewLead clickCreateLead() {
		clickByName("submitButton");
		return new ViewLead();
	}
}
