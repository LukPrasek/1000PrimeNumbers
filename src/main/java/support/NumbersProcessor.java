package support;

import java.util.ArrayList;
import java.util.List;

public class NumbersProcessor {

    public List<String> filterNumberStrings(List<String> readList) {
        List<String> listContainingDigitsAsStrings = new ArrayList<String>();
        List<String> finalListForWritingToFile = new ArrayList<String>();

        String digitWithoutComma = "";
        for (int i = 0; i < readList.size(); i++) {
            if (readList.get(i).matches("^[\\d\\s]+$")) {
                String currentStringContainingOnlyNumbers = readList.get(i);
                String currentStringTrimmed = currentStringContainingOnlyNumbers.trim();
                String[] splitStringIntoDigits = currentStringTrimmed.split("\\b\\s+\\b");
                String singleRowArray = getIntegers(splitStringIntoDigits) + "\n";//nadpisuje liste
                finalListForWritingToFile.add(singleRowArray);
            }
        }
        System.out.println("Final list" + finalListForWritingToFile);
        return finalListForWritingToFile;
    }

    private String getIntegers(String[] splitStringIntoDigits) {
        Integer[] stringParser = new Integer[splitStringIntoDigits.length + 1];// size 10+1
        int sumOfSingleLine = 0;

        String arrayContainingSpringsAndSum = "";

        String digitAsString = "";
        String sumAsString = "";

        for (int j = 0; j < splitStringIntoDigits.length; j++) {
            int singleDigit = Integer.parseInt(splitStringIntoDigits[j]);//size 10
            stringParser[j] = singleDigit;
            sumOfSingleLine += stringParser[j];
            digitAsString = stringParser[j] + " + ";

            if (j == splitStringIntoDigits.length - 1) {//last item in the table
                stringParser[j + 1] = sumOfSingleLine;
                digitAsString = " " + stringParser[j];//override last string in the table
                sumAsString = " = " + sumOfSingleLine;
            }
            arrayContainingSpringsAndSum += digitAsString;
            arrayContainingSpringsAndSum += sumAsString;
            System.out.println(arrayContainingSpringsAndSum);
        }
        return arrayContainingSpringsAndSum;
    }


}


