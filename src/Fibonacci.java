/**
 *  * Fibonacci using recursion.
 *  *
 *  * Learning objectives:
 *  * - show a recursive method call
 *  * - check with students if the code follows RIT-CS standards
 *  * - show the IDE debugging tool to show the recursion stack
 *  * - show the variable values in debugging mode breakpoints
 *  * - please also check file Fibonacci.md for some examples on
 *      the recursive calls
 */
public class Fibonacci {

    public static int fib ( int n ) throws Exception {

        // requires non-negative integers
        if ( n < 0 ) {
            throw new Exception("Negative Input Not Accepted");
        }

        // edge cases for fib(0) and fib(1)
        if ( n <= 1 )
            return n;

        // calculates the fibonacci as the sum of two immediately smaller fibonaccis
        return fib( n-1 ) + fib( n-2 );

    }

    public static void main ( String args[] ) throws Exception {

        System.out.println( fib( 9 ) );
        System.out.println( fib( 1 ) );
        System.out.println( fib( 0 ) );
        System.out.println( fib( -1 ) );

    }
}
