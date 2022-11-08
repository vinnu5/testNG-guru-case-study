package runcOOkamber;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src/test/resources/demoGURU/demoGuru.feature"}, glue= {"guru"},tags="@NegativeTesting")
public class gururun extends AbstractTestNGCucumberTests{

}
