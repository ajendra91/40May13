package corejava;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Prog4 {

    public static void main(String[] args) throws IOException {

        FileWriter fw=new FileWriter("ajay.csv");
        String str="ajendra is here";
        char []ch=new char[str.length()];
        str.getChars(0,str.length(),ch,0);
        fw.write(ch);
        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]);
        }
        fw.close();

        FileReader fr=new FileReader("ajay.csv");
        char ch1[]=new char[50];
        fr.read(ch1);
        for(int i=0;i<ch1.length;i++){
            System.out.print(ch1[i]);
        }
        fr.close();


    }
}
