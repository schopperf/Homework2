package geometry.model.threeDimensional;

import geometry.model.GeometricShape;

/**
 * Created by fabian on 14.11.16.
 */
public abstract class ThreeD extends GeometricShape{
    public int z;
    public abstract double calculateVolume();
    public abstract double calculateSurfaceArea();
}
