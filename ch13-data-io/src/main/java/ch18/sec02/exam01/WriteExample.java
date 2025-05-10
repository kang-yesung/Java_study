package ch18.sec02.exam01;

import java.io.*;

public class WriteExample {
    public static void main(String[] args){
        byte a = 10;
        byte b = 20;
        byte c = 30;

        try( Writer writer = new OutputStreamWriter(
//                new FileOutputStream("/Users/kang-yeseong/Desktop/temp/test1.txt"), "UTF-8")) {
                new FileOutputStream("test1.db"))) {
            writer.write(a);
            writer.write(b);
            writer.write(c);

            writer.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
