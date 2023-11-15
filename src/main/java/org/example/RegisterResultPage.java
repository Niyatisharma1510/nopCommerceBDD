package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterResultPage extends Utils{
    String expectedRegistrationSuccessMessage = "Your registration completed..";

    public void verifyUserRegisteredSuccessfully(){
        //verify user registered successfully or not
        String actualRegistrationMessage= getTextFromElement(By.className("result"));
        Assert.assertEquals(actualRegistrationMessage, expectedRegistrationSuccessMessage, "Your registration is not completed or message is incorrect");

    }
}
