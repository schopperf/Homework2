package geometry;

import geometry.model.threeDimensional.ThreeD;
import geometry.model.threeDimensional.ball.Sphere;
import geometry.model.threeDimensional.cuboid.Cube;
import geometry.model.threeDimensional.polyhedron.RightPyramid;
import geometry.model.twoDimensional.TwoD;
import geometry.model.twoDimensional.curved.Circle;
import geometry.model.twoDimensional.quadrilateral.Rectangle;
import geometry.model.twoDimensional.trilateral.RightTriangle;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fabian on 14.11.16.
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        main.doMyHomework();

    }

    private void doMyHomework() {
        List<TwoD> shapeListTwoD = new ArrayList<>();
        List<ThreeD> shapeListThreeD = new ArrayList<>();

        fillListTwoD(shapeListTwoD);
        fillListThreeD(shapeListThreeD);

        printSumTwoD(shapeListTwoD);
        printSumThreeD(shapeListThreeD);





    }

    public void fillListThreeD(List<ThreeD> shapeList) {
        shapeList.add(new Cube(1,1,1,1,1,1));
        shapeList.add(new Cube(1,1,1,2,2,2));

        shapeList.add(new Sphere(2,4,1,5));
        shapeList.add(new Sphere(1,1,6,3));

        shapeList.add(new RightPyramid(1,2,3,5,5,3));
        shapeList.add(new RightPyramid(5,5,5,2,2,2));
    }



    public void fillListTwoD(List<TwoD> shapeList) {
        shapeList.add(new Circle(1,2,3.0));
        shapeList.add(new Circle(8,2,3.0));

        shapeList.add(new Rectangle(3,2,5.0,2.0));
        shapeList.add(new Rectangle(6,4,5.0,2.0));

        shapeList.add(new RightTriangle(55,44,3.3,4.4));
        shapeList.add(new RightTriangle(55,11,3.3,4.4));
    }



    public void printSumTwoD(List<TwoD> twoDList) {
        double sum = 0;
        for (TwoD shape : twoDList) {
            sum = sum+shape.calcArea();
        }
        for (TwoD shape : twoDList) {
            sum = sum+shape.calcPerimeter();
        }

        System.out.println("sum of area and perimeter is "+sum);

    }

    public void printSumThreeD(List<ThreeD> threeDList) {
        double sum = 0;
        for (ThreeD shape : threeDList) {
            sum = sum+shape.calculateSurfaceArea();
        }
        for (ThreeD shape : threeDList) {
            sum = sum+shape.calculateVolume();
        }

        System.out.println("sum of surface and volume is "+sum);

    }


}
