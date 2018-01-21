import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import support.FinalStringArray;
import support.FileHelper;
import support.StringParser;
import support.StringSplitter;
import logic.DataFilter;




public class Main {

public static void main (String[] args) {

        String path = "D:\\Users\\212434152\\Lukasz\\private\\java\\workspace\\1000PrimeNumbers\\src\\main\\src\\main\\resources\\liczby.txt";
        String outputPath = path.replace("liczby.txt", "liczbyNew.txt");

        File file = new File(path);

        support.FileHelper fileHelper = new FileHelper();
        List<String> list = fileHelper.read(file);

        logic.DataFilter numberSeparator = new DataFilter();
        List<String> listContainingDigitsAsStrings = numberSeparator.filterNumberStrings(list);

        support.StringSplitter stringSplitter = new StringSplitter();
        Map<Integer, String[]> map = stringSplitter.splitString(listContainingDigitsAsStrings);

        support.StringParser stringParserInsideMap = new StringParser();
        Map<Integer, Integer[]> mapWithDigit = stringParserInsideMap.parseStringToInt(map);

        support.FinalStringArray sumCalculation = new FinalStringArray();
        Map<Integer, String> finalMap= sumCalculation.calculateSumInRow(mapWithDigit);

        File fileString = new File(outputPath);
        fileHelper.writeF(fileString,finalMap);
    }


}
