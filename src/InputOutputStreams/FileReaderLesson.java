package InputOutputStreams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderLesson {
    public static void main(String[] args) throws IOException {
        FileReader reader = null;

        reader = new FileReader("s.txt");
        int character;
        String s = "";
        while ((character = reader.read()) != -1){
            s = s + ((char) + character);
            System.out.print((char) character);
        }
        System.out.println();
        System.out.println("Done");
        System.out.println(s);
        reader.close();
    }
}
