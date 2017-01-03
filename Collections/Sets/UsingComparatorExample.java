import GeometricObjects.*; /* My custom package. */
import java.util.*;

public class UsingComparatorExample {

    public static void main( String[] args ) {

        Set<AbstractGeometricObject> s1 = new TreeSet<AbstractGeometricObject>( new AbstractGeometricObjectComparator() );
        s1.add( new Rectangle(4 , 5) );
        s1.add( new Circle(40) );
        s1.add( new Circle(40) );
        s1.add( new Rectangle( 4 , 1 ) );

        System.out.println("A sorted set of geometric objects: " );
        for( AbstractGeometricObject o1 : s1 ) {
            System.out.println( "Area: " + o1.getArea() );
        }

    }


}