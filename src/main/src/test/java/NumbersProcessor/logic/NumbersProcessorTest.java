package NumbersProcessor.logic;

import org.junit.Assert;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumbersProcessorTest {

    //given

    private NumbersProcessor numbersProcessor = new NumbersProcessor();

    public List<String> readFileToCreateListForTest() {
        String path = "D:\\Users\\212434152\\Lukasz\\private\\java\\workspace\\1000PrimeNumbers\\src\\main\\src\\test\\resources\\Test_2.txt";
        File file = new File(path);
        List<String> enterList = new ArrayList<>();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                enterList.add(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return enterList;
    }

    public List<String> createListAsResultOfTest() {
        String pathResult = "D:\\Users\\212434152\\Lukasz\\private\\java\\workspace\\1000PrimeNumbers\\src\\main\\src\\test\\resources\\Test_2_result.txt";
        File file = new File(pathResult);
        List<String> resultList = new ArrayList<>();

        try (Scanner scanner = new Scanner(file)) {

            while (scanner.hasNextLine()) {
                resultList.add(scanner.nextLine() + "\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return resultList;
    }
    @org.junit.Test
    public void filterNumberStringsTest() {

        //given
        numbersProcessor = new NumbersProcessor();
        List<String> expected = createListAsResultOfTest();

        //when
        List<String> actual = numbersProcessor.filterNumberStrings(readFileToCreateListForTest());

        //then
        Assert.assertEquals(expected.get(0), actual.get(0));
        Assert.assertEquals(expected, actual);
    }
}