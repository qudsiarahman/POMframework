package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import wrapper.ProjectSpecificWrapper;

public class TC003_EditLead extends ProjectSpecificWrapper  {
	
@BeforeTest
	
	public void setData() {
		
	excelfile = "TC003_EditLead";
	
		}	
@Test(dataProvider="getData")

public void EditLed(String uName, String pwd, String fName, String ComName) {
	
	
	
}

}
