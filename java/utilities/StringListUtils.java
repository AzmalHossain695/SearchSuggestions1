package utilities;

import java.util.List;

public class StringListUtils {

    public static String getShortestString(List<String> stringList) {
        if (stringList == null || stringList.isEmpty()) {
            return null;
        }

        String shortestString = stringList.get(0);
        for (String str : stringList) {
            if (str.length() < shortestString.length()) {
                shortestString = str;
            }
        }

        return shortestString;
    }

    public static String getLongestString(List<String> stringList) {
        if (stringList == null || stringList.isEmpty()) {
            return null;
        }

        String longestString = stringList.get(0);
        for (String str : stringList) {
            if (str.length() > longestString.length()) {
                longestString = str;
            }
        }

        return longestString;
    }
}