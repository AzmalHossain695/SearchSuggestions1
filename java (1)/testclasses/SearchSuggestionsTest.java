package testclasses;

import org.testng.annotations.Test;
import utilities.WriteXLData;
import utilities.ReadXLData;
import utilities.GetSuggestionsList;
import pages.MainPage;
import java.util.List;
import utilities.StringListUtils;

public class SearchSuggestionsTest extends BaseTest {
	
	MainPage mainPage = new MainPage();
	ReadXLData xlData = new ReadXLData();
	GetSuggestionsList suggestionsList = new GetSuggestionsList();
	WriteXLData writeData = new WriteXLData();	
		
	@Test
	public void SearchTest() {	
		List<String> searchValues = xlData.getSearchInputs();
		for (String value : searchValues) {
			mainPage.sendCellValuesToInput(value);
			List<String> searchSuggestions = suggestionsList.getSuggestions();
			String longestSuggestion = StringListUtils.getLongestString(searchSuggestions);
			String shortestSuggestion = StringListUtils.getShortestString(searchSuggestions);
			writeData.writeIntoExel(longestSuggestion, shortestSuggestion);
		}
	}
}