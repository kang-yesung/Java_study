package ch18.sec03.exam03;

import java.io.*;

public class CopyExample {
    public static void main(String[] args) {
        String originalFileName = "test.txt";
        String targetFileName = "testCopy.txt";

        try {
            InputStream is = new FileInputStream(originalFileName);
            OutputStream os = new FileOutputStream(targetFileName);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
