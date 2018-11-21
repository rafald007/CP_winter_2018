package pl.waw.sgh.Shapes;

import pl.waw.sgh.Objects.PlayWithRectangles;

public class Rectangle extends Shape {
    /*private double parA = 0; //jesli pominiemy public albo static i nie napiszemy nic, operator będzei dostepny w całej paczce
    private double parB = 0;*/ //protected makes operator visible to children and private for others

    public Rectangle(double parA, double parB) {
        super(parA, parB); //points to the super class(parent - Shape.java)
    }


    public double CalculateSurface() {
        return parA*parB;
    }

    public void setParB(double parB){
        this.parB = parB;
    }
    public String toString(){
        return getClass().getSimpleName() + "[" + parA + ", " + parB + "] Sruface: " +
                CalculateSurface();
    }
}
