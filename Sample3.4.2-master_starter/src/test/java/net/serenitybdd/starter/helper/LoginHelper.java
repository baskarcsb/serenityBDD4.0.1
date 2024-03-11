package net.serenitybdd.starter.helper;

import net.serenitybdd.starter.pages.LoginPage;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class LoginHelper extends ScenarioSteps {
	
	LoginPage loginPage;
	
	
	public LoginHelper(Pages Pages) {
		super(Pages);
	}
	
	
	public void openLoginPage() throws Exception {
		loginPage.openPage();
	}
	
}