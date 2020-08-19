import java.util.ArrayList;
import java.util.List;

/**
 * Generates combinations of k elements from a n-element set
 *
 * @author Eduardo Lima
 * @version 0.1
 */
public class Combination {

    static private void calculate( List<int[]> combinations, int combination[], int start, int end, int index ) {
        if ( index == combination.length ) {
            int[] solution = combination.clone();
            combinations.add( solution );
        } else if ( start <= end ) {
            combination[index] = start;
            calculate( combinations, combination, start + 1, end, index + 1 );
            calculate( combinations, combination, start + 1, end, index );
        }
    }

    static public List<int[]> generate( int n, int k ) {
        List<int[]> combinations = new ArrayList<>();
        calculate( combinations, new int[k], 0, n-1, 0 );
        return combinations;
    }

    static public void main ( String[] args ) {
        int n = 5, k = 2;
        int[] set = new int[]{0, 1, 2, 3, 4};

        List<int[]> combinations = generate( n, k );
        for ( int[] combination : combinations ) {
            for ( int index : combination ) {
                System.out.print( set[index] + " " );
            }
            System.out.println();

        }
        System.out.printf( "n = %d, k = %d, combinations = %d.", combinations.size(), n, k );
    }

}
