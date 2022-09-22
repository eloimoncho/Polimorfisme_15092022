public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Figura[] v = new Figura[5];
        v[0] = new Rectangle(5,2);
        v[1] = new Quadrat(5);
        v[2] = new Triangle(2,3);
        v[3] = new Cercle(4);


        System.out.println(v[0].area());
        System.out.println(v[1].area());
        System.out.println(v[2].area());
        System.out.println(v[3].area());
    }
}