package LearningOops;

public class ComplexNumber {
//    int real;
//    int imaginary;
//    public  ComplexNumber(int real,int imaginary){
//        this.real=real;
//        this.imaginary=imaginary;
//
//    }
//    public void print(){
//        System.out.println(real+"+"+imaginary+"i");
//    }
//
//    public void add(ComplexNumber c2) {
//        this.real=this.real+c2.real;
//        this.imaginary=this.imaginary+c2.imaginary;
//    }
//
//    public void setReal(int real) {
//        this.real=real;
//
//    }
//
//    public void setImaginary(int imaginary) {
//        this.imaginary=imaginary;
//    }
private int real;
    private int imag;

    public ComplexNumber(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }

    public void plus(ComplexNumber c) {
        this.real += c.real;
        this.imag += c.imag;
    }

    public void multiply(ComplexNumber c) {
        int newReal = ((this.real) * (c.real)) - (this.imag * c.imag);
        int newImag = (this.real * c.imag) + (this.imag * c.real);
        this.real = newReal;
        this.imag = newImag;
    }

    public void print() {
        System.out.print(this.real + " + i" + this.imag);
    }
}
