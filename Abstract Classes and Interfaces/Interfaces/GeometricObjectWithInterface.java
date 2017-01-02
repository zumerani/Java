import java.lang.Comparable;
import java.util.Date;

public abstract class GeometricObjectWithInterface implements Comparable {

    private String color = "White";
    private boolean filled;
    private Date dateCreated;

    /* Using 'protected' so that it is accessible to subclasses. */
    protected GeometricObjectWithInterface() {
        dateCreated = new Date();
    }

    protected GeometricObjectWithInterface( String color , boolean filled ) {
        this.color = color;
        this.filled = filled;
        dateCreated = new Date();
    }

    protected String getColor() {
        return color;
    }

    protected void setColor() {
        this.color = color;
    }

    protected boolean isFilled() {
        return filled;
    }

    protected void setFilled() {
        this.filled = filled;
    }

    protected Date getDate() {
        return dateCreated;
    }

    /* Overrides 'toString()' in 'Object'. */
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }

    /* The following abstract methods will be implemented in the subclasses because the methods are
       specific to specific shapes.
     */
    public abstract double getArea();

    public abstract double getPerimeter();

    /* This method implements the method prototyped in the 'Comparable' interface. */
    public int compareTo( Object o ) {
        if( this.getArea() < ( (GeometricObjectWithInterface) o).getArea() ) {
            return -1;
        } else if( this.getArea() > ( (GeometricObjectWithInterface ) o ).getArea() ) {
            return 1;
        } else {
            return 0;
        }
    }


}