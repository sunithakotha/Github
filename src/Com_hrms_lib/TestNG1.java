package Com_hrms_lib;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG1 {
	@Test
	@BeforeClass 
	public void login() {
		System.out.println("Login completed");

}
	@AfterClass 
	public void lpgout() {
		System.out.println("Logout completed");
	}

public void addEmployee() {
	System.out.println("Add employee");
}


}