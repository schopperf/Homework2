package geometry.model.threeDimensional.ball;

import geometry.model.threeDimensional.ThreeD;

/**
 * Created by fabian on 14.11.16.
 */
public class Sphere extends ThreeD {

    private double radius;


    public Sphere(int x, int y,int z,double radius) {
        this.x=x;
        this.y=y;
        this.z=z;
        this.radius = radius;
    }

    @Override
    public double calculateSurfaceArea() {
        return 4*radius*radius*java.lang.Math.PI;
    }

    public double calculateVolume() {
        return 4/3*Math.PI*radius*radius*radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Sphere sphere = (Sphere) o;

        return Double.compare(sphere.radius, radius) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(radius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
