package GeometricObjects;

import GeometricObjects.AbstractGeometricObject;
import java.util.Comparator;

public class AbstractGeometricObjectComparator implements Comparator<AbstractGeometricObject>, java.io.Serializable {

    public int compare( AbstractGeometricObject o1 , AbstractGeometricObject o2 ) {
        double a1 = o1.getArea();
        double a2 = o2.getArea();

        if( a1 < a2 )
            return -1;
        else if( a1 > a2 )
            return 1;
        else
            return 0;
    }

}