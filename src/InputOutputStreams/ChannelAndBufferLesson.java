package InputOutputStreams;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelAndBufferLesson {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("s.txt", "rw");
             FileChannel channel = file.getChannel();) {

            ByteBuffer buffer = ByteBuffer.allocate(25); // создали буфер с вместимостью 25
            StringBuilder stix = new StringBuilder();
            int byteRead = channel.read(buffer); // записываем байты из файла в буффер

            while (byteRead > 0) { // проверяем что больше нуля
                System.out.println("read " + byteRead); // выводим сколько прочитали
                buffer.flip(); // переключаем буффер в режим чтения
                while (buffer.hasRemaining()) { // читаем до тех пор пока есть что читать
                    stix.append((char) buffer.get()); // кастить байт к char и собираем строку
                }
                buffer.clear(); // возвращаем позицию на 0
                byteRead = channel.read(buffer); // // записываем байты из файла в буффер
            }
            System.out.println(stix);
////////////////////////////////////////Записываем в файл///////////////////////////////////////////////////////////
            String text = "\nThen took the other, as just as fair,\n" +
                "And having perhaps the better claim,\n" +
                "Because it was grassy and wanted wear;\n" +
                "Though as for that the passing there\n" +
                "Had worn them really about the same.";
            //первый способ
//            ByteBuffer buffer2 = ByteBuffer.allocate(text.getBytes().length); // создали второй буффер с вместимость под наш текст
//            buffer2.put(text.getBytes()); // полижили текст в буффер
//            buffer2.flip(); // переключили в режим чтения, чтобы channel прочитал из буфера и записал в файл
//            channel.write(buffer2); // записываем в файл
            // второй способ лучше
            ByteBuffer buffer2 = ByteBuffer.wrap(text.getBytes()); // сразу записываем текст переведенный в байты в буфер
            channel.write(buffer2); // записываем в файл


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
