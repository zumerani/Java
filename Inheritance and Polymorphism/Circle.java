public class Circle extends GeometricObject {

    private double radius; /* 'radius' is a property that belongs solely to type 'Circle'

    /* Default Circle Constructor */
    public Circle() {

    }

    public Circle( double radius ) {
        this.radius = radius;
    }

    public Circle( double radius , String color , boolean filled ) {
        super( color , filled ); /* This calls GeometricObject's constructor with paramters color and filled. */
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius( double radius ) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public void printCircle() {
        System.out.println("The circle is created " + getDateCreated() +
                " and the radius is " + radius);
    }

    public String toString() {
        return super.toString() + "\nradius is " + radius;
    }
}