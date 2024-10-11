// RollingMaxTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RollingMax}.
* It contains one unit test case for the {@link RollingMax#rollingMax(List)} method.
*/
class RollingMaxTest {

	@Test
	void rollingMaxFailsIfOneNumberIsntExceedingMax() {
		List<Integer> numbers = new ArrayList<Integer>();

        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        assertThrows(NullPointerException.class, ()->{
            rollingMax(numbers);
        });    
    }
	
	/**
	 * Unit test for rollingMax(List) method that returns expected maximum value.
	 */
	@Test
	public void rollingMaxReturnsExpectedMaximum() {
		List<Integer> numbers = new ArrayList<Integer>();

		numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(10);
        numbers.add(13);

		assertThat(rollingMax(numbers)).isEqualTo(5);
	}
}
