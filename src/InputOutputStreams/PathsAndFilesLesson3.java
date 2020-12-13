package InputOutputStreams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathsAndFilesLesson3 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test11.txt");
//        Files.createFile(filePath);
//        String dialog = "-Privet\n-Privet\n-Poka";
//        Files.write(filePath, dialog.getBytes());

        System.out.println(Files.readAllLines(filePath));
    }
}
