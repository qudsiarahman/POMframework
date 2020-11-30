package pages;

import wrapper.ProjectSpecificWrapper;

public class FindLeadsPage extends ProjectSpecificWrapper  {

	public FindLeadsPage FindLeads() {
		
	clickByLinkText("Find Leads");	
	
	return this;
		
	}

	public FindLeadsPage enterFirstName(String fName){
	
	enterByName("firstName", fName);
	return this;
		
	}
	

	
}
