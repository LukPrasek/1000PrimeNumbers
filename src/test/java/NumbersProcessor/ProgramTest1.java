package NumbersProcessor;

import NumbersProcessor.logic.NumbersProcessor;
import NumbersProcessor.support.FileHelper;
import org.junit.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class ProgramTest1 {

    @Test
    public void shouldCheckIfPathIsPassedToFileHelper() {
        //given
        FileHelper mockFileHelper = mock(FileHelper.class);
        NumbersProcessor mockNumbersProcessor = mock(NumbersProcessor.class);
        Program program = new Program(mockNumbersProcessor, mockFileHelper);
        String path = "foo";

        //when
        program.fileHelperRequest(path);

        //then
        verify(mockFileHelper).read(path);

    }

    @Test
    public void shouldCheckIfListIsPassedToNumbersProcessor() {
        //given
        FileHelper mockFileHelper = mock(FileHelper.class);
        NumbersProcessor mockNumbersProcessor = mock(NumbersProcessor.class);
        Program program = new Program(mockNumbersProcessor, mockFileHelper);
        List<String> injectedList = mock(ArrayList.class);

        //when
        program.requestNumbersProcessing(injectedList);

        //then
        verify(mockNumbersProcessor).filterNumberStrings(injectedList);
    }

    @Test
    public void shouldCheckIfPathAndListArePassedToWriteMethod() {
        //given
        FileHelper mockFileHelper = mock(FileHelper.class);
        NumbersProcessor mockNumbersProcessor = mock(NumbersProcessor.class);
        Program program = new Program(mockNumbersProcessor, mockFileHelper);
        String path = "foot";
        List<String> injectedList = mock(ArrayList.class);
        System.out.println(injectedList.toString());

        //when
        program.startApp(path);

        //then
        verify(mockFileHelper).writeF(path, mockFileHelper.read(path));
        System.out.println(mockFileHelper.read(path));
         }


}