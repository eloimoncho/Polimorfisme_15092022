public class Cercle extends Figura{
    double radi;

    public Cercle (double r){
        this.radi=r;
    }

    public double area() {
        return  Math.PI * Math.pow(radi,2);
    }

}
