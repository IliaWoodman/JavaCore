package InputOutputStreams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) throws IOException {
        String a = "При работе с текстовыми и бинарными файлами нам необходимо использовть разные типы стримов \n" +
            "FileReader and FileWriter используются для работы текстовыми файлами";

        try (FileWriter writer = new FileWriter("s.txt");
             FileReader reader = new FileReader("s.txt");) { // для того чтобы не закрывать поток вручную
            writer.write(a);                                         // помещаем создание writer в скобки к try
            System.out.println("Done");
        } catch (
            IOException e) {
            e.printStackTrace();
        }
    }
}
