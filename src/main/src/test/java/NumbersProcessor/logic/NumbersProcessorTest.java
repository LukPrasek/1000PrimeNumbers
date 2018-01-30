package NumbersProcessor.logic;

import org.junit.Assert;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumbersProcessorTest {
    private NumbersProcessor numbersProcessor;

    public List<String> readFileToCreateListForTest() {
        String path = "D:\\Users\\212434152\\Lukasz\\private\\java\\workspace\\1000PrimeNumbers\\src\\main\\src\\test\\resources\\Test_1.txt";
        File file = new File(path);
        List<String> enterList = new ArrayList<String>();
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
        String pathResult = "D:\\Users\\212434152\\Lukasz\\private\\java\\workspace\\1000PrimeNumbers\\src\\main\\src\\test\\resources\\Test_1_result.txt";
        File file = new File(pathResult);
        List<String> resultList = new ArrayList<String>();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                resultList.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return resultList;
    }

    @org.junit.Test
    public void filterNumberStringsTest() {
        NumbersProcessorTest npt = new NumbersProcessorTest();
        List<String> enterList = readFileToCreateListForTest();
        List<String> expectedResultList = createListAsResultOfTest();
        numbersProcessor = new NumbersProcessor();
        List<String> resultListFromTest = numbersProcessor.filterNumberStrings(readFileToCreateListForTest());

        ArrayList<String> comp_List = new ArrayList<String>();
        for (String temp : resultListFromTest)
            comp_List.add(expectedResultList.contains(temp) ? "Yes" : "No");
        System.out.println(comp_List);

        ArrayList<Integer> compList2 = new ArrayList<Integer>();
        for (String temp2 : expectedResultList)
            compList2.add(resultListFromTest.contains(temp2) ? 1 : 0);
        System.out.println(compList2);

        System.out.println(resultListFromTest.get(0));
        System.out.println(expectedResultList.get(0));

        Assert.assertTrue("Equal",resultListFromTest.get(0)==expectedResultList.get(0));

        //Assert.assertArrayEquals(numbersProcessor.filterNumberStrings(enterList).toArray(), resultList.toArray());
        //Assert.assertArrayEquals(resultListFromTest.toArray(), createListAsResultOfTest().toArray());
    }
}