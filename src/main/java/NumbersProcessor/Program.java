package NumbersProcessor;

import NumbersProcessor.logic.NumbersProcessor;
import NumbersProcessor.support.FileHelper;

import java.util.List;

public class Program {

    private NumbersProcessor numbersProcessor;
    private FileHelper fileHelper;

    public Program(NumbersProcessor numbersProcessor, FileHelper fileHelper) {
        this.numbersProcessor = numbersProcessor;
        this.fileHelper = fileHelper;
    }

    public String startApp(String path) {
        List<String> list = numbersProcessor.processString(fileHelper.read(path));
        return fileHelper.writeListToFile(path, list);
    }
}


