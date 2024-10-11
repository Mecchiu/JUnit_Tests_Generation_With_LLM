// DigitsumTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Digitsum}.
* It contains one unit test case for the {@link Digitsum#digitSum(String)} method.
*/
class DigitsumTest {
int s;
		

        DigitsumTest() {
        	this.s = 7;
        }

        @Test
        public void test() {
        	assertEquals(this.s + 7, Digitsum.digitSum("A"), 0.001);
        }

}
