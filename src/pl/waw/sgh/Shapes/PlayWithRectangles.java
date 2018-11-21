package pl.waw.sgh.Shapes;

import pl.waw.sgh.Objects.Rectangle;

public class PlayWithRectangles {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 5);//dzięki zdefiniowaniu Constructora w Rectangle.java, możemy podawać parametry przy deklarowaniu i pominąć deklarowanie w głównym kodzie parametrów
//        r1.setParams(4,5);
//        r1.parB = 30; //nie jest to zalecana metoda. Nie powinno dawac sie bezpośredniego dostępu do manipulowania parametrami
        r1.setParB(30);
        System.out.println("Sarface = " + r1.CalculateSurface());

        Rectangle r2 = new Rectangle(3,4);
//        r2.setParams(3,4);
        System.out.println("R2 = " + r2.CalculateSurface());
        System.out.println("R2 = " + r2.toString() );

        System.out.println("R3: " + new Rectangle(5,6).toString()); //Magic Pog
    }
}
