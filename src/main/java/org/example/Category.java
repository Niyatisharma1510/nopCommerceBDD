package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.testng.Assert;

public class Category extends Utils{
    static String expectedColour = "#4ab2f1";
    public static WebElement element = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/computers\"]"));
    public void verifyHoverOnComputerCategory() {
        // using action class to perform hover action
        Actions actions = new Actions(driver);
        // going to hover over on computer menu
        actions.moveToElement(element).build().perform();
    }
    public void verifyLinkTextColour(){
        //getting css value in s object
        String s = element.getCssValue("color");
        //getting hexa value in c object
        String c = Color.fromString(s).asHex();
        // print that hexa value in consol
        System.out.println("This colour is after hovering "+c);
        // verify the link color has been changed after hover over on computer link text
        Assert.assertEquals(c,expectedColour,"Link colour has not been changed");
    }
}
