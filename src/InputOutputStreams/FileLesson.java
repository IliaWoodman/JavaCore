package InputOutputStreams;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileLesson {
    // Класс File позволяет управлять информацией о файлах и директориях
    public static void main(String[] args) throws IOException {
        File file = new File("s.txt");
        File file2 = new File("w.txt");
        File folder = new File("/Users/ilya.romanenko/Desktop/A");
        File folder2 = new File("/Users/ilya.romanenko/Desktop/B");

        System.out.println("file.getAbsoluteFile()   " + file.getAbsoluteFile());
        System.out.println("folder.getAbsoluteFile()   " + folder.getAbsoluteFile());

        System.out.println("________________________");
        System.out.println("file.isAbsolute() " + file.isAbsolute());
        System.out.println("folder.isAbsolute() " + folder.isAbsolute());

        System.out.println("________________________");
        System.out.println("file.isDirectory() " + file.isDirectory());
        System.out.println("folder.isDirectory() " + folder.isDirectory());

        System.out.println("________________________");
        System.out.println("file.isDirectory() " + file.isDirectory());
        System.out.println("folder.isDirectory() " + folder.isDirectory());

        System.out.println("________________________");
        System.out.println("file.exists() " + file.exists());
        System.out.println("file2.exists() " + file2.exists()); // false
        System.out.println("folder.exists() " + folder.exists());
        System.out.println("folder2.exists() " + folder2.exists()); // false

        System.out.println("________________________");
        System.out.println("file2.createNewFile() " + file2.createNewFile()); // true
        System.out.println("folder2.mkdir() " + folder2.mkdir());
        System.out.println("file2.createNewFile() " + file2.createNewFile()); // false так как файл создался ранее

        System.out.println("________________________");
        System.out.println("file.length() " + file.length());
        System.out.println("file2.length() " + file2.length());
        System.out.println("folder.length() " + folder.length());

        System.out.println("________________________");
        System.out.println("file2.delete() " + file2.delete());
        System.out.println("folder.delete() " + folder2.delete()); // не удалит папку если она не пуста

        System.out.println("________________________");
        File[] files = folder.listFiles();
        System.out.println("folder.listFiles() " + Arrays.toString(files));

        System.out.println("________________________");
        System.out.println("file.isHidden() " + file.isHidden());
        System.out.println("file.canRead() " + file.canRead());
        System.out.println("file.canWrite() " + file.canWrite());
        System.out.println("file.canExecute() " + file.canExecute());



    }
}
