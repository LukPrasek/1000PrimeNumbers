package support;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumbersProcessor {

    public List<String> filterNumberStrings(List<String> readList) {
        List<String> listContainingDigitsAsStrings = new ArrayList<String>();

        for (int i = 0; i < readList.size(); i++) {
            if (readList.get(i).matches("^[\\d\\s]+$")) {
                String currentStringContainingOnlyNumbers = readList.get(i);
                String currentStringTrimmed = currentStringContainingOnlyNumbers.trim();
                String[] splittedStringIntoDigits = currentStringTrimmed.split("\\b\\s+\\b");
                Integer[] stringParser = getIntegers(splittedStringIntoDigits);
                listContainingDigitsAsStrings.add(Arrays.toString(stringParser) + "\n");
            }
        }
        System.out.println(listContainingDigitsAsStrings);
        return listContainingDigitsAsStrings;

    }

    private Integer[] getIntegers(String[] splittedStringIntoDigits) {
        Integer[] stringParser = new Integer[splittedStringIntoDigits.length + 1];
        int sumOfSingleLine = 0;
        for (int j = 0; j < splittedStringIntoDigits.length; j++) {
            int singleDigit = Integer.parseInt(splittedStringIntoDigits[j]);
            stringParser[j] = singleDigit;
            sumOfSingleLine += stringParser[j];
            if (j == splittedStringIntoDigits.length - 1) {
                stringParser[j + 1] = sumOfSingleLine;
            }
        }
        return stringParser;
    }
}




