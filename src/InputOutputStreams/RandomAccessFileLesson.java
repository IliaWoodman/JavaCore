package InputOutputStreams;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileLesson {
    // Класс RandomAccessFile позволяет читать инфу из любого места в файле и записывать инфу в любое место в файле
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("s.txt", "rw")) { // rw - read and write, r - read, w - write
            //read
            int a = file.read();
            System.out.println((char) a);
            String s1 = file.readLine();
            System.out.println(s1);
            file.seek(87); // установить курсор на позицию ...
            System.out.println(file.getFilePointer()); // полуить позицию курсора
            String s2 = file.readLine();
            System.out.println(s2);

            //write
            file.seek(0);
//            file.writeBytes("Privet"); // перепишет первые 6 символов
            file.seek(file.length()-1); // попали в конец файла
            file.writeBytes("\nTolstoi L.N");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
