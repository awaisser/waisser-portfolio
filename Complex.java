import static java.lang.Math.sqrt;

public class Complex {
    private double a, b;

    private Complex() {
        a = 0;
        b = 0;
    }

    public Complex(double ar) {
        a = ar;
        b = 0;
    }

    public Complex(double ar, double br) {
        a = ar;
        b = br;
    }

    public double getRealPart() {
        return this.a;
    }

    public double getImaginaryPart() {
        return this.b;
    }

    public String toString() {
        if (this.b !=0)
        return this.a + " + " + this.b + "i";
        else
            return this.a + "";
    }

    public Complex add(Complex f, Complex g) {
        double real = f.getRealPart() + g.getRealPart();
        double imag = f.getImaginaryPart() + g.getImaginaryPart();
        return new Complex(real, imag);
    }

    public Complex subtract(Complex f, Complex g) {
        double real = f.getRealPart() - g.getRealPart();
        double imag = f.getImaginaryPart() - g.getImaginaryPart();
        return new Complex(real, imag);
    }
    public Complex multiply (Complex f, Complex g) {
        double real = (f.getRealPart()* g.getRealPart()) - (f.getImaginaryPart()*g.getImaginaryPart());
        double imag = (f.getRealPart()*g.getImaginaryPart()) + (f.getImaginaryPart()*g.getRealPart());
        return new Complex(real, imag);
    }
    public Complex divide (Complex f, Complex g) {
        double real = ((f.getRealPart()*g.getRealPart()) + (f.getImaginaryPart()*g.getImaginaryPart()))/(Math.pow(f.getImaginaryPart(),2) +Math.pow(g.getImaginaryPart(),2));
        double imag = ((f.getImaginaryPart()*g.getRealPart()) - (f.getRealPart()*g.getImaginaryPart()))/(Math.pow(f.getImaginaryPart(),2) +Math.pow(g.getImaginaryPart(),2));
        return new Complex(real, imag);
    }
    public double abs(Complex v){
        return Math.sqrt(Math.pow(v.getRealPart(),2) + Math.pow(v.getImaginaryPart(),2));
    }
}
