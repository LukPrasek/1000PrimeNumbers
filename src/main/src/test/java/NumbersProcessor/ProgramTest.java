package NumbersProcessor;

import NumbersProcessor.logic.NumbersProcessor;
import NumbersProcessor.support.FileHelper;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ProgramTest {

    @Test
    public void startAppTest() {
        //Given
        String path = "D:\\Users\\212434152\\Lukasz\\private\\java\\workspace\\1000PrimeNumbers\\src\\main\\resources\\liczby.txt";
        String tryOne = "as";
        NumbersProcessor mockNumbersProcessor = mock(NumbersProcessor.class);
        FileHelper mockFileHelper = mock(FileHelper.class);
        List mockList = Mockito.mock(ArrayList.class);
        Program program = new Program(mockNumbersProcessor, mockFileHelper);

        //when
        program.startApp(path);


        //then
        verify(mockFileHelper).read(path);
        //Assert.assertEquals(mockFileHelper.read(tryOne), mockNumbersProcessor.filterNumberStrings(new ArrayList<>()));
        verify(mockFileHelper.writeF(path, mockList));
    }


}