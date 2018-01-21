package support;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringSplitter {

    public List<String> splitString(List<String> listInjected) {
        List<String> list = new ArrayList<String>();
        String tab[];

        for (int i = 0; i < listInjected.size(); i++) {
            tab = listInjected.get(i).split("\\b\\s+\\b");
            list.addAll(Arrays.asList(tab));
            if (!(i == listInjected.size() - 1)) {
                list.add("\n");
                System.out.println(list);
            }
        }
        return list;
    }
}

