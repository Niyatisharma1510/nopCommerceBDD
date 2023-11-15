package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Utils extends BasePage{
    public static void clickOnElement(By by){
        driver.findElement(by).click();
    }
    public static void typeText(By by, String text){
        driver.findElement(by).sendKeys(text);
    }
    public static String getTextFromElement(By by){
        return driver.findElement(by).getText();
    }
    public static String timeStamp(){
        String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
        return timeStamp;
    }
    public static void selectByText(By by, String text){
        Select selectDay = new Select(driver.findElement(by));
        selectDay.selectByVisibleText(text);
    }

    public static void  selectByIndexOfTheElement(By by, int index){
        Select selectMonth = new Select(driver.findElement(by));
        selectMonth.selectByIndex(index);
    }
    public static List<String> printList(By by){
        List<WebElement> products = driver.findElements(by);
        System.out.println(products.size());
        List<String > proudustsNameList = new ArrayList<>();
        for (WebElement ele:products)
        {
            proudustsNameList.add(ele.getText());
        }
        return proudustsNameList;
    }

    public static void waitForClickable(By by, int time){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public static void waitForElementToBeVisible(By by, int time){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    public static void captureScreenshot(String screenShotName)
    {

        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        try {

            FileUtils.copyFile(source, new File("ScreenshotsTS\\" + screenShotName +timeStamp()+ ".png"));
            System.out.println("Screenshot taken");
        } catch (
                Exception e) {
            System.out.println("Exception while taking screenshot" + e.getMessage());
        }
    }


}
