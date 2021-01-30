package pages;

import wrapper.ProjectSpecificWrapper;

public class CreateLeadPage extends ProjectSpecificWrapper{
	
	public CreateLeadPage enterCompanyName(String cName) {
		enterById("createLeadForm_companyName", cName);
		return this;
	}
	
	public CreateLeadPage enteFirstName(String fName) {
		enterById("createLeadForm_firstName", fName);
		return this;
	}
	
	public CreateLeadPage enterLastName(String lName) {
		enterById("createLeadForm_lastName", lName);
		return this;
	}
	
	public ViewLeadPage clickCreateleadeButton() {
		clickByName("submitButton");
		return new ViewLeadPage();
	}
}
