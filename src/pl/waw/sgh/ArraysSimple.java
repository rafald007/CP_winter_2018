package pl.waw.sgh;

import java.util.Arrays;

public class ArraysSimple {
    public static void main(String[] args){
//        int[] arrInt = new int[3];
        Integer[] arrInt = new Integer[3]; //zamiast 0 do szeregu wstawi warotsci null
        arrInt[0] = 1;
        arrInt[1] = 2;
        arrInt[2] = 3;

        for (int i=0;i<arrInt.length;i++){
            System.out.println("Elem " + i + " = " + (arrInt[i]+10));

        }
        System.out.println(Arrays.toString(arrInt));

        String[] arrString = new String[]{
                "rafal", "michal",
                "gabriel"
        };
        System.out.println(Arrays.toString(arrString));


    }
}
