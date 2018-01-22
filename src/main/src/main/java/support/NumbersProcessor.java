package support;

import java.util.ArrayList;
import java.util.List;

public class NumbersProcessor {


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




