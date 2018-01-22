import logic.Processor;
import support.FileHelper;
import support.NumbersProcessor;
import support.StringSplitter;

import java.io.File;
import java.util.List;




public class Main {

        private Processor processor;

        public Main(Processor processor) {
                this.processor = processor;
        }

public static void main (String[] args) {

        String path = "D:\\luk\\java\\workspace\\InteliiJ\\1000PrimeNumbers\\src\\main\\resources\\liczby.txt";
           String outputPath = path.replace("liczby.txt", "liczbyNew.txt");
        //  Main main=new Main(Processor);

        File file = new File(path);

        support.FileHelper fileHelper = new FileHelper();
        List<String> list = fileHelper.read(file);

        NumbersProcessor numberSeparator = new NumbersProcessor();
        List<String> listContainingDigitsAsStrings = numberSeparator.filterNumberStrings(list);

//        support.StringSplitter stringSplitter = new StringSplitter();
//        List<String[]> listString = stringSplitter.splitString(listContainingDigitsAsStrings);

//        support.StringParser stringParserInsideMap = new StringParser();
//        List<Integer> listWithDigit = stringParserInsideMap.parseStringToInt(listString);
//
//        support.FinalStringArray sumCalculation = new FinalStringArray();
//        Map<Integer, String> finalMap= sumCalculation.calculateSumInRow(mapWithDigit);
//
//        File fileString = new File(outputPath);
//        fileHelper.writeF(fileString,finalMap);
//    }

}
}
