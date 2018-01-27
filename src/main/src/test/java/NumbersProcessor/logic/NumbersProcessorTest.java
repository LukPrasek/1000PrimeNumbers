package NumbersProcessor.logic;

import java.util.Arrays;
import java.util.List;

public class NumbersProcessorTest {
    private NumbersProcessor numbersProcessor;
    List<String> actual;
    List<String> expected;

    @org.junit.Test
    public void filterNumberStringsTest() {
        numbersProcessor = new NumbersProcessor();

        String c1 = "   2 3  5 7  11 13  17 19  23 29";//+"\n"
        //String c2 = "1313 131 3115 1";
        actual = Arrays.asList(c1);
        //actual.add(c2);

        String c3 = "2 + 3 + 5 + 7 + 11 + 13 + 17 + 19 + 23 +  29 = 129";
        expected = Arrays.asList(c3);
        //expected.add(c3);
        System.out.println("Expected" + expected);
        System.out.println("Return from method" + numbersProcessor.filterNumberStrings(actual));

        // Zawsze musze miec dwie listy?? Moze jest łatwiejszy sposob na to, aby miec liste wejsciowa i wyjsciowa z automatu?


        //assertTrue(numbersProcessor.filterNumberStrings(actual).equals(actual));
        //assertArrayEquals(expected.toArray(),numbersProcessor.filterNumberStrings(actual).toArray());
        // Assert.assertTrue(actual.contains(expected));
        // assertEquals(expected,numbersProcessor.filterNumberStrings(actual));
        //assertEquals(expected.size(),numbersProcessor.filterNumberStrings(actual).size() );


    }
}