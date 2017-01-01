public class Main {

    /* One benefit of abstract classes is that we no longer have to cast. 'AbstractGeometricObject'
       has the method 'getArea()' so the compiler will not give us an error if we call 'getArea()'. During
       runtime, JVM will look in the 'Circle' class since o1 and o2 both have actual types as 'Circle'. The
       JVM will then match up 'getArea()' with the objects and call the method defined in 'Circle'.
     */
    public static boolean equalArea( AbstractGeometricObject o1 , AbstractGeometricObject o2 ) {
        return o1.getArea() == o2.getArea();
    }


    public static void main( String[] args ) {
        AbstractGeometricObject object1 = new Circle(9);
        System.out.println("The area of object1 is: " + object1.getArea() );

        AbstractGeometricObject object2 = new Circle(9);
        System.out.println("The area of object2 is: " + object2.getArea() );

        System.out.println( equalArea( object1 , object2 ) );

    }


}