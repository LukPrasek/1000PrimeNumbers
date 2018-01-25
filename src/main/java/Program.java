import logic.NumbersProcessor;
import support.FileHelper;

import java.io.File;
import java.util.List;

public class Program {

    private NumbersProcessor numbersProcessor;
    private FileHelper fileHelper;

//    public Program(NumbersProcessor numbersProcessor, FileHelper fileHelper) {
//        this.numbersProcessor = numbersProcessor;
//        this.fileHelper = fileHelper;
//    }

//    public Program() {
//    }

    public void startApp() {
        String path = "D:\\Users\\212434152\\Lukasz\\private\\java\\workspace\\1000PrimeNumbers\\src\\main\\resources\\liczby.txt";

        String outputPath = path.replace("liczby.txt", "liczbyNew.txt");
        //  Main main=new Main(Processor);

        File file = new File(path);
        File fileO = new File(outputPath);



        support.FileHelper fileHelper = new FileHelper();
        List<String> list = fileHelper.read(file);

        NumbersProcessor numberSeparator = new NumbersProcessor();
        List<String> listContainingDigitsAsStrings = numberSeparator.filterNumberStrings(list);
        fileHelper.writeF()


//        System.out.println("**************");
//        System.out.println(fileHelper.read(file));
//        System.out.println("**************");
//        List<String> list1=fileHelper.read(file);
//        List<String> list= numbersProcessor.filterNumberStrings(list1);
//        File fileString = new File(outputPath);
//        fileHelper.writeF(fileString, list);
    }
}


