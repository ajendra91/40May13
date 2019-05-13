package corejava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Prog8 {

    public static void main(String[] args) throws IOException {

        FileOutputStream fos=new FileOutputStream("ajay.csv");
        String str="demo app here";
        byte []b =str.getBytes();
        fos.write(b);
        fos.close();

        FileInputStream fis =new FileInputStream("ajay.csv");
        byte b1[]=fis.read();

    }
}
