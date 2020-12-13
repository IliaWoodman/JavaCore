package ScannerLesons;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Scanner2 {
    public static void main(String[] args) {

        Set<String> set = new TreeSet<>();

        try(Scanner scanner = new Scanner(new FileReader(new File("test11.txt")))) {
            scanner.useDelimiter("\\W");
            while (scanner.hasNext()){
                String word = scanner.next();
                set.add(word);
            }
            for (String word : set){
                System.out.println(word);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
