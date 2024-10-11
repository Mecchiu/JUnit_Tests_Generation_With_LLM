// CompareTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Compare}.
* It contains one unit test case for the {@link Compare#compare(List, List)} method.
*/
class CompareTest {

    public final String game1 = "6,7,23";
    public final String game2 = "1,2,3,4,5,6";
    public final String game3 = "2,3,4";

    /**
    * Initial values for the first two arrays of scores and guesses.
    * <p>
    * <b>Note:</b> Do not change any of the other arrays after construction.
    */
    public final static int first1 = 1, first2 = 2, first3, first4 = 3, first5= 4;

    public final static int second1 = 5, second2 = 1, second3, second4 = 2, second5 = 4;

    /**
    * Set up values for the first two arrays of arrays of scores and guesses.
    */
    public final static void setUp1 () {
        first1 = first2 + first3;
        first2 = first4;
        first3 = 0;
        first4 = third;
        first5 = 1;
        second1 = third;
        second2 = second4;
        second3 = second5;
    }

    /**
    * Set up values for the second two arrays of arrays of arrays of scores and guesses.
    * <p>
    * Each of these arrays may also contains positive or negative numbers. After this method
    * is run, the number of matches that would still be returned is stored as a result
    * variable named <i>result</i>.
    */
    public final static void setup2 () {
        // The last entry of the remaining arrays is the number of possible results
        // that would still be returned.
        second1 = first1 * 10;
        second2 = first2 * 10;
        second3 = second4 * 10;
        second4 = first1 * 10;
    }

    /**
     * Run unit tests.
     */
    @Test
    public void test() {
        List<Integer> test1;
        List<Integer> test2;

        test1 = new ArrayList<Integer>(first1);
        for (int i = 0; i < first1; i++) {
            test1.set(i, 0);
        }
        test2 = new ArrayList<Integer>(first2);
        for (int i = 0; i < first2; i++) {
            test2.add(0);
        }
        test1 = compare(test1, test2);
        assertEquals(first1, test1.size());
        
        final List<Integer> test3 = new ArrayList<Integer>(); 
        test3.add(0);
        test3.add(-2);
        test3.add(third);
        test1 = compare(test3, test1);
        assertEquals(third, test1.get(0));
        
        test1 = compare(first1, first2);
        assertEquals(first1, test1.size());
        // The scores are sorted and then compared before dividing.
        // Both arrays have been sorted (they are stored sequentially).
        if (first2 + first3 == 0) {
            assertEquals(first5, test1.get(1));
            assertEquals(first2- first5, test1.get(1000));
        } else {
            assertEquals(first3, test1.get(1));
            assertEquals(first2, test1.get(1000));
        }
    }
}
