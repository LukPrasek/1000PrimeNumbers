import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

public class Main {

public static void main (String[] args) {

        String path = "src/main/resources/liczby.txt";
        String outputPath = path.replace("liczby.txt", "liczbyNew.txt");

        File file = new File(path);

        FileHelper fileHelper = new FileHelper();
        List<String> list = fileHelper.readFileAsListOfString(file);

        DataFilter numberSeparator = new DataFilter();
        List<String> listContainingDigitsAsStrings = numberSeparator.filterNumberStrings(list);

        StringSplitter stringSplitter = new StringSplitter();
        Map<Integer, String[]> map = stringSplitter.splitString(listContainingDigitsAsStrings);

        StringParser stringParserInsideMap = new StringParser();
        Map<Integer, Integer[]> mapWithDigit = stringParserInsideMap.parseStringToInt(map);

        FinalStringArray sumCalculation = new FinalStringArray();
        Map<Integer, String> finalMap= sumCalculation.calculateSumInRow(mapWithDigit);

        File fileString = new File(outputPath);
        fileHelper.writeFileAsListOfString(fileString,finalMap);
    }


}
