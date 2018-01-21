package logic;import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class DataFilter {


    public List<String> filterNumberStrings(List<String> list) {
        List<String> listContainingDigitsAsStrings = new ArrayList<String>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).matches("^[\\d\\s]+$")) {
                String currentString = list.get(i);
                String currentStringTrimmed = currentString.trim();
                listContainingDigitsAsStrings.add(currentStringTrimmed);
            }
        }
        //System.out.println(listContainingDigitsAsStrings);
        //  removeSpacefromBeginingAndEnd(listContainingDigitsAsStrings);
        return listContainingDigitsAsStrings;

    }
}




