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
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    }
    public void verifyLinkTextColour(){
        String s = element.getCssValue("color");
        String c = Color.fromString(s).asHex();
        System.out.println("This colour is after hovering "+c);
        Assert.assertEquals(c,expectedColour,"Link colour has not been changed");
    }
}
