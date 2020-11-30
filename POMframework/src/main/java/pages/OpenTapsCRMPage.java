package pages;

import wrapper.ProjectSpecificWrapper;

public class OpenTapsCRMPage  extends ProjectSpecificWrapper {
	
	public OpenTapsCRMPage entertheNewCompanyName() {
		
enterById("updateLeadForm_companyName", "CRM");
return this;

}
	
	public ViewLeadPage clickUpdate() {
		
	clickByName("submitButton");
	
	return new ViewLeadPage();
	
	}

}
