import java.lang.reflect.Array;
import java.util.*;

public class ListExample {

    public static void main( String[] args ) {
        List<Integer> listOne = new ArrayList<Integer>();
        listOne.add(1); /* 1 is autoboxed to new Integer(1). */
        listOne.add(2);
        listOne.add(3);
        listOne.add(1);
        listOne.add(4);
        listOne.add(0 , 10);
        listOne.add(3 , 30);
        System.out.println("List of integers in array list is: " + listOne);
        System.out.println("\nNow printing 'listOne' using an iterator: " );
        ListIterator<Integer> listOneIterator = listOne.listIterator();
        while( listOneIterator.hasNext() ) {
            System.out.print( listOneIterator.next() + " " );
        }

        System.out.println();

        List<Object> linkedList = new LinkedList<Object>(listOne);
        linkedList.add( 1 , "red" ); /* "red" is a String and is a subclass of "Object" so this is valid. */
        linkedList.add(0 , "green");
        System.out.println("Display the linked list forward: ");
        ListIterator<Object> listIterator = linkedList.listIterator();
        while( listIterator.hasNext() ) {
            System.out.print(listIterator.next() + " " );
        }

        System.out.println("Display the linked list backward: " );
        listIterator = linkedList.listIterator( linkedList.size() );
        while( listIterator.hasPrevious() ) {
            System.out.print( listIterator.previous() + " " );
        }
    }

}