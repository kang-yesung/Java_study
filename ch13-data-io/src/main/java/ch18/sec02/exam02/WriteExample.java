package ch18.sec02.exam02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

public class WriteExample {
    public static void main(String[] args) {
        byte[] array = { 10, 20, 30 };
        try(OutputStream outputStream = new FileOutputStream("test2.db")) {
            outputStream.write(array);
            outputStream.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
