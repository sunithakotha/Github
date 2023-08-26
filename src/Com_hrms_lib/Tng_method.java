package Com_hrms_lib;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Tng_method {
	@BeforeClass
	public void login() {
		System.out.println("Login completed");
	}
	@AfterClass
	public void login1() {
		System.out.println("logou completed");
	}
@Test(priority=2)
public void addmp() {
	System.out.println("Add new emp");
	
	
}
@Test(priority=1)
public void deleemp() {
	System.out.println("Delete emp");
		
	}
}
