package support;import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FileHelper {


    public List<String> read(File file) {
        List<String> stringList = new ArrayList<String>();
        try (Scanner scanner = new Scanner(file)) {

            while (scanner.hasNextLine()) {
                stringList.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return stringList;
    }

    public List<String> writeF(File file, Map<Integer, String> map) {
        try (PrintWriter printWriter = new PrintWriter(file)) {
            for (int k : map.keySet()) {
                String value = map.get(k);
                printWriter.write(value);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}



