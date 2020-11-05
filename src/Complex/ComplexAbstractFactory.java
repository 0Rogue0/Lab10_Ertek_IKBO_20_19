package Complex;
import java.lang.*;
public interface ComplexAbstractFactory {
    Complex createComplex();

    Complex createComplex(int real, int imagine);
}
