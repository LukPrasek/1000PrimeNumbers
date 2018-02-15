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
        List<String> list = numbersProcessor.processStringList(fileHelper.read(path));
        return fileHelper.writeF(path, list);
    }
}


