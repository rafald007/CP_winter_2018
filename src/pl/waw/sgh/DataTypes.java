package pl.waw.sgh;

public class DataTypes {
    /*
    This is a comment
    ctrl+/ change code to comment or from comment to code
     */
    //psvm
    public static void main(String[] args) {
        byte b1 = 15;
        byte b2 = 120;
        int i1 = 43412351;
        int i2 = 627572542;

        long i3 = i1;
        //i3 = 13 + i2;
        i3 += i2;

        ///long i3 = i1 + i2;

        // sout
        System.out.println("i3: " + i3);

        //ctrl+d creates a copy of previous line;
        int a = 5;
        int b,bb;
        b = a++; //jesli nie zadeklarujemy ponizej ponownie wartosci startowej a, doda 1 do 6, a nie do 5
//        a = 5;
        bb = ++a;

        System.out.println("b=" + b);
        System.out.println("bb=" + bb);

        double d1 = 2;
        double d2 = 3;

        double d3 = Math.pow(d1,d2); //2^3

        System.out.println(d3);

        int ii1,ii2;
        ii1 = 6;
        ii2 = 5;

        if(ii1==ii2) {
            System.out.println("ii1 equals ii2");
        } else {
            System.out.println("ii1 does not equal ii2");

        }
        boolean cond = ii1==ii2;
        // ! - negate
        // || - OR
        // && - AND
        if(cond || ii1>ii2) {
            System.out.println("ii1 equals ii2");
        } else {
            System.out.println("ii1 does not equal ii2");

        }
        int iii = (ii1>5 ? 15 : 10);
        if(ii1>5){
            iii=15;
        }else{
            iii=10;
        }
        //te dwie funkcje to to samo ^^^^^^
        System.out.println(iii);



    }

}
