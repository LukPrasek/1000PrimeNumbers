package NumbersProcessor;

import NumbersProcessor.support.FileHelper;
import NumbersProcessor.logic.NumbersProcessor;

public class Main {

    public static void main(String[] args) {
        String path = "src\\main\\resources\\liczby.txt";
        Program program = new Program(new NumbersProcessor(), new FileHelper());
        program.startApp(path);
    }

}

