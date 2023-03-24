package first;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)                                        //   ----- feature = your cucumber folder exe path
@CucumberOptions(features="src\\test\\resources\\Features",glue= {"first"},  // --first = you package name
monochrome=true   ,//------------ It gives you a formeted answer 
plugin = {"json","html:target/HtmlReports"}
//plugin = {"pretty","json:target/JSONReports/report.json"}        // for generating JSON report and you should create a file.json
		)                                                                                           //JSONReports = file name
public class Runner {

}
