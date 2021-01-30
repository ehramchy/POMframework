package pages;

import wrapper.ProjectSpecificWrapper;

public class LoginPage extends ProjectSpecificWrapper {
	
	public LoginPage enterUserName(String uname) {
		enterById("username", uname);
		return this;
	}
	
	public LoginPage enterPassword(String pwd) {
		enterById("password", pwd);
		return this;
		
	}
	
	public HomePage clickLogin() {
		clickByClassName("decorativeSubmit");
		return new HomePage();
	}

}
