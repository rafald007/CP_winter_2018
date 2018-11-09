package pl.waw.sgh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) throws FileNotFoundException {
        int tiktok[][] = new int[3][3];

        File inFile = new File("C:\\Users\\rd73190\\Desktop\\tictac.txt");
        Scanner scanner = new Scanner(inFile);
        int k=0;
        while (scanner.hasNext()){
            String line = scanner.nextLine();
            System.out.println(k + ": "+ line);
            k++;
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<0;j++){

            }
        }


    }
}
