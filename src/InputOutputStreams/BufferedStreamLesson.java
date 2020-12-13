package InputOutputStreams;

import java.io.*;

public class BufferedStreamLesson {
    // Использование буферизации в стримах позволяет достичь большей эффективности при чтении файла или записи в него
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("s.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("t.txt"));) {
            int character;
//            while ((character = reader.read()) != -1){
//                writer.write(character);
//            }
            String line;
            while ((line = reader.readLine()) != null){
                writer.write(line);
                writer.write("\n");
            }
            System.out.println("Done");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
