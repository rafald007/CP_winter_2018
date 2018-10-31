package pl.waw.sgh;

public class HoopHoopLittleLoop {
    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            System.out.println("I=" +i);
        }
        for(int i=6; i>1; i--) {
            if (i==5) continue; //pomija obecna iteracje, nie wykona petli gdzie i=5, przezskoczy do petli gdzie i=4
            System.out.println("I = " + i);
            if (i==4) break;
        }
        System.out.println();
        int j=0;
        while (j<6) {
            System.out.println("J=" + j);
            j++;
        }

        int k=2;
        do {
            System.out.println("K=" + k);
            k--;

        } while (k>2);

    }
}
