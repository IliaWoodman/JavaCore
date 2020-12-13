package InputOutputStreams;

import java.io.*;

public class DataInputOutputStream {
    //    DataOutputStream; DataInputStream позволяют записывать в файл и читать из него примитивные типы данных
    public static void main(String[] args) {
        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("my_test.bin"));
            DataInputStream inputStream = new DataInputStream(new FileInputStream("my_test.bin"));
             ) {

            outputStream.writeBoolean(true);
            outputStream.writeByte(5);
            outputStream.writeDouble(5.3);
            outputStream.writeInt(1313);

            System.out.println(inputStream.readBoolean());
            System.out.println(inputStream.readByte());
            System.out.println(inputStream.readDouble());
            System.out.println(inputStream.readInt());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
