/**
 * NumberProperties.java
 *
 * Learning objectives:
 * - show a few conversion methods: String to int, String to int
 * - show method chaining
 * - show the use of string splitting to initialize a String/char array
 * - show the use of enhanced for loop
 *
 */
public class NumberProperties {

    protected static void p ( String str ) {
        System.out.println( str );
    }

    public static String[] integerToStringArray( int number ) {

        // convert int to String then to String[] array
        String[] characters = Integer.toString( number ).split("");

        return characters;
    }

    public static int sumDigitsFromStringArray ( String[] stringDigits ) {

        int sum = 0;

        for (String character : stringDigits) {
            int digit = Integer.parseInt(character);
            sum += digit;
        }

        return sum;
    }

    public static boolean hasProperty ( int number ) {

        String[] characters = integerToStringArray( number );

        int sum = sumDigitsFromStringArray( characters );

        return sum < 10;

    }

    public static void main ( String args[] ) {

        int number = 45;

        if ( hasProperty ( number ) )
            p( String.valueOf( number ) + "'s digits summed are smaller than 10" );
        else
            p( String.valueOf( number ) + "'s digits summed are equal or greater than 10" );

    }
}
