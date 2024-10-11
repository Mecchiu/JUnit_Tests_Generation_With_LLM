// RollingMaxTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RollingMax}.
* It contains one unit test case for the {@link RollingMax#rollingMax(List)} method.
*/
class RollingMaxTest {

    /**
     * Create input parameter list with random values of {@link Number} type.
     */
    public static Object[] parameterList() {

            final int initialSize = 100 ;

            Object[] input = new Object[initialSize];
            for ( int i = 0 ; i < initialSize ; i++ ) {
                input[i] = new Number(i + "").intValue();
            }

            return input;
        }
       
    /**
     * Create random parameter list with random values of Integer type.
     */
    public static Object[] parameterListWithIntegers() {

            Integer initialSize = 1000;

            Object[] input = new Integer[initialSize];
            for ( int i = 0 ; i < initialSize ; i++ ) {
                input[i] = new Integer(i + "").intValue();
            }

            return input;
        }

       
    /**
     * Returns random values.
     */
    public static Object[] returnRandomValues() {

            final int initialSize = 100 ;


            Object[] input = new Object[initialSize];
            for ( int i = 0 ; i < initialSize ; i++ ) {
                input[i] = new Number(i + "").doubleValue();
            }

            return input;
        }
       
    /**
     * Create list of numbers from input parameter list with random values
     * of {@link Number} type.
     */
    public static List<Number> randomListOfNumbers() {
        final int initialSize = 1000;

                Number[] input = new Number[initialSize];
                for ( int i = 0 ; i < initialSize ; i++ ) {
                    input[i] = new Number(i + "").doubleValue();
                }

                return new ArrayList<Number> (input);
    }

    /**
     * Use rollingMax to find latest known maximum, 
     * when two values have different max. 
     */
    public static void rollingMax(List<Object> numbers, int max) {
        
        Object value = new Number (numbers.size() - 1).intValue();
        Object current = rollingMax(numbers).last();
    
        if (current!= null &&!value.equals(current)) {
    
            numbers.remove(numbers.size() - 1);
        }
    
        if (current!= null &&!value.equals(current)) {
            rollingMax(numbers, max);
        }
    }
	
       
    @Test
    public void test() throws Exception {
        rollingMax(parameterList(), 10);
    }

}