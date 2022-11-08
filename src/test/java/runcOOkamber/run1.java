package runcOOkamber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (features = {"src/main/resources/login1/login1.feature"},glue= {"cOOkamber"})
public class run1 extends AbstractTestNGCucumberTests { {

}
}