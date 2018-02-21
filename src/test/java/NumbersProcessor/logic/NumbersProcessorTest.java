package NumbersProcessor.logic;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumbersProcessorTest {


    private NumbersProcessor numbersProcessor = new NumbersProcessor();

    public List<String> readFileToCreateListForTest() {
        String path = "src\\test\\resources\\Test_1.txt";
        File file = new File(path);
        List<String> enterList = new ArrayList<>();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                enterList.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return enterList;
    }

    public List<String> createListAsResultOfTest() {
        String pathResult = "src\\test\\resources\\Test_1_result.txt";
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

    @Test
    public void shouldCheckIfReturnedListIsEqualToExpected() {

        //given
        numbersProcessor = new NumbersProcessor();
        List<String> expected = createListAsResultOfTest();
        System.out.println("expected"+expected);

        //when
        List<String> actual = numbersProcessor.processString(readFileToCreateListForTest());
        System.out.println("actual"+actual);
        //then
        Assert.assertEquals(expected, actual);
    }
}