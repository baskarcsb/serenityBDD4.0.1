package net.serenitybdd.starter.pages;

import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void openPage() throws Exception {
		open();
		//Assume that the test is running for 10 minutes on a particular session
		//Added thread.sleep for 10 minutes to be on same session - waiting for 10 minutes in same session . 
		Thread.sleep(600000);
	}
	
}