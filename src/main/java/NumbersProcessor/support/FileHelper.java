package NumbersProcessor.support;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileHelper {


    public List<String> read(String path) {
        File file = new File(path);
        List<String> readList = new ArrayList<>();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                readList.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return readList;
    }

    public String writeF(String path, List<String> finalList) {
        String outputPath = path.replace("liczby.txt", "liczbyNew.txt");

        try (PrintWriter printWriter = new PrintWriter(outputPath)) {
            for (int i = 0; i < finalList.size(); i++) {
                String value = finalList.get(i);
                printWriter.write(value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return outputPath;
    }
}



