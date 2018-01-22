package logic;

import support.FileHelper;

import java.io.File;
import java.util.List;

public class Processor {

    String path = "D:\\Users\\212434152\\Lukasz\\private\\java\\workspace\\1000PrimeNumbers\\src\\main\\src\\main\\resources\\liczby.txt";
    String outputPath = path.replace("liczby.txt", "liczbyNew.txt");

    File file = new File(path);

    support.FileHelper fileHelper = new FileHelper();
    List<String> list = fileHelper.read(file);
}
