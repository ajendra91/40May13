package corejava;

import java.io.*;
import java.util.Scanner;

public class Prog7 {

    public static void main(String[] args) throws IOException {


        DataInputStream dis=new DataInputStream(System.in);
        String str=dis.readLine();
        System.out.println(str);

        Scanner sc=new Scanner(System.in);
        String str2=sc.next();
        System.out.println(str2);

        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br =new BufferedReader(isr);
        String str3=br.readLine();
        System.out.println(str);

        PrintWriter pw =new PrintWriter(System.out,true);
        pw.println("ajendra is here");

    }

}
