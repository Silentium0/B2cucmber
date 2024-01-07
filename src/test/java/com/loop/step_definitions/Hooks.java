package com.loop.step_definitions;

import com.loop.utilitues.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @Before
    public void setUp(){
        Driver.getDriver();
    }
    @After
    public void tearDown(Scenario scenario){
        // only take a screenshot when scenario failed
        if (scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png",scenario.getName());
        }
        //Driver.closeDriver();

    }
    @AfterStep
    public void screenShot(Scenario scenario){
        // only take a screenshot when scenario failed
        if (scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png",scenario.getName());
        }
        //Driver.closeDriver();

    }
}
