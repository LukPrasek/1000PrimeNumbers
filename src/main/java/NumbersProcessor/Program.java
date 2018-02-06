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
        List<String> listF = fileHelperRequest(path);
        List<String> list = requestNumbersProcessing(listF);
        return fileHelper.writeF(path, list);

    }

    public List<String> fileHelperRequest(String path) {

        return fileHelper.read(path);
    }

    public List<String> requestNumbersProcessing(List<String> list) {
        return numbersProcessor.filterNumberStrings(list);
    }
}


