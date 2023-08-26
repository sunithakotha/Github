package Com_hrms_lib;


import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.trms.utility.Log;

public class General extends Globle {
	
	public void openApplication() {
		 driver=new FirefoxDriver();
		 driver.get(url);
		System.out.println("Application Opend");
		Log.info("Application opend");
	
	}
		public void closeApplication() {
			driver.close();
			System.out.println("Application close");
			Log.info("application close");
		}
		public void login(){
			driver.findElement(By.name(txt_loginname)).sendKeys(un);
			driver.findElement(By.name(txt_password)).sendKeys(up);
			driver.findElement(By.name(btn_login)).click();
			System.out.println("login completed");
			Log.info("Login completed");
			
		}
		public void logout(){
			driver.findElement(By.linkText(link_logout)).click();
			System.out.println("Logout completed");	
			Log.info("Logout completed");
}
	public void enterFrame() {
		driver.switchTo().frame(frame_empinfo);
		System.out.println("Entered into frame");
		Log.info("Entered into frame");
	}
	public void exitFrame() {
		driver.switchTo().defaultContent();
		System.out.println("Exit from frame");
		Log.info("Exit from frame");
	}
	public void addNewEmpl() {
		driver.findElement(By.xpath(btn_Add)).click();
		driver.findElement(By.name(txt_efn)).sendKeys(efn);
		driver.findElement(By.name(txt_eln)).sendKeys(eln);
		driver.findElement(By.id(btn_save)).click();
		System.out.println("New Emp Added");
		Log.info("New Emp Add ");
	}
	}
			
	
	

