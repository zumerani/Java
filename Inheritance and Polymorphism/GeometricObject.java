import java.util.*;

public class GeometricObject {

    /* The following are three properties that belong to GeometricObject */
    private String color = "White";
    private boolean filled;
    private Date dateCreated;

    /* Constructor for default object */
    public GeometricObject() {
        dateCreated = new Date();
    }

    public GeometricObject( String color , boolean filled ) {
        dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    /* This will override the method in Object */
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color + " and filled: " +
                 filled;
    }

}