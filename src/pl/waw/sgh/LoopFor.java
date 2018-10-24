package pl.waw.sgh;

public class LoopFor {
    public static void main(String[] args) {

        int[] grades = {1, 2, 3, 4, 5};
        for (int newgrades:grades
             ) {
            System.out.println(newgrades);

        }

        int[] numbers = {14,46,13,642,21,5,51,6};
        for(int i=0;i<10;i++){
            if(numbers[i]!=51)
            {
                int numbers2=numbers[i];
                System.out.println("new number = "+ numbers2);

            }
        }



    }
}
