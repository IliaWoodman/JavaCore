package InputOutputStreams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathsAndFilesLesson1 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("w.txt");
        Path directoryPath = Paths.get("/Users/ilya.romanenko/Desktop/N");

        System.out.println("filePath.getFileName() " + filePath.getFileName());
        System.out.println("directoryPath.getFileName() " + directoryPath.getFileName());
        System.out.println("______________________");

        System.out.println("filePath.getParent() " + filePath.getParent());
        System.out.println("directoryPath.getParent() " + directoryPath.getParent());
        System.out.println("______________________");

        System.out.println("filePath.getRoot() " + filePath.getRoot());
        System.out.println("directoryPath.getRoot() " + directoryPath.getRoot());
        System.out.println("______________________");

        System.out.println("filePath.isAbsolute() " + filePath.isAbsolute());
        System.out.println("directoryPath.isAbsolute() " + directoryPath.isAbsolute());
        System.out.println("______________________");

        System.out.println("filePath.toAbsolutePath() " + filePath.toAbsolutePath());
        System.out.println("directoryPath.toAbsolutePath() " + directoryPath.toAbsolutePath());
        System.out.println("______________________");

        System.out.println("filePath.toAbsolutePath().getParent() " + filePath.toAbsolutePath().getParent());
        System.out.println("directoryPath.toAbsolutePath().getParent() " + directoryPath.toAbsolutePath().getParent());
        System.out.println("______________________");

        Path anotherPath = Paths.get("/Users/ilya.romanenko/Desktop/N/M/Z/test2.txt");
        System.out.println("directoryPath.relativize(anotherPath) " + directoryPath.relativize(anotherPath)); // путь для anotherPath относительно directoryPath
        System.out.println("______________________");

        /////////////////////////////////////////////Files////////////////////////////////////////////////////

        if (!Files.exists(filePath)){
            Files.createFile(filePath);
        }
        if (!Files.exists(directoryPath)){
            Files.createDirectory(directoryPath);
        }

        System.out.println("Files.isReadable(filePath) " + Files.isReadable(filePath));
        System.out.println("______________________");
        System.out.println("Files.isWritable(filePath) " + Files.isWritable(filePath));
        System.out.println("______________________");
        System.out.println("Files.isExecutable(filePath) " + Files.isExecutable(filePath));
        System.out.println("______________________");

        Path filePath2 = Paths.get("/Users/ilya.romanenko/Desktop/QA/JAVA/JavaCore/w.txt");
        System.out.println("Files.isSameFile(filePath, filePath2) " + Files.isSameFile(filePath, filePath2));
        System.out.println("______________________");

        System.out.println("Files.size(filePath) " + Files.size(filePath));
        System.out.println("______________________");

        System.out.println("Files.getAttribute(filePath, \"creationTime\") " + Files.getAttribute(filePath, "creationTime"));
        System.out.println("______________________");

        System.out.println("Files.getAttribute(filePath, \"size\") " + Files.getAttribute(filePath, "size"));
        System.out.println("______________________");

        System.out.println("Files.readAttributes(filePath, \"*\") " + Files.readAttributes(filePath, "*")); //return Map
        System.out.println("______________________");
    }
}
