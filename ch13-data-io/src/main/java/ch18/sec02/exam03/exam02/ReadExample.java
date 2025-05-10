package ch18.sec02.exam03.exam02;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;

public class ReadExample {
    public static void main(String[] args) {
        byte[] data;
        try (InputStream is = new FileInputStream("test1.db")) {
            data = new byte[100];
            int bytesRead = is.read(data);  // 바이트 배열에 데이터 읽기
            for (int i = 0; i < bytesRead; i++) {
                System.out.println("data[" + i + "] = " + data[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
