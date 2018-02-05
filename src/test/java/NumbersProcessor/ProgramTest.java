package NumbersProcessor;

import NumbersProcessor.logic.NumbersProcessor;
import NumbersProcessor.support.FileHelper;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.ArgumentCaptor;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ProgramTest {

    @Test
    public void startAppTest() {
        //Given
        String path = "D:\\Users\\212434152\\Lukasz\\private\\java\\workspace\\1000PrimeNumbers\\src\\main\\resources\\liczby.txt";
        NumbersProcessor mockNumbersProcessor = mock(NumbersProcessor.class);
        FileHelper mockFileHelper = mock(FileHelper.class);
        Program program = new Program(mockNumbersProcessor, mockFileHelper);
        List<String>testList=new ArrayList<>();


        //when
        program.startApp(path);
        final ArgumentCaptor<String> pathCaptor = ArgumentCaptor.forClass((Class) String.class);

        final ArgumentCaptor<List<String>> listCaptor = ArgumentCaptor.forClass((Class) List.class);

        final ArgumentCaptor<List<String>> finalListCaptor = ArgumentCaptor.forClass((Class) List.class);

        //then

        verify(mockFileHelper).writeF(pathCaptor.capture(),finalListCaptor.capture());


        Assert.assertEquals(mockFileHelper.read(path), listCaptor.getValue());
        Assert.assertEquals(path, pathCaptor.getValue());
        Assert.assertEquals(testList, finalListCaptor.getValue());

        Assert.assertEquals(path, pathCaptor.getValue());//same functionality for this method as verify
        verify(mockFileHelper).read(path);

        verify(mockNumbersProcessor).filterNumberStrings(listCaptor.capture());
        verify(mockNumbersProcessor).filterNumberStrings(new ArrayList<>());
    }
}