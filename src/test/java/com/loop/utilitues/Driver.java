package com.loop.utilitues;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {

    private Driver() {
        }

    /*
    making driver instance private
    static - run before everything else and also use in static method
     */

        //private static WebDriver driver;

    /*
    reusable method that will return the same driver instance every time called
     */

    private static  InheritableThreadLocal<WebDriver> drivePool = new InheritableThreadLocal<>();

        /**
         * singleton pattern
         *
         * @return driver
         */
        public static WebDriver getDriver() {
            if (drivePool.get() == null) {
                String browserType = ConfigurationReader.getProperty("browser");
                switch (browserType.toLowerCase()) {
                    case "chrome":
                        WebDriverManager.chromedriver().setup();
                        drivePool.set( new ChromeDriver());
                        drivePool.get().manage().window().maximize();
                        drivePool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                        break;
                    case "firefox":
                        WebDriverManager.firefoxdriver().setup();
                        drivePool.set (new FirefoxDriver());
                        drivePool.get().manage().window().maximize();
                        drivePool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                        break;
                }
            }
            return drivePool.get();
        }

        /**
         * closing driver
         *
         *
         */
        public static void closeDriver() {
            if (drivePool.get() != null) {
                drivePool.get().quit();
                drivePool.remove();
            }
        }
    }

