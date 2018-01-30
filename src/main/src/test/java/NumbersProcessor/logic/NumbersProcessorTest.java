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
    List<String> resultList= new ArrayList<String>();
    List<String> enterList= new ArrayList<String>();

    public List<String> readFileToCreateListForTest() {
        String path = "D:\\Users\\212434152\\Lukasz\\private\\java\\workspace\\1000PrimeNumbers\\src\\main\\src\\test\\resources\\Test_1.txt";
        File file = new File(path);
        enterList = new ArrayList<String>();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                enterList.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Enter liste:\n"+enterList);
        return enterList;
    }

    public List<String> createListAsResultOfTest() {
        String pathResult = "D:\\Users\\212434152\\Lukasz\\private\\java\\workspace\\1000PrimeNumbers\\src\\main\\src\\test\\resources\\Test_1_result.txt";
        File file = new File(pathResult);
        resultList = new ArrayList<>();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                resultList.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Result list from file:"+resultList);
        return resultList;
    }


    @org.junit.Test
    public void filterNumberStringsTest() {

        //when
        numbersProcessor = new NumbersProcessor();
        numbersProcessor.filterNumberStrings(enterList);

        //then
        System.out.println("Po wyjsciu z metody" + numbersProcessor.filterNumberStrings(enterList));
        System.out.println("Wynik z pliku" + resultList);

        Assert.assertEquals(resultList, numbersProcessor.filterNumberStrings(enterList));
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