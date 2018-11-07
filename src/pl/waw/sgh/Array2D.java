package pl.waw.sgh;

import java.util.Arrays;

public class Array2D {
    public static void main(String[] args){
        //cos jak sudoku???
        int arr2d[][]=new int[5][5];

        arr2d[0][0]= 1;
        arr2d[1][1]= 2;
        arr2d[2][0]= 9;
        arr2d[3][2]= 5;
        arr2d[4][3]= 6;
        arr2d[2][4]= 7;
        arr2d[4][4]= 7;
        int sumkol[]=new int[6];
        int temp=0;
        System.out.println(Arrays.deepToString(arr2d));

        for(int i=0;i<5;i++){
            int sumar=0;
            int kol1=0;
            for(int j=0;j<5;j++){
                kol1=kol1+arr2d[j][i];
                sumar=sumar+arr2d[i][j];
                System.out.print((arr2d[i][j])+ " ");

            }
            sumkol[i]=kol1;
            temp=temp+sumar;

            System.out.println(sumar + " ");
        }
        int suma=0;
        for (int i=0;i<5;i++){

            suma=suma+sumkol[i];

        }
        sumkol[5]=suma+temp;
        for (int i=0;i<6;i++)System.out.print(sumkol[i]+ " ");
//        for(int i=0;i<5;i++) {
//            System.out.println((arr2d[i]));
//        }


    }
}
