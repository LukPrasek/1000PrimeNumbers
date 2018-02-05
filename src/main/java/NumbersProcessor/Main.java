package NumbersProcessor;

import NumbersProcessor.support.FileHelper;
import NumbersProcessor.logic.NumbersProcessor;

public class Main {


    public static void main(String[] args) {
        String path = "D:\\Users\\212434152\\Lukasz\\private\\java\\workspace\\1000PrimeNumbers\\src\\main\\resources\\liczbyM.txt";
        Program program = new Program(new NumbersProcessor(), new FileHelper());
        program.startApp(path);
    }

}

