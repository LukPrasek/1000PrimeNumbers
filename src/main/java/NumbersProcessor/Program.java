package NumbersProcessor;

import NumbersProcessor.logic.NumbersProcessor;
import NumbersProcessor.support.FileHelper;

import java.io.File;
import java.util.List;

public class Program {

    private NumbersProcessor numbersProcessor;
    private FileHelper fileHelper;

    public Program(NumbersProcessor numbersProcessor, FileHelper fileHelper) {
        this.numbersProcessor = numbersProcessor;
        this.fileHelper = fileHelper;
    }

    public void startApp(String path) {


        String outputPath = path.replace("liczby.txt", "liczbyNew.txt");

        File file = new File(path);
        File fileO = new File(outputPath);

        FileHelper fileHelper = new FileHelper();
        List<String> list = fileHelper.read(file);

        NumbersProcessor numberSeparator = new NumbersProcessor();
        List<String> listContainingDigitsAsStrings = numberSeparator.filterNumberStrings(list);
        fileHelper.writeF(fileO,listContainingDigitsAsStrings);


    }
}


