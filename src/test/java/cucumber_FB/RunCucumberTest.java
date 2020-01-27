package cucumber_FB;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\kaurj\\Desktop\\cucumber_FB\\src\\test\\java\\cucumber_FB\\FB.feature",
        plugin = {"html:target/cucumber-html-report"}
)
public class RunCucumberTest {
}