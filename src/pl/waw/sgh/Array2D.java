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

        System.out.println(Arrays.deepToString(arr2d));

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print((arr2d[i][j])+ " ");
            }
            System.out.println();
        }
//        for(int i=0;i<5;i++) {
//            System.out.println((arr2d[i]));
//        }


    }
}
