// RollingMaxTest.java
package original;

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
	public void test_1() {
		// Given

		List<Object> numbers = new ArrayList<Object>();
		numbers.add(-99);

		// When
    		List<Object> rollingMax = RollingMax.rollingMax(numbers);

    		// Then
			assertEquals(2, rollingMax.size());
			assertTrue(rollingMax.get(0) instanceof Integer);
			assertTrue(rollingMax.get(1) instanceof Integer);
	}
	
	@Test
	public void test_2() {
		// Given
		List<Object> values = new ArrayList<Object>();
		values.add(99); values.add(1000); values.add(98); values.add(1001); values.add(1); values.add(1); values.add(0);
		List<Object> numbers = new ArrayList<Object>();
		numbers.add((Integer) null);
		numbers.add(99);
		numbers.add(1000);
		numbers.add(98);
		numbers.add(1001);
		numbers.add(1);
		numbers.add(1);
		numbers.add(0);

		// When
    		List<Object> rollingMax = RollingMax.rollingMax(numbers);

    		// Then
			assertEquals(5, rollingMax.size());
			assertTrue(rollingMax.get(0) instanceof Integer);
			assertTrue(rollingMax.get(1) instanceof Integer);
			assertTrue(rollingMax.get(2) instanceof Integer);
			assertTrue(rollingMax.get(3) instanceof Integer);
			assertTrue(rollingMax.get(4) instanceof Integer);

	}
}
