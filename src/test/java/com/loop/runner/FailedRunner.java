package com.loop.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/html-reports/cucumber-report.html",
                "json:target/json-report/json-report.json"},
        features = "@target/rerun.txt",
        glue = "com/loop/step_definitions",
        monochrome = true
)

public class FailedRunner {


}


