package NumbersProcessor.logic;

import java.util.ArrayList;
import java.util.List;

public class NumbersProcessor {
    
    
    public List<String> processStringList(List<String> stringList) {
        
        List<String> outputList = new ArrayList<>();
        
        for (String string : stringList) {
            int sum = 0;
            if (!filterStringsWithNumbersAndSpacesOnly(string).equals("")) {
                String[] digitsArray = trimAndSplitStringByWhiteSpaces(string);
        
                String outputLine = "";
        
                for (String stringWithDigits : digitsArray) {
                    int currentNumber = parseStringOfDigits(stringWithDigits);
                    System.out.println(currentNumber);
                    sum += currentNumber;
                    outputLine += "  +  " + currentNumber;
                }
                outputLine = outputLine.replaceFirst("\\s+\\p{Punct}", "");
                outputLine += "  =  " + sum;//TODO
                outputList.add(outputLine);
            }
        }
        return outputList;
    }
    
    
    private String filterStringsWithNumbersAndSpacesOnly(String candidate) {
        if (candidate.matches("^[\\d\\s]+$")) {
            return candidate;
        } else {
            return "";
        }
    }
    
    
    private String[] trimAndSplitStringByWhiteSpaces(String string) {
        return string.trim().split(("\\b\\s+\\b"));
    }
    
    
    private int parseStringOfDigits(String string) {
        return Integer.valueOf(string);
    }
}


