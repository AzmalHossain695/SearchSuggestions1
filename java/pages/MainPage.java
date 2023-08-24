package pages;

import org.openqa.selenium.By;
import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.ITextBox;

public class MainPage {

    public void sendCellValuesToInput(String value) {     
            ITextBox input = AqualityServices.getElementFactory().getTextBox(By.xpath("//textarea[@type='search']"), "Search Box");
            input.clearAndType(value);             
    }
}