package InputOutputStreams;

import java.io.IOException;
import java.nio.file.*;

public class PathsAndFilesLesson2 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("w.txt");
        Path directoryPath = Paths.get("/Users/ilya.romanenko/Desktop/M");

//        Files.copy(filePath, directoryPath.resolve(filePath));// filePath скопируется по пути directoryPath + название filePath
        // можно скопировать только 1 раз, иначе будет эксепшн, если нужно перезаписать то пишем так
//        Files.copy(filePath, directoryPath.resolve(filePath), StandardCopyOption.REPLACE_EXISTING);
//        System.out.println("Done");
//        Files.copy(filePath, directoryPath.resolve("e.txt"));// filePath скопируется по пути directoryPath + e.txt


//        Path directoryBPath = Paths.get("/Users/ilya.romanenko/Desktop/B");
//        Files.copy(directoryBPath, directoryPath.resolve("B")); // содержимое папки не копируется

//        Files.move(filePath, directoryPath.resolve("w.txt")); // перемещаем файл
//        Files.move(Paths.get("s.txt"), Paths.get("test11.txt")); // так переименовываем
//        Files.delete(Paths.get("t.txt"));
//        Files.delete(directoryPath.resolve(directoryPath + "/B")); не удалит папку если она не пуста

    }
}
