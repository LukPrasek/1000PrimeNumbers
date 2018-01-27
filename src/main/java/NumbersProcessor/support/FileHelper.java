package NumbersProcessor.support;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileHelper {

    public List<String> read(File file) {
        List<String> readList = new ArrayList<String>();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                readList.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return readList;
    }

    public List<String> writeF(File file, List<String> finalList) {
        try (PrintWriter printWriter = new PrintWriter(file)) {
            for (int i = 0; i < finalList.size(); i++) {
                String value = finalList.get(i);
                printWriter.write(value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}



