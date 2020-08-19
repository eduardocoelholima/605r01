/**
 * Factorial.java
 *
 * Version:
 *      $Id$
 *
 * Revision:
 *      $Log$
 *
 */


/**
 * Factorial using recursion.
 *
 * Learning objectives:
 * - show a recursive method call
 * - check with students if the code follows RIT-CS standards
 * - show the IDE debugging tool to show the recursion stack
 * - show the variable values in debugging mode breakpoints
 *
 * @author Eduardo Lima
 * @author Second Author
 */

public class Factorial {

    static public long recursiveMultiply ( long number ) {

        if ( number >= 1 ) {
            long aux = recursiveMultiply( number - 1);
            long result = number * aux;
            return result;

            // or equivalently:
//            return number * recursiveMultiply ( number - 1 );
        }

        else
            return 1;

    }

    static public void main ( String[] args ) {

        long number = 5;
        long result = recursiveMultiply ( number );

        System.out.println( result );

    }
}
