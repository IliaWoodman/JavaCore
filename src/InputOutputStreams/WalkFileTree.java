package InputOutputStreams;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class WalkFileTree {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/Users/ilya.romanenko/Desktop/X");
        Files.walkFileTree(path, new MyFileVisitor());
    }

}

class MyFileVisitor implements FileVisitor<Path> {

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("Enter to Directory: " + dir);
        return FileVisitResult.CONTINUE; //FileVisitResult - enum, читай ниже
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println("File name: " + file.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        System.out.println("Error with file visiting: " + file.getFileName());
        return FileVisitResult.TERMINATE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("Exit from Directory: " + dir);
        return FileVisitResult.CONTINUE;
    }

}
// Значения FileVisitResult
// CONTINUE - означает что нужно продолжать рбход по файлам
// TERMINATE - означает что нужно немедленно прекратить обход по файлам
// SKIP - означает что в данную директорию заходить не надо
// SKIP_SIBLINGS - означает что в данной директории продолжать обход по файлам не нужно