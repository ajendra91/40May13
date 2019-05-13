package corejava;

import java.io.*;

public class Prog6 {

    public static void main(String[] args) throws IOException {

        CharArrayWriter caw=new CharArrayWriter();

        FileWriter fw=new FileWriter("ajay.csv");
        String str="hhhhhhhhhhhhhhhh is here";
        char []ch=new char[str.length()];
        str.getChars(0,str.length(),ch,0);
        fw.write(ch);
        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]);
        }
        fw.close();

        caw.write(ch);
        System.out.println(caw.toString());

        FileReader fr=new FileReader("ajay.csv");
        char ch1[]=new char[50];
        fr.read(ch1);
        for(int i=0;i<ch1.length;i++){
            System.out.print(ch1[i]);
        }
        fr.close();




    }

}
