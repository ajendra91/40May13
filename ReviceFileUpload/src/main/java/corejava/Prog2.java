package corejava;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.FileReader;
import java.io.IOException;

public class Prog2 {

    public static void main(String[] args) throws IOException {

        String str="aaaa bbbb ccccc";
        char []ch=new char[str.length()];
        str.getChars(0,str.length(),ch,0);

        CharArrayWriter caw=new CharArrayWriter();
        caw.write(ch);

        System.out.println(caw.toString());

        char []ch1= caw.toCharArray();
        String str2=new String(ch1);
        System.out.println(str2);

        CharArrayReader car=new CharArrayReader(ch1);
        int i;
        while ((i=car.read())!=-1){
            System.out.println((char)i);
        }

        caw.reset();
        for (int j=0;j<10;j++){
            caw.write((char)j);
        }
        System.out.println(caw.toString());




    }
}
