package runnerFile;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Feature", glue= {"stepDefination"}, tags="@Smoke", monochrome = true, plugin = "html:target/cucumber-report.html")
public class Runner {

		
}
