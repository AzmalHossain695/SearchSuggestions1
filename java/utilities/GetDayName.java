package utilities;

import java.util.Calendar;

public class GetDayName {
	 public static String getDayName() {
	        String[] dayNames = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
	        Calendar calendar = Calendar.getInstance();
	        int dayNumber = calendar.get(Calendar.DAY_OF_WEEK) - 1;
	        return dayNames[dayNumber];
	    }
}