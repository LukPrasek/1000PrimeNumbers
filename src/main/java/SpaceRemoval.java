import java.util.ArrayList;
import java.util.List;

public class SpaceRemoval {

    public List<String> removeSpacefromBeginingAndEnd(List<String> list) {

        List<String> listContainingDigitsAsStringsWithoutSpace = new ArrayList<String>();

        for (int i = 0; i < list.size(); i++) {
            String currentString =   list.get(i).replaceAll(" ","");
            listContainingDigitsAsStringsWithoutSpace.add(currentString);
           // System.out.println(listContainingDigitsAsStringsWithoutSpace);
        }
        return listContainingDigitsAsStringsWithoutSpace;
    }

}