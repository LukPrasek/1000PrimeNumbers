package NumbersProcessor;

import NumbersProcessor.logic.NumbersProcessor;
import NumbersProcessor.support.FileHelper;
import org.junit.Test;
import org.mockito.Matchers;
import org.mockito.Mockito;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;

public class ProgramTest {
    //Given
//@Before
//    public String path = "D:\\Users\\212434152\\Lukasz\\private\\java\\workspace\\1000PrimeNumbers\\src\\main\\resources\\liczby.txt";



    @Test
    public void startApp() {

        NumbersProcessor mockNumbersProcessor = mock(NumbersProcessor.class);
        FileHelper mockFileHelper = mock(FileHelper.class);
        File mockFile = mock(File.class);
        List mockList = Mockito.mock(ArrayList.class);

        Mockito.when(mockFileHelper.read(mockFile)).thenReturn(new ArrayList<>());
        Mockito.when(mockFileHelper.read(Matchers.anyObject())).thenReturn(new ArrayList<String>());
        Mockito.when(mockFileHelper.read(Matchers.anyObject())).thenReturn(new ArrayList<String>());
        Mockito.when(mockNumbersProcessor.filterNumberStrings(mockList)).thenReturn(new ArrayList<Integer>());//bzdura
        //Mockito.verify(mockFileHelper, Mockito.times(1)).read(Matchers.anyObject());//nie wywoluje tej metody

    }
}