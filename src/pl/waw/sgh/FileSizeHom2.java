package pl.waw.sgh;

import java.io.File;

public class FileSizeHom2 {
    static File file=new File("C://Users//rd73190//Desktop//RD");
    public static void main(String[] args) {
        boolean IsDir = file.isDirectory();
        if(IsDir){
            int NumFiles = files(file);
            int NumFolder = folder(file);
            double TotalSize = Size(file);
            System.out.println("Liczba plików: " + NumFiles + " Liczba folderów: " + NumFolder + " Calkowity rozmiar: " + TotalSize);
        }

    }

    public static int folder(File file){
        File[] files = file.listFiles();
        int count=0;
       for(File f:files) {
           if (f.isDirectory()) {
               count++;
               folder(f);
           }

       }
       return count;
    }

    public static int files(File file){
        File[] files = file.listFiles();
        int count=0;
        for(File f:files){
            if (f.isDirectory()){
                count+=files(f);
            }
            else{
                count++;
            }
        }
        return count;
    }
    public static double Size(File file){
        File[] files= file.listFiles();
        double FileSize=0;
        for (File f:files){
            if(f.isDirectory()){
                FileSize+=Size(f);
            }
            else{
                FileSize+=f.length();
            }
        }
        return FileSize;

    }




}
