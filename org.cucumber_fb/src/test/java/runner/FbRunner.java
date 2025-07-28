package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\java\\feature\\FbLogin.feature",glue="steps",publish=true)
public class FbRunner extends AbstractTestNGCucumberTests{
	
		

}
