package pages;

import wrapper.ProjectSpecificWrapper;

public class LoginPage extends ProjectSpecificWrapper {
	
	//public void enterUserName(String uName){
	
public LoginPage enterUserName(String uName) {
	
enterByName("USERNAME", uName);
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
		
		
	
		
	
		

		
		
		
		
		
	


