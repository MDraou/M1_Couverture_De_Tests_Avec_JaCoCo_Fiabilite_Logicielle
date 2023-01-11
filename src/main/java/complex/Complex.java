package complex;


public class Complex {
    float realPart = 0;
    float imaginaryPart = 0;

    private static final float EPSILON = 0.000001F;

    public Complex() {
    }

    public Complex(float a, float b) {
        this.realPart = a;
        this.imaginaryPart = b;
    }


    public boolean isZero() {
        return ((Math.abs(this.realPart) <= EPSILON) && (Math.abs(this.imaginaryPart) <= EPSILON));	
    }

    public float getRealPart() {
        return this.realPart;
    }

    public float getImaginaryPart() {
        return this.imaginaryPart;
    }

    public void setRealPart(float a) {
        this.realPart = a;
    }

    public void setImaginaryPart(float b) {
        this.imaginaryPart = b;
    }

    public Complex sum(Complex c) {
        return new Complex(this.realPart + c.getRealPart(), this.imaginaryPart + c.getImaginaryPart());
    }

    public Complex product(Complex c) {
        // TODO: change code
        return new Complex(this.realPart * c.getRealPart() - this.imaginaryPart * c.getImaginaryPart(),
                this.realPart * c.getImaginaryPart() + this.imaginaryPart * c.getRealPart());
    }

    public Complex inverse() throws IllegalArgumentException {
        if (isZero()) throw new IllegalArgumentException();
        float square_norm = (this.realPart * this.realPart + this.imaginaryPart * this.imaginaryPart);
        return new Complex(this.realPart / square_norm, -this.imaginaryPart / square_norm);
    }

    @Override
    public String toString() {
        return realPart + "+i" + imaginaryPart;
    }

    public static void infinite()
    {
        // TODO: add code
        try {
            while(true) {
                Thread.sleep(100);
            }
        }catch (InterruptedException e) {
            System.err.println("timeout interruption");
        }
    }
}
