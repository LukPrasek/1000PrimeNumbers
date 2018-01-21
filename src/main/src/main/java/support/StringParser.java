package support;import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringParser {
    Map<Integer, Integer[]> mapWithInt = new HashMap<Integer, Integer[]>();

    public Map<Integer, Integer[]> parseStringToInt(Map<Integer, String[]> integerMap) {

        for (int key : integerMap.keySet()) {
            String[] value = integerMap.get(key);

            Integer[] tab = new Integer[value.length];

            for (int i = 0; i < value.length; i++) {
                tab[i] = Integer.parseInt((value[i]));
            }
            mapWithInt.put(key, tab);
        }
        for (int k : mapWithInt.keySet()) {
            Integer[] val = mapWithInt.get(k);
            //System.out.println(k + ": " + Arrays.asList(val));
        }
        return mapWithInt;
    }
}
