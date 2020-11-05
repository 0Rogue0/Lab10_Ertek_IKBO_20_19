package Complex;
import java.lang.*;
public class Test {
    public static void main(String[] args) {
        Complex a = new Complex(50, 4);
        System.out.println(a);

        ComplexAbstractFactory b = new ConcreteFactory();
        Complex r = b.createComplex(120, 371);
        System.out.println(r);

        ConcreteFactory d = new ConcreteFactory();
        Complex f = d.createComplex(0, 1);
        System.out.println(f);
    }
}
