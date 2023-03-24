package hooks;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

// ----- feature = your cucumber folder exe path
//-----first = you package name
//----monochrome = true, // ------------ It gives you a formeted answer
//---- plugin = {"pretty","json:target/JSONReports/report.json"} // for generating report
// ----JSONReports = file name
//-----JSON report and you should create a file.json
//------- tags = {"@smoke and @regreation or @sanity and not @smoke"}
//------it is not possible to place tags above "Background" or steps (when , and , Then , Given , But)
@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features", glue = { "first" }
//		monochrome = true,
//		plugin = { "json", "html:target/HtmlReports" }
// plugin = {"pretty","json:target/JSONReports/report.json"} // for generating
//     tags = {"@smoke"}
)
public class RunWithSingleTags {

}
