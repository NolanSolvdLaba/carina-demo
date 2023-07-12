package com.zebrunner.carina.demo;

import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.webdriver.DriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebPageTest {
    @Test
    public void testWebPage() {
        DriverHelper driverHelper = new DriverHelper();

        // Open the webpage
        driverHelper.getDriver().get(R.TESTDATA.get("https://chat.openai.com/c/fe569920-1559-4cc0-b2bb-7e7653645d7c"));

        // Find the element containing the expected text
        WebElement element = driverHelper.getDriver().findElement(By.xpath("//*[text()='Welcome to Carina Demo']"));

        // Verify if the element is displayed
        Assert.assertTrue(element.isDisplayed(), "Webpage does not contain the expected text.");
    }
}
