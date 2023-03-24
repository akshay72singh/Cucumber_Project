package hooks;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

public class TestRunnerForHooks {
	
	
	
	
	@RunWith(Cucumber.class)
	@CucumberOptions(features = "src/test/resourcesHooksDemo/HooksDemo.feature", glue = { "hooks" }
//			monochrome = true,
//			plugin = { "json", "html:target/HtmlReports" }
	// plugin = {"pretty","json:target/JSONReports/report.json"} // for generating
//	     tags = {"@smoke"}
	)
	public class RunWithSingleTags {

	}

}
