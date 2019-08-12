package order;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"html:target/html","json:target/json/report.json","junit:target/junit/report.xml"})
public class OrderTest {

}
