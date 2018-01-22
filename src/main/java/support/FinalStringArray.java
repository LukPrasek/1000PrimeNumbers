package support;import java.util.HashMap;
import java.util.Map;

public class FinalStringArray {

    Map<Integer, String> finalHashMap = new HashMap<Integer, String>();

    public Map<Integer, String> calculateSumInRow(Map<Integer, Integer[]> mapWithSum) {

        for (int key : mapWithSum.keySet()) {
            Integer[] value = mapWithSum.get(key);
            Integer[] tab = new Integer[value.length + 1];
            String[] mapWithStringValues;

            int sum = 0;
            String valuesInOneRow = "";

            for (int i = 0; i < value.length; i++) {

                sum += value[i];

                int currentValue = value[i];

                valuesInOneRow += currentValue + " + ";//
                if (currentValue == value[value.length - 1]) {
                    valuesInOneRow += currentValue + " = " + sum+"\n";//
                }

                //System.out.println(valuesInOneRow);
            }
            finalHashMap.put(key, valuesInOneRow);

        }

        for (int k : finalHashMap.keySet()) {
            String val = finalHashMap.get(k);
            System.out.println(val);


        }
        return finalHashMap;
    }
}

