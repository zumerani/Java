public class Rectangle extends GeometricObject {
    /* The following two private variables are properties that belong solely to Rectangle. */
    private double width;
    private double height;

    /* Default Constructor to create Rectangle */
    public Rectangle() {

    }

    public Rectangle( double width , double height ) {
        this.width = width;
        this.height = height;
    }

    public Rectangle( double width , double height , String color , boolean filled ) {
        super( color , filled ); /* Calls GeometricObject's constructor with color and filled as parameters. */
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth( double width ) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight( double height ) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * ( this.width + this.height );
    }

}