package NumbersProcessor;

import NumbersProcessor.logic.NumbersProcessor;
import NumbersProcessor.support.FileHelper;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;

public class ProgramTest {

    @Test
    public void startApp() {
        //Given
        String path = "D:\\Users\\212434152\\Lukasz\\private\\java\\workspace\\1000PrimeNumbers\\src\\main\\resources\\liczby.txt";
        NumbersProcessor mockNumbersProcessor = mock(NumbersProcessor.class);
        FileHelper mockFileHelper = mock(FileHelper.class);
        File mockFile = mock(File.class);
        List mockList = Mockito.mock(ArrayList.class);
        Program program = new Program(mockNumbersProcessor, mockFileHelper);

        //when
        Mockito.when(mockFileHelper.read(mockFile)).thenReturn(new ArrayList<>());
        Mockito.when(mockNumbersProcessor.filterNumberStrings(mockList)).thenReturn(new ArrayList());

        //then

        Assert.assertEquals(new ArrayList<>(), mockFileHelper.read(mockFile));
        Assert.assertEquals(new ArrayList<>(), mockNumbersProcessor.filterNumberStrings(mockList));

    }
}