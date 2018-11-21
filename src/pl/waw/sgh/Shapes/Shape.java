package pl.waw.sgh.Shapes;

public class Shape {

    protected double parA = 0; //jesli pominiemy public albo static i nie napiszemy nic, operator będzei dostepny w całej paczce
    protected double parB = 0;
    public Shape(double parA, double parB){
        setParams(parA, parB);
    }// CONSTRUCTOR
   /* public Rectangle(){
    }*/

    public void setParams(double parA, double B){
        this.parA = parA; //this.parA i parA są zupełnie innymi zmiennymi, jedna obowiązuje tylko w tej funkcji, a druga jest ustawiona globalnie
        parB = B;
    }

    public double CalculateSurface() {
        return -100;
    }
    public String toString(){
        return getClass().getSimpleName() + "[" + parA + ", " + parB + "] Surface: " +
                CalculateSurface();
    }
}
