package pl.waw.sgh;

import java.util.Scanner;

public class InputParameter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter some stuff: ");
        while (scanner.hasNext()) {
            String name = (scanner.next()); //next zapisze dane jako string, mozna uzywac np nextBoolean, aby byly w odpowiednim typem
            if (name.equals("exit")) break;
            System.out.println("Hello " + name);
            // \t - tabulator
            // \n - new line
            // \r\n
        }
        while (scanner.hasNextInt()) {
            Integer myInt = scanner.nextInt();
            if (myInt.equals(0)) break;
            System.out.println("I got: " + myInt);
        }
    }
}
