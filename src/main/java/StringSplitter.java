import java.lang.reflect.Array;
import java.util.*;
import java.util.regex.Pattern;

public class StringSplitter {


    Map<Integer, String[]> map = new HashMap<Integer, String[]>();

    public Map<Integer, String[]>  splitString(List<String> listInjected) {

        for (int i = 0; i < listInjected.size(); i++) {

            String[] tab = listInjected.get(i).split("\\b\\s+\\b");

            map.put(i, tab);
        }
        for (int key : map.keySet()) {
            String[] value = map.get(key);
           // System.out.println(key + ": " + Arrays.asList(value));

        }
        return map;
    }
}

