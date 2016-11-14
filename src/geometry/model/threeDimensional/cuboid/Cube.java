package geometry.model.threeDimensional.cuboid;

import geometry.model.threeDimensional.ThreeD;

/**
 * Created by fabian on 14.11.16.
 */
public class Cube extends ThreeD {
    private double a;
    private double b;
    private double c;

    public Cube(int x, int y,int z,double a,double b, double c) {
        this.x=x;
        this.y=y;
        this.z=z;
        this.a=a;
        this.b=b;
        this.c=c;
    }

    @Override
    public double calculateSurfaceArea() {
        return 2*(a*b+a*c+b*c);
    }

    public double calculateVolume() {
        return a*b*c;
    }

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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Cube cube = (Cube) o;

        if (Double.compare(cube.a, a) != 0) return false;
        if (Double.compare(cube.b, b) != 0) return false;
        return Double.compare(cube.c, c) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(a);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(b);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(c);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }


}
