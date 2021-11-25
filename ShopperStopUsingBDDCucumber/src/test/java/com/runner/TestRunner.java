package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="features",
glue = "com.stepdef",
monochrome=true,
//dryRun = true,
plugin = {"pretty","html:target/index.html","json:target.myreport.json"}
)
public class TestRunner {

}
