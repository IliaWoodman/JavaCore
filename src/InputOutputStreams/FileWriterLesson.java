package InputOutputStreams;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterLesson {
    // Stream (поток) для работы с файлами - это упорядоченная последовательность данных
    // Файлы делят на читабельные для человека и на нечитабельные
    // При работе с текстовыми и бинарными файлами нам необходимо использовть разные типы стримов
    // FileReader and FileWriter используются для работы текстовыми файлами
    public static void main(String[] args) throws IOException {
        String a = "При работе с текстовыми и бинарными файлами нам необходимо использовть разные типы стримов \n" +
            "FileReader and FileWriter используются для работы текстовыми файлами";
        String b = "\nprivet";  //
        FileWriter writer = null;
        try {
            writer = new FileWriter("s.txt", true);
//            for (int i = 0; i < a.length(); i++) {
//                writer.write(a.charAt(i));  // первый способ
//            }
            writer.write(a); // второй способ
            writer.write(b); // для того чтобы не перезаписать а добавить текст к уже записанному в конструкторе FileWriter нужно указать "true"
            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            writer.close();
        }
    }
}
