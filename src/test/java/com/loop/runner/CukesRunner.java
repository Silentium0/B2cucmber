package com.loop.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/html-reports/cucumber-report.html",
                "json:target/json-report/json-report.json"},
        features = "src/test/resources/features",
        glue = "com/loop/step_definitions",
        dryRun = true,
        tags =  "@SmartBears" //  or @smoke1 or @smoke2 or @smoke3"   // if you want to run all  of them
        //monochrome = true
)

public class CukesRunner {

}
