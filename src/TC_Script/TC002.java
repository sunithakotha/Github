package TC_Script;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import Com_hrms_lib.General;

public class TC002 {
	//public static void main(String orgs[]) {
	@Test
	public void tc002() {
		DOMConfigurator.configure("log4j.xml");
		General obj =new General();
		obj.openApplication();
		obj.login();
		obj.enterFrame();
		obj.addNewEmpl();
		obj.exitFrame();
		obj.logout();
		obj.closeApplication();
	}

}