// AddTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Add}.
* It contains one unit test case for the {@link Add#add(int, int)} method.
*/
class AddTest {
/**
		* Unit test for adding numbers.
		*/
	@Test
    void testsAdd_0() {
        assertEquals(0, Add.add(0, 0));
    }
}
