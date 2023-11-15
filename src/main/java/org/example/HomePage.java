package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils{
    public void clickOnRegisterButton() {
        clickOnElement(By.linkText("Register"));    //Click on Register link on homepage
    }
}
