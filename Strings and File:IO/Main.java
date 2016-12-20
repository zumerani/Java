public class Main {

    public static void main( String[] args ) {

        //Trimming strings
        String s = "  Hello, World   ";
        //Removes white spaces from front and back of string
        System.out.println( s.trim() );

        //Replace
        System.out.println( s.replace("  " , "Jim said " ) ); //Should print Jim said Hello, WorldJim said

        //Matching and Regular Expression
        String s2 = "Java is fun";
        System.out.println( s2.matches("Java.*" ) ); //Returns true because there is a match with "Java"

        //Replace All and Splits
        String s3 = "a+b$c#";
        String replacement = s3.replaceAll( "[$+#]" , "NNN" );
        System.out.println("Replacement is: " + replacement ); //prints aNNNbNNNcNNN

        //We can also split the string according to specific patterns:
        String s4 = "Java,C?C#,C++";
        String[] tokens = s4.split("[.,:;?]" );

        for( int i = 0 ; i < tokens.length ; i++ ) { //length in array is a property not function
            System.out.print( tokens[i] + " " );
        }

    }

}