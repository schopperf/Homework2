package geometry.model.threeDimensional.polyhedron;

import geometry.model.threeDimensional.ThreeD;

/**
 * Created by fabian on 14.11.16.
 */
public class Pyramid extends ThreeD {
    private double a;
    private double b;
    private double h;

    public Pyramid(int x, int y,int z,double a,double b, double h) {
        this.x=x;
        this.y=y;
        this.z=z;
        this.a=a;
        this.b=b;
        this.h=h;
    }

    @Override
    public double calculateSurfaceArea() {return a*a+4*a*calcHA()/2;}

    public double calculateVolume() {return (1/3)*a*b*h;}

    public double calcHA() {return Math.sqrt(h*h+(a/2));}

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Pyramid pyramid = (Pyramid) o;

        if (Double.compare(pyramid.a, a) != 0) return false;
        if (Double.compare(pyramid.b, b) != 0) return false;
        return Double.compare(pyramid.h, h) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(a);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(b);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(h);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
