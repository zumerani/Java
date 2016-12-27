import java.util.*;

/* In a LinkedHashSet, the order is preserved, as opposed to a HashSet. */

public class LinkedHashSetExample {

    public static void main( String[] args ) {
        Set<String> set = new LinkedHashSet<String>();

        // Add strings to the set
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Beijing");
        set.add("New York");
        System.out.println(set);

        // Display the elements in the hash set
        for( Object eleme : set ) {
            System.out.println(eleme); /* Order is preserved */
        }
    }

}