package starter;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
	    monochrome = true,
	    features = "src/test/resources/features",
	    glue="com.gehc.cb.bdd.steps",
	    stepNotifications = true,
	    plugin = {"pretty", "html:target/cucumber/report.html",
	              "json:target/cucumber/report.json",
	              "rerun:target/rerun.txt"} //Creates a text file with failed scenarios
	    		  ,tags = "@login"
               )
public class CucumberTestSuite {}
