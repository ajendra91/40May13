package corejava;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class Prog1 {

    public static void main(String[] args) {

        File file =new File("HELP.md");
        File file2 =new File("ajay.csv");
        File file3 =new File("newFold");
        File file4=new File("src/main/resources");
        //if(file.renameTo(file2)){System.out.println(file2.getName());}
        //if(file3.mkdirs()){System.out.println(file3.getName());}
        if(file3.delete()){System.out.println("deleted"+file3.getName());}

        FilenameFilter fnf= new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith("properties");
            }
        };

        String[] str=file4.list(fnf);
        Arrays.stream(str).forEach(s->{
            System.out.println(s);
        });
        System.out.println(file.getName());
        System.out.println(file.getPath());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getAbsolutePath());


        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file.getParent());
        System.out.println(file.exists());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.lastModified());

    }

}
