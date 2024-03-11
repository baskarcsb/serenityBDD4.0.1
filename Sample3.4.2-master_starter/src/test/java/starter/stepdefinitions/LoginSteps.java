package starter.stepdefinitions;

import net.serenitybdd.annotations.Steps;
import net.serenitybdd.starter.helper.LoginHelper;
import io.cucumber.java.en.Given;

public class LoginSteps { 
	
	public String eDriverExe = "src/test/resources/drivers/chromedriver.exe";
	public String eDriver = "webdriver.chrome.driver";
	  
	@Steps
	LoginHelper loginHelper;

    @Given("^I launch selenium framework website$")
    public void launchSeleniumWebsite() throws Exception {
    	System.setProperty(eDriver, eDriverExe); 
    	loginHelper.openLoginPage();
    }
}
