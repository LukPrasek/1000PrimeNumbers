package NumbersProcessor.logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumbersProcessor {

    public List<String> processString(List<String> readList) {

        List<String> outputList = new ArrayList<>();

        for (String currentString : readList) {
            String outputLine = "";
            int sumOfSingleLine = 0;

            if (!(filterStringWithNumbersAndSpacesOnly(currentString).equals(""))) {

                String[] arrayWithDigits = trimAndSplitStringByWhiteSpaces(currentString);

                for (String digitString : arrayWithDigits) {
                    int number = parseStringToInteger(digitString);
                    sumOfSingleLine += number;
                    outputLine += " + " + number;
                }
                outputLine += " = " + sumOfSingleLine + "\n";
                outputLine = outputLine.replaceFirst("[\\s]+[+]\\s+", "");
                outputList.add(outputLine);
            }
        }

        return outputList;
    }

    private int parseStringToInteger(String digitString) {
        return Integer.valueOf(digitString);
    }

    private String[] trimAndSplitStringByWhiteSpaces(String currentString) {
        return currentString.trim().split((("\\b\\s+\\b")));
    }

    private String filterStringWithNumbersAndSpacesOnly(String candidate) {
        if (candidate.matches("^[\\d\\s]+$")) {
            return candidate;

        } else {
            return "";
        }
    }
}