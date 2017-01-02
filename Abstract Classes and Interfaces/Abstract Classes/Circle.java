public class Circle extends AbstractGeometricObject {

    private double radius; /* 'radius' is a property that belongs solely to type 'Circle'

    /* Default Circle Constructor */
    public Circle() {

    }

    public Circle( double radius ) {
        this.radius = radius;
    }

    public Circle( double radius , String color , boolean filled ) {
        super( color , filled ); /* This calls GeometricObject's constructor with paramters color and filled. */
        /* Technically, 'super()' will be called without us having to invoke it, JVM takes care of this! */
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius( double radius ) {
        this.radius = radius;
    }

    /* Method implemented in Circle from AbstractGeometricObject. */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    /* Method implemented in Circle from AbstractGeometricObject. */
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public void printCircle() {
        System.out.println("The circle is created " + getDate() +
                " and the radius is " + radius);
    }

    /* Overrides the 'toString' in 'GeometricObject'. */
    public String toString() {
        return super.toString() + "\nradius is " + radius;
    }

    /* Overrides the 'equals' method in 'Object'. */
    public boolean equals( Object o ) {
        if( o instanceof Circle )
            return radius == ((Circle) o).getRadius();

        return false;
    }


}