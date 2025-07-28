package org.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="D:\\Greens Technologies\\Selenium_Framework\\org.facebook_cucumber\\src\\test\\java\\org\\features\\Fb_Create_NewAccount.Feature",
glue="org.steps")
public class FbRunner extends AbstractTestNGCucumberTests{

}
