package pl.waw.sgh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) throws FileNotFoundException {
        File inFile = new File("C:\\Users\\rd73190\\Desktop\\DA.txt");


        Scanner scanner = new Scanner(inFile);
        int i=0;
        while (scanner.hasNext()){
            String line = scanner.nextLine();
            System.out.println(i + ": "+ line);
            i++;
        }

    }
}
