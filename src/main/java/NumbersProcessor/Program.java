package NumbersProcessor;

import NumbersProcessor.logic.NumbersProcessor;
import NumbersProcessor.support.FileHelper;

import java.util.ArrayList;
import java.util.List;

public class Program {

    private NumbersProcessor numbersProcessor;
    private FileHelper fileHelper;

    public Program(NumbersProcessor numbersProcessor, FileHelper fileHelper) {
        this.numbersProcessor = numbersProcessor;
        this.fileHelper = fileHelper;
    }

    public String startApp(String path) {
        return fileHelper.writeF(path, requestNumbersProcessing(fileHelperRequest(path)));
    }

    public List<String> fileHelperRequest(String path) {
        return fileHelper.read(path);
    }

    public List<String> requestNumbersProcessing(List<String> list) {
        return numbersProcessor.filterNumberStrings(list);
    }
}


