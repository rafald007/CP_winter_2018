package pl.waw.sgh;


public class Loop1 {

   /* public static int sumbowl(int row){
        if (row==1) return 1;
        else return sumbowl(row-1)+row;
    }*/

    public static void main(String[] args) {
        int n=10;
        for (int i=n; i>0;i--){
            for(int k=0; k<n;k++){
                if (k<i) System.out.println( "*");

            }
            System.out.println();
        }

        /*int a=3;
        int b=5;
        System.out.println("sum is: " + sumbowl(a,b));*/


        int m=3;
        int b=0;
        String liczby="";
        for(int i=1; i<100;i++){
            int c=0;
            for (int k = i; k >= 1; k--) {
                    if (i%k==0){
                        c=c+1;
                    }
            }
            if (c==2) {
                liczby=liczby + i + " ";
                b++;
            }
            if (b==m) break;
        }
        System.out.println(b);
        System.out.println(liczby);


        /*int q=20;
        int w=0;
        for (int i=1;i<100;i++){
            int f=0;
            for (int k=i;k>=i;k--){
                if (i%k==0) f=f+1;
            }
        }*/

        //FIBONACCI
        int p=0;
        int o=1;
        String fibonacci="Ciag fibonacciego: ";
        for (int i=0;i<100;i++){
            fibonacci=fibonacci + p + " "+o+" ";

            p=p+o;
            o=p+o;
        }
        System.out.println(fibonacci);




    }
}
