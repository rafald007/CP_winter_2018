package pl.waw.sgh;

public class Blocks {
    //visibility everywhere
    //public static int i0=5;
    // for static variables public/protected doesnt change anything inside the package (folder),
    // however the variable won't be available outside the package if we set it as protected
    static int i0=5;
    //private static int i0=5; means that the variable will be available only in this class

    static final String MY_CONSTANT = "text text"; //zmienna, ktora jest stala w calym kodzie

    public static void main (String[] args) {
        int i1=0;
        System.out.println("Outside the block i0=" + i0);
        {
            System.out.println("New block i1=" + i1);
            {
                System.out.println("Inside internal block i1=" + i1);
            }
            int i2=5;
            System.out.println("New block i2=" + i2);

        }
        System.out.println("Outside the block i1=" +i1);
        System.out.println("Outside the block constant = " + MY_CONSTANT);
        //i2 not visable in current block
        //System.out.println("Outside the block i2=" +i2);

        int i4= 5%2; //reszta z dzielenia
        System.out.println(i4);
    }
}
