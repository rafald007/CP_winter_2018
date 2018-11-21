package pl.waw.sgh.Objects;

public class Rectangle {

    private double parA = 0; //jesli pominiemy public albo static i nie napiszemy nic, operator będzei dostepny w całej paczce
    private double parB = 0; //protected makes operator visible to children and private for others

    public Rectangle(double parA, double parB){
        setParams(parA, parB);
    }// CONSTRUCTOR
   /* public Rectangle(){
    }*/

    public void setParams(double parA, double B){
        this.parA = parA; //this.parA i parA są zupełnie innymi zmiennymi, jedna obowiązuje tylko w tej funkcji, a druga jest ustawiona globalnie
        parB = B;
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
