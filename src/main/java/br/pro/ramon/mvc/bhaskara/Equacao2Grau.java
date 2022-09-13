package br.pro.ramon.mvc.bhaskara;

public class Equacao2Grau {

    private double a, b, c;
    private double delta;

    public Equacao2Grau(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.delta = b * b - 4 * a * c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public boolean isSolucaoReal() {
        return delta >= 0;
    }

    public double getX1() {
        return (-b + Math.sqrt(delta)) / (2 * a);
    }

    public double getX2() {
        return (-b - Math.sqrt(delta)) / (2 * a);
    }

}
