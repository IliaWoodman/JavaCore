package InputOutputStreams.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationLesson1 {
    /*
     Сериализаци - это процесс преобразования объекта в последовательность байт
     Десериализация - это процесс всстановления объекта из этих байт
     */

    // Поля класса, помеченные ключевым словом transient не записываются в файл при сериализации
    public static void main(String[] args) {
        List<String> employees = new ArrayList<>();
        employees.add("Zaur");
        employees.add("Ivan");
        employees.add("Elena");

        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("employees1.bin"));) {
            outputStream.writeObject(employees);
            System.out.println("Done");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}