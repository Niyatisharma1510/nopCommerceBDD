package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class BrowserManager extends Utils {

    public static LoadProp loadProp = new LoadProp();
    //accessing load properties to  open a browser
    public static final String browserName = loadProp.getProperty("browser");
   // String browserName = "Chrome";
    public void openBrowser(){
        if (browserName.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }else if(browserName.equalsIgnoreCase("Edge"))
        {
            System.setProperty("webdriver.edge.driver", "src/test/resources/drivers/msedgedriver.exe");
            driver = new EdgeDriver();
        }else if(browserName.equalsIgnoreCase("gecko"))
        {
            System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
    }
    public void closeBrowser()
    {
        driver.quit();
    }
}
