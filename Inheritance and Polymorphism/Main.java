public class Main {

    public static void main( String[] args ) {

        Circle circle = new Circle(1);
        System.out.println("A circle " + circle.toString() ); /* Calls GeometricObject's toString() method. */
        System.out.println("The radius is " + circle.getRadius() );
        System.out.println("The area is " + circle.getArea() );
        System.out.println("The diameter is " + circle.getDiameter() );

        Rectangle rectangle = new Rectangle( 2 , 4 );
        System.out.println("\nA rectangle " + rectangle.toString() );
        System.out.println("The area is " + rectangle.getArea() );
        System.out.println("The perimeter is " + rectangle.getPerimeter() );

        /* Understanding Casting */

        //Object o = new Object();
        //Circle c = (Circle) o; /* This will not work because 'o' is an instance of 'Object', NOT 'Circle. */

        Object o2 = new Circle();
        Circle c2 = (Circle) o2; /* This will work because 'o' is an instance of 'Circle' and it's declared type is Object. */
                                 /* This is called downcasting. */
    }

}