package InputOutputStreams.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationLesson3 {
    public static void main(String[] args) {
        Car car = new Car("Tesla", "Red");
        Employees employees = new Employees("Maria","Ivanova", "IT", 200.90, car);
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("employees2.bin"))) {
            outputStream.writeObject(employees); // передаваемый объект должен имплементить интерфейс Serialization
            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
