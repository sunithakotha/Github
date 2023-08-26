package TC_Script;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import Com_hrms_lib.General;
public class TC001 {
	//public static void main(String[]orgs) {
	@Test
	public void tc001() {

	DOMConfigurator.configure("log4j.xml");
	
		General obj =new General();
		obj.openApplication();
		obj.login();
		obj.logout();
		obj.closeApplication();
	}

}

	
	



