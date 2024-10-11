// MultiplyTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Multiply}.
* It contains one unit test case for the {@link Multiply#multiply(int, int)} method.
*/
class MultiplyTest {

	@Test
    public void testMultiply() throws Exception {
        assertEquals(48, Multiply.multiply(148, 412));
        assertEquals(48, Multiply.multiply(20, 28));
        assertEquals(48, Multiply.multiply(146, 1951));
        assertEquals(48, Multiply.multiply(-13, 75));
    }
}

/**
* Class {@link MultiplyTest}
* It contains class with the test cases.
*/
class MultiplyTestCase {

	//Test cases
	@Test
    public void testMultiplyToPowerFour() throws Exception {
        assertEquals(48, MultiplyTest.multiply(1, 4));
        assertEquals(48, MultiplyTest.multiply(2, 4));
        assertEquals(48, MultiplyTest.multiply(4, 4));
        assertEquals(48, MultiplyTest.multiply(2, 4));
        assertEquals(48, MultiplyTest.multiply(0, 0));
    }
}

//MultiplyTest.java
