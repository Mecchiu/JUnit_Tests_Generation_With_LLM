// GetOddCollatzTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetOddCollatz}.
* It contains one unit test case for the {@link GetOddCollatz#getOddCollatz(int)} method.
*/
class GetOddCollatzTest {
/**
		 * Unit test for {@link GetOddCollatz#getOddCollatz(int)}.
		 *
		 * Test case 1.
		 */
    @Test
    public void test1() {
        GetOddCollatz getOddCollatz = new GetOddCollatz();
        String results = "";
        List<Integer> list = getOddCollatz.getOddCollatz(7);
        System.out.println("[7]: "+list);
        list.forEach(result ->
        		results = results +
        				"\t"+result + "=" + Integer.toString(result) +
        				"\n"+"\n"
        		);
        System.out.println("Result: "+results);
    }

    /**
     * Unit test for {@link GetOddCollatz#getOddCollatz(int)}.
     *
     * Test case 2.
     */
    @Test
    public void test2() {
        GetOddCollatz getOddCollatz = new GetOddCollatz();
        String results = "";
        List<Integer> list = getOddCollatz.getOddCollatz(2);
        System.out.println("[2]: "+list);
        list.forEach(result ->
        		results = results +
        				"\t"+result + "=" + Integer.toString(result) +
        				"\n"+"\n"
        		);
        System.out.println("Result: "+results);
    }

    /**
     * Unit test for {@link GetOddCollatz#getOddCollatz(int)}.
     *
     * Test case 3.
     */
    @Test
    public void test3() {
        GetOddCollatz getOddCollatz = new GetOddCollatz();
        String results = "";
        List<Integer> list = getOddCollatz.getOddCollatz(10);
        System.out.println("[10]: "+list);
        list.forEach(result ->
        		results = results +
        				"\t"+result + "=" + Integer.toString(result) +
        				"\n"+"\n"
        		);
        System.out.println("Result: "+results);
    }

    /**
     * Unit test for {@link GetOddCollatz#getOddCollatz(int)}.
     *
     * Test case 4.
     */
    @Test
    public void test4() {
        GetOddCollatz getOddCollatz = new GetOddCollatz();
        String results = "";
        List<Integer> list = getOddCollatz.getOddCollatz(1);
        System.out.println("[1]: "+list);
        list.forEach(result ->
        		results = results +
        				"\t"+result + "=" + Integer.toString(result) +
        				"\n"+"\n"
        		);
        System.out.println("Result: "+results);
    }
}
