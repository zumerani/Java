import java.util.*;

/* HashSets are placed in any order -- there is no ordering. */

public class HashSetExample {

    public static void main( String[] args ) {
        java.util.Set<String> setOne = new java.util.HashSet<String>();

        setOne.add("San Francisco");
        setOne.add("Paris");
        setOne.add("New York");
        setOne.add("Beijing");
        setOne.add("New York"); /* Won't be added -- no duplicates in sets */

        System.out.println("Set One is " + setOne);
        System.out.println( setOne.size() + " elements in Set One");

        /* Remove elements */
        setOne.remove("London");
        System.out.println("Set One is now: " + setOne + " with " + setOne.size() + " elements" );

        Set<String> setTwo = new HashSet<String>();
        setTwo.add("London");
        setTwo.add("Shanghai");
        setTwo.add("Paris");

        System.out.println("Set Two is: " + setTwo + " with " + setTwo.size() + " elements" );

        /* Testing the .contains() method */
        System.out.println("Is Taipei in Set Two? " + setTwo.contains("Taipei"));

        /* Adding Set Two to Set One */
        setOne.addAll(setTwo);
        System.out.println("After ading setTwo to setOne, setOne is " + setOne );

        /* Removing Set Two FROM Set One */
        setOne.removeAll(setTwo);
        System.out.println("After removing setTwo FROM setOne, setOne is " + setOne );

        /* retainAll function */
        setOne.retainAll(setTwo); /* Since setOne and setTwo have no common elements, this will return empty set */
        System.out.println("After removing common elements in setTwo from setOne, setOne is " + setOne );


    }

}