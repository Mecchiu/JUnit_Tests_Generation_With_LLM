// PluckTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Pluck}.
* It contains one unit test case for the {@link Pluck#pluck(List)} method.
*/
class PluckTest {
private final List<Double> input = new List[10];
		private final double value = 5.0d;
		private final Object[] arr = new Object[4 * 4];
		private final int index = 4;
		private final Object first = arr[index];
		private final Object second = arr[index * 2];
		private final Object third = arr[index * 10];
		{
			input[index] = first;
			input[index * 2] = second;
			input[index * 10] = third;
		}

		public void testConstruct() {
						assertFalse(Double.class.isAssignableFrom(Double.class));
						assertEquals(value, 0.0d);
						assertEquals(index, 4);
						assertEquals(first.getClass(), Double.class);
						assertEquals(third.getClass(), Double.class);
						assertEquals(second, input[index]);
						assertEquals(second, input[index * 2]);
						assertEquals(second, input[index * 10]);
						assertEquals(third, input[index * 1]);

		}

		@Test
		void testPluck_withEmptyArray() {
				List<Object> result = Pluck.pluck(input);
				assertNotNull(result);
				assertTrue(result.isEmpty());
		}

		@Test
		void testPluck_withMultipleNodes() {
						List<Double> result = Pluck.pluck(input);
						assertNotNull(result);
						assertEquals(input.size(), result.size());
						assertTrue(result.contains(value));
						assertTrue(result.contains(input.get(index)));
						assertTrue(result.contains(input.get(index * 2)));
						assertTrue(result.contains(input.get(index * 10)));
		}

		@Test
		void testPluck_withValueFromInput() {
						List<Double> result = Pluck.pluck(input, value);
						assertNotNull(result);
						assertEquals(input.size(), result.size());
						assertTrue(result.contains(value));
						assertTrue(result.contains(first));
						assertTrue(result.contains(input.get(index)));
						assertTrue(result.contains(input.get(index * 2)));
						assertTrue(result.contains(input.get(index * 10)));
		}


		@Test
		void testPluck_withSecondNode() {
						List<Double> result = Pluck1.pluck(input);
						assertNotNull(result);
						assertTrue(result.contains(value));
						assertTrue(result.contains(input.get(index)));
						assertTrue(result.contains(input.get(index * 2)));
						assertTrue(result.contains(input.get(index * 10)));
		}
}



