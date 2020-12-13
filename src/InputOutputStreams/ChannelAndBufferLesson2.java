package InputOutputStreams;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelAndBufferLesson2 {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("t.txt", "r");
             FileChannel channel = file.getChannel();) {

            ByteBuffer buffer = ByteBuffer.allocate(5);
            channel.read(buffer);
            buffer.flip();
            System.out.println((char) buffer.get());//a
            System.out.println((char) buffer.get());//b
            System.out.println((char) buffer.get());//c
            buffer.rewind();//поместит позицию на ячейку ноль
            System.out.println((char) buffer.get());//a

            System.out.println("--------------------------------");
            buffer.compact();// копирует не прочитанные ячейки в начало буфера, и позиция будет указывать на освободившуюся ячейку
            channel.read(buffer);
            buffer.flip();
            while(buffer.hasRemaining()){
                System.out.println((char) buffer.get());
            }
            System.out.println("--------------------------------");
            buffer.clear();
            channel.read(buffer);
            buffer.flip();
            System.out.println((char) buffer.get());
            buffer.mark();// пометить позицию
            System.out.println("mark");
            System.out.println((char) buffer.get());
            System.out.println((char) buffer.get());
            buffer.reset();// вернуться к помеченной позиции
            System.out.println((char) buffer.get());
            System.out.println((char) buffer.get());



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
