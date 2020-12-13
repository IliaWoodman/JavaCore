package InputOutputStreams;

import java.io.*;

public class FileInputOutputStream {
    //
    public static void main(String[] args) {
//    FileInputStream FileOutputStream используются для работы с бинарными файлами
        try (FileInputStream inputStream = new FileInputStream("/Users/ilya.romanenko/Desktop/Без названия.jpeg");
             FileOutputStream outputStream = new FileOutputStream("Без названия.jpeg");) {
            int i;
            while((i = inputStream.read()) != -1){
                outputStream.write(i);
            }
            System.out.println("Done");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}