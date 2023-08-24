package utilities;

import org.openqa.selenium.By;
import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.ElementType;
import aquality.selenium.elements.interfaces.IElement;

import java.util.ArrayList;
import java.util.List;
public class GetSuggestionsList {
	
	public List<String> getSuggestions() {
		IElement searchSuggestions = AqualityServices.getElementFactory().getLabel(By.xpath("//div[@class='erkvQe']"), "Search Suggestions");
		List<IElement> suggestionElements = searchSuggestions.findChildElements(By.xpath(".//li"), ElementType.TEXTBOX);
		List<String> suggestionTexts = new ArrayList<>();
		for (IElement suggestionElement : suggestionElements) {
			suggestionTexts.add(suggestionElement.getText());
		}

		return suggestionTexts;
	}
}
