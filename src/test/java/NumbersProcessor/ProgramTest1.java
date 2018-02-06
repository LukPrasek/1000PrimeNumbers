package NumbersProcessor;

import NumbersProcessor.logic.NumbersProcessor;
import NumbersProcessor.support.FileHelper;
import org.junit.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyList;
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
        String path = "foo";
        List<String> list1 = generateSupportRandomList(1);
        List<String> list2 = generateSupportRandomList(2);

        when(mockFileHelper.read(path)).thenReturn(list1);
        when(mockNumbersProcessor.filterNumberStrings(list1)).thenReturn(list2);

        //when
        program.startApp(path);

        //then
        verify(mockFileHelper).writeF(path, list2);
    }

    private List<String> generateSupportRandomList(int loop) {
        List<String> generatedList = new ArrayList<>();
        for (int i = 1; i <= loop; i++) {
            generatedList.add("Horse");
            generatedList.add("Cow");
            generatedList.add("Bull");
        }
        return generatedList;
    }


}