package corejava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Prog3 {

    public static void main(String[] args) throws IOException {

        FileReader fr=new FileReader("ajay.csv");
        BufferedReader br=new BufferedReader(fr);
        String s;
        while ((s=br.readLine())!=null){
            System.out.println(s);
        }

    }
}
