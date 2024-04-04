package Part14_OOPs;

public class hw {
    public static void main(String[] args) {
        Complex a = new Complex(12, 5);
        Complex b = new Complex(3, 2);
        Complex res = Complex.add(a,b);
        res.showC();
        res = Complex.diff(a,b);
        res.showC();
        res = Complex.product(a,b);
        res.showC();

    }
}

class Complex {
    int real;
    int imag;

    public Complex(int r, int i) {
        this.real = r;
        this.imag = i;
    }

    public void showC() {
        System.out.println(this.real + " +i" + this.imag);
    }

    // Function for Add
    public static Complex add(Complex a, Complex b) {
        Complex result = new Complex(0, 0);
        result.real = a.real + b.real;
        result.imag = a.imag + b.imag;
        return result;
    }

    // Function for Subtract
    public static Complex diff(Complex a, Complex b) {
        Complex result = new Complex(0, 0);
        result.real = a.real - b.real;
        result.imag = a.imag - b.imag;
        return result;
    }

    // Function for Multiply
    public static Complex product(Complex a, Complex b) {
        Complex result = new Complex(0, 0);
        result.real = (a.real * b.real - a.imag * b.imag);
        result.imag = (a.real * b.imag + a.imag * b.real);
        return result;
    }
}