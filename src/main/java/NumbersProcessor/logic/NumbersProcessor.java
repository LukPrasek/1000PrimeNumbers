package NumbersProcessor.logic;

import java.util.ArrayList;
import java.util.List;

public class NumbersProcessor {
    
    
    public List<String> processStringList(List<String> stringList) {
        
        List<String> outputList = new ArrayList<>();
        
        for (String string : stringList) {
            
            String outputLine = null;
            int sum = 0;
            if (filterStringsWithNumbersAndSpacesOnly(string) != null) {
                // 1   2    4    6
                String[] digitsArray = trimAndSplitStringByWhiteSpaces(string);
                // [1,2,4,6]
                for (String stringWithDigits : digitsArray) {
                    int currentNumber = parseStringOfDigits(stringWithDigits);
                    sum += currentNumber;
                    outputLine += "  +  " + currentNumber;
                }
                //[    +   1    +    2
                outputLine.replaceFirst("  +", "   ");
                outputLine += "  =  " + sum;
                
            }
            
            outputList.add(outputLine);
        }
        
        return outputList;
    }
    
    
    private String filterStringsWithNumbersAndSpacesOnly(String candidate) {
        if (candidate.matches("^[\\d\\s]+$")) {
            return candidate;
        } else {
            return null;
        }
    }
    
    
    private String[] trimAndSplitStringByWhiteSpaces(String string) {
        return string.trim().split(("\\b\\s+\\b"));
    }
    
    
    private int parseStringOfDigits(String string) {
        return Integer.valueOf(string);
    }
}


