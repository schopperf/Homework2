package geometry;

import geometry.model.GeometricShape;

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
        List<GeometricShape> shapeList = new ArrayList<>();

        fillList(shapeList);

        printList(shapeList);




    }


}
