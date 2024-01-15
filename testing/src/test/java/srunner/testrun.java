package srunner;

import org.junit.runner.RunWith;

//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/Feature/hai.feature"}, glue="definition",tags = "@PositiveTesting",plugin ={"html:testoutput/cucumber.html"})
public class testrun  {

}
