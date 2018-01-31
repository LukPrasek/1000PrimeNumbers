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
        String path = "D:\\Users\\212434152\\Lukasz\\private\\java\\workspace\\1000PrimeNumbers\\src\\main\\src\\test\\resources\\Test_1.txt";
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
        String pathResult = "D:\\Users\\212434152\\Lukasz\\private\\java\\workspace\\1000PrimeNumbers\\src\\main\\src\\test\\resources\\Test_1_result.txt";
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

        //when
        numbersProcessor = new NumbersProcessor();
        List<String> actual = numbersProcessor.filterNumberStrings(readFileToCreateListForTest());
        List<String> expected = createListAsResultOfTest();
        System.out.println("Actual:\n" + actual);
        System.out.println("Expected:\n" + expected);

        //then

        Assert.assertEquals(expected.get(0), actual.get(0));
        Assert.assertEquals(expected.get(1), actual.get(1));
        Assert.assertEquals(expected.get(3), actual.get(3));

        Assert.assertEquals(expected, actual);

        //Assert.assertEquals(expected, actual);
        //Assert.assertArrayEquals(resultListFromTest.toArray(), createListAsResultOfTest().toArray());
        //equals - metoda do porywnywania Lists
    }
}
//    ArrayList<String> comp_List = new ArrayList<String>();
//        for (String temp : resultListFromTest)
//                comp_List.add(expectedResultList.contains(temp) ? "Yes" : "No");
//                System.out.println(comp_List);
//
//                ArrayList<Integer> compList2 = new ArrayList<Integer>();
//        for (String temp2 : expectedResultList)
//        compList2.add(resultListFromTest.contains(temp2) ? 1 : 0);
//        System.out.println(compList2);