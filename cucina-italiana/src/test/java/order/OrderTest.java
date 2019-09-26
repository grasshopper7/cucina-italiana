package order;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"html:target/html","json:target/json/report.json","junit:target/junit/report.xml"})
public class OrderTest {

}
