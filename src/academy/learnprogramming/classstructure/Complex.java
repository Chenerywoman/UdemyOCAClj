package academy.learnprogramming.classstructure;

// immutable classe
public class Complex {

    private final double real;
    private final double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal(){
        return real;
    }

    public double getImaginary(){
        return imaginary;
    }

    public Complex plus(Complex b) {
        double newReal = real + b.real;
        double newImaginary = imaginary + b.imaginary;
        return new Complex(newReal, newImaginary);
    }

    public Complex minus(Complex otherComplex) {
        double newReal = real - otherComplex.real;
        double newImaginary = imaginary - otherComplex.imaginary;
        return new Complex(newReal, newImaginary);
    }

    public Complex times(Complex b) {
        double newReal = real * b.real;
        double newImaginary = imaginary + b.imaginary;
        return new Complex(newReal, newImaginary);
    }

    public static Complex plus(Complex a, Complex b) {
        double real = a.real + b.real;
        double imaginary = a.imaginary + b.imaginary;
        return new Complex(real, imaginary);
    }

    // same as above but in a single line using plus method above
    public static Complex alternativePlus(Complex a, Complex b) {
        return a.plus(b);
    }

    public static void main(String[] args) {
        Complex a = new Complex(5.0, 6.0);
        Complex b = new Complex(-3.0, 4.0);

        Complex bPlusA = b.plus(a);
        Complex bPlusAStatic = Complex.plus(a, b);

        System.out.println("a = " + a.real + " imaginary = " + a.imaginary);
        System.out.println("b = " + b.real + " imaginary = " + b.imaginary);
        System.out.println("bPlusA real = " + bPlusA.real + " imaginary = " + bPlusA.imaginary);
        System.out.println("bPlusAStatic = " + bPlusAStatic.real + " imaginary = " + bPlusAStatic.imaginary);
    }

}


