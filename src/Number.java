/**
 * Number.java
 *
 * Version:
 *   $Id$
 *
 * Revisions:
 *   $Log$
 */

/**
 * Number Properties class - checks if a number is prime
 * and if it has additional properties.
 *
 * Learning objectives:
 * - show the structure of a simple java class
 *   - show headers and comments' formats according to javadoc [1]
 *   - show usage of RIT CS Java coding standards [2]
 * - show the use of usual control structures, e.g. if, else, for, return
 * - show static method calls from main()
 * - discuss coding standards:
 *   - file header
 *   - line length
 *   - comments: empty rows before and after
 *   - javadoc comments
 *   - class definition header
 *   - method header
 *   - declaration / code comments
 *   - valid identifier names
 *   - horizontal spacing
 *
 * [1] www.oracle.com/technical-resources/articles/java/javadoc-tool.html
 * [2] www.cs.rit.edu/~f2y-grd/java-coding-standard.html
 *
 * @author Eduardo Lima
 */


class Number {

    /**
     * Checks is a number is prime
     * A number is prime if it has only 1 and itself as factors
     *
     * @param n
     * @return
     */
    public static boolean isPrime( int n ) {
        for ( int index = 2; index < n; index ++ ) {
            if ( n % index  == 0 )
                return false;
        }

        return true;
    }

    /**
     * Checks if a number n has the following properties
     * - n is an even number
     * - after removing the right digit (any times) the resulting number is also even
     *
     * @param n the input number
     * @param verbose true to enable printing partial computations
     * @return
     */
    public static boolean hasProperties(int n, boolean verbose) {

        // Variable part stores a part of all digits of an input number n.
        // Will be initialized with the original input n.
        // Right-most digits will be removed later.
        int part = n;

        // Checks if the current part is even
        if ( isEven( part ) ) {

            if (verbose)
                System.out.println( part + " is even." );

            part = part / 10; // removes the right-most digit from part

            // After the right-most digit is removed, stopping condition may
            // be reached, which happens when all digits are removed. If that
            // is the case, the original number has met the properties and we
            // should return true.
            if ( part == 0 )
                return true;

            // Recursively calls the method with the current value of
            // variable part.
            return hasProperties( part, verbose );
        }

        if ( verbose )
            System.out.println( part + " is not even.");

        return false;
    }

    /**
     * Returns true if number n is Even
     * @param n
     * @return
     */
    public static boolean isEven ( long n ) {

        // how could I shorten this code?

        if (n % 2 == 0)
            return true;
        else
            return false;
    }

    /**
     * Main program call: tests numbers for different properties:
     * isPrime, isEven and hasProperties
     *
     * @param args
     */
    public static void main ( String [] args ) {

        // is Integer and int the same?
        int number = 3;
//        Integer number = new Integer(3);
//        Integer number = 3;


        if ( isPrime( number ) )
            System.out.println(number + " is prime.");

        number = 4;
        if ( isEven( (long) number ) )
            System.out.println(number + " is even.");

        number = 4621;
        if ( hasProperties( number, true ) )
            System.out.println( number + " has the properties." );
        else
            System.out.println( number + " does not have the properties." );
    }

}