package ch18.sec02.exam03.exam01;

import java.io.*;

public class ReadExample {
    public static void main(String[] args) {
        try (InputStream is = new FileInputStream("test1.db")) {
            int data;
            while ((data = is.read()) != -1) {
                System.out.println(data); // 10, 20, 30
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
