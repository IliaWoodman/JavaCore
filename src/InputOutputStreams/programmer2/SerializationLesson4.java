package InputOutputStreams.programmer2;

import InputOutputStreams.programmer1.Employees;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationLesson4 {
    public static void main(String[] args) {
        Employees employees;

        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("employees2.bin"))) {
            employees = (Employees) inputStream.readObject();
            System.out.println(employees);

        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }
}
