package testclasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import aquality.selenium.browser.AqualityServices;
import aquality.selenium.browser.Browser;
import utilities.JsonUtils;

public class BaseTest {
	private Browser browser;

    @BeforeMethod
    public void setUp() {
        browser = AqualityServices.getBrowser();
        browser.maximize();
        browser.goTo(JsonUtils.getUrl());
    }

   @AfterMethod
    public void tearDown() {
        if (browser != null) {
            browser.quit();
        }
    }
}