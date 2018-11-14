package pl.waw.sgh;

import java.io.File;
import java.io.FileWriter;

public class FileSize {

    public static String file(){
        File newFile= new File("c:/temp");
        if (newFile.isDirectory()){
            File[] files= newFile.listFiles();
            if (files.length==0)
        }
    }

    public static void main(String[] args) {
        File newFile = new File("c:/temp");
        String[] temp = new String[];

        if (newFile.isDirectory()){
            File[] files = newFile.listFiles();
            for (File f:files) {
                System.out.println(f.getName() + " length:" + f.length());
                if (f.length())
            }
        }

    }
}
