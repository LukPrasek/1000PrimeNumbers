package NumbersProcessor;

import NumbersProcessor.support.FileHelper;
import NumbersProcessor.logic.NumbersProcessor;

public class Main {


    public static void main(String[] args) {
        String path = "d:\\luk\\java\\workspace\\InteliiJ\\1000PrimeNumbers\\src\\main\\resources\\liczbyM.txt";
        Program program = new Program(new NumbersProcessor(), new FileHelper());
        program.startApp(path);
    }

}

