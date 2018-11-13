package pl.waw.sgh;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) throws FileNotFoundException {
//        int tiktok[][] = new int[3][3];
////        tiktok[0][0] = 1;
////        tiktok[0][1] =1 ;
////        tiktok[0][2] = 1;
////        tiktok[1][0] = 1;
////        tiktok[1][1] = 1;
////        tiktok[1][2] = 1;
////        tiktok[2][0] = 1;
////        tiktok[2][1] = 1;
////        tiktok[2][2] = 1;
//        int win=0;
//        for (int i=0;i<3;i++){
//            for (int j=0;j<3;j++){
//                Scanner scanner = new Scanner(System.in);
//                System.out.print("enter some stuff: ");
//                int ab=scanner.nextInt();
//                tiktok[i][j]=ab;
//            }
//        }
//        int sumkol [] = new int[3];
//        for (int i=0;i<3;i++) {
//            int sumar=0;
//            int kol1=0;
//            for (int j = 0; j < 3; j++) {
//                kol1=kol1+tiktok[j][i];
//                sumar=sumar+tiktok[i][j];
//                System.out.print(tiktok[i][j] + " ");
//
//            }
//            sumkol[i]=kol1;
//
//            System.out.println();
//            if (sumkol[i]==3){
//                System.out.println("Xs won");
//                win=1;
//            }
//            if (sumkol[i]==-3){
//                System.out.println("Os won");
//                win=1;
//            }
//            if (sumar==3){
//                System.out.println("Xs won");
//                win=1;
//            }
//            if (sumar==-3){
//                System.out.println("Os won");
//                win=1;
//            }
//            if (win==1) break;
//        }
//        if (tiktok[0][0]+tiktok[1][1]+tiktok[2][2]==3||
//                tiktok[0][2]+tiktok[1][1]+tiktok[2][0]==3) System.out.println("Xs won");
//            if (tiktok[0][2]+tiktok[1][1]+tiktok[2][0]==-3||
//                    tiktok[0][0]+tiktok[1][1]+tiktok[2][2]==-3) System.out.println("Os won");









 File inFile = new File("C:/Users/USER/Desktop/Dane.txt");
        Scanner scanner = new Scanner(inFile);
       String arr[][]=new String[3][];
        int k=0;
        int var [][]=new int[3][3];
        while (scanner.hasNext()){


            arr[k] = scanner.next().split(";");
//            int dada=Integer.parseInt(line[k]);
//            System.out.println(k + ": "+ dada);
            int q=0;
            int w=0;
            k++;

//          var = Arrays.asList(line).stream().mapToInt(Integer::parseInt).toArray();



//            if (line=="1 1 1"){
//                System.out.println("Xs won!");
//            }
//            if (line=="-1 -1 -1"){
//                    System.out.println("Os won!");
//            }


//        String Tiktak[][] = new String[3][];
//        int k=0;
//        while (k<3){
//            Tiktak[k]=scanner.hasNextInt().split(" ");
//            k++;
//        }
//
//
//
//
//
//
////        while (k<4){
////            String line = scanner.nextLine();
////            System.out.println(k + ": "+ line);
////            k++;
////            if (line=="1 1 1"){
////                System.out.println("Xs won!");
////            }
////            if (line=="-1 -1 -1"){
////                System.out.println("Os won!");
////            }
//
//
//
//        }
//        k=0;
//        while(k<3) {
//            System.out.println(arr[k]);
//            k++;
//        }
//        int arrays = Integer.parseInt(arr[0]);
//        System.out.println(arrays);
//
//
//
//
//        for(int i=0;i<3;i++){
//            for(int j=0;j<3;j++){
//
//            }
//            System.out.println();
//        }


        }
        for (int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
//                System.out.print(arr[i][j] + " ");
                var[i][j]=Integer.parseInt(arr[i][j]);
//                System.out.print(var[i][j]+" ");
            }
            System.out.println();
        }
        int win=0;
        int sumkol [] = new int[3];
        for (int i=0;i<3;i++) {
            int sumar=0;
            int kol1=0;
            for (int j = 0; j < 3; j++) {
                kol1=kol1+var[j][i];
                sumar=sumar+var[i][j];
                System.out.print(var[i][j] + " ");

            }
            sumkol[i]=kol1;

            System.out.println();
            if (sumkol[i]==3){
                System.out.println("Xs won");
                win=1;
            }
            if (sumkol[i]==-3){
                System.out.println("Os won");
                win=1;
            }
            if (sumar==3){
                System.out.println("Xs won");
                win=1;
            }
            if (sumar==-3){
                System.out.println("Os won");
                win=1;
            }
            if (win==1) break;
        }
        if (var[0][0]+var[1][1]+var[2][2]==3||
                var[0][2]+var[1][1]+var[2][0]==3) {
            System.out.println("Xs won");
            win=1;
        }
            if (var[0][2]+var[1][1]+var[2][0]==-3||
                    var[0][0]+var[1][1]+var[2][2]==-3) {
                System.out.println("Os won");
                win = 1;
            }

        if(win==0) System.out.println("It's a draw!");
    }
}
