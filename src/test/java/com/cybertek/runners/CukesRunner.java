package com.cybertek.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-report.html",
        features = "src\\test\\resources\\features",
        glue = "com\\cybertek\\step_defenitions",
        tags = "@step1 or @step2 or @step3"

)

public class CukesRunner {
}