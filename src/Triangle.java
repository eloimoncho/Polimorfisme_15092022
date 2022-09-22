public class Triangle extends Figura{
    double base,altura;

    public Triangle (double b,double a){
        this.base=b;
        this.altura=a;
    }

    public double area() {
        return (base * altura)/2;
    }


}
