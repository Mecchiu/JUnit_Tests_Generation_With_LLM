// Maximum1Test.java
package original;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Maximum1}.
* It contains one unit test case for the {@link Maximum1#maximum(List, int)} method.
*/
class Maximum1Test {
@Test
		public void test() {
			List<Integer> input = Arrays.asList(5, -4, 2, 12, 1, 5, 7);
			List<Integer> result = Maximum1.maximum(input);
			// 0 <= k <= len(arr)
			assertTrue(result.indexOfAll(new RangeCheck() {
					@Override
					public boolean check(int index, Object val) {
						return (index < k) && ((Integer)val).compareTo(val) >= 0;
					}
			}));
			// 0 <= k <= len(arr)
			assertEquals(result.get(0), input.get(0));
			// 0 <= k <= len(arr)
			assertEquals(result.get(1), input.get(1));
			// len(arr) >= k
			assertEquals(result.get(2), input.get(2));
			// len(arr) >= k
			assertEquals(result.get(3), input.get(3));
			// len(arr) >= k
			assertEquals(result.get(4), input.get(4));
			// k > len(arr)
			assertEquals(result.get(5), input.get(5));
			// k > len(arr)
			assertEquals(result.get(6), input.get(6));
			// k > len(arr)
			assertEquals(result.get(7), input.get(7));
			// k > len(arr)
			assertEquals(result.get(8), input.get(8));
			// k > len(arr)
			assertEquals(result.get(9), input.get(9));
			// k > len(arr)
			assertEquals(result.get(10), input.get(10));
			// len(arr) >= k
			assertEquals(result.get(11), input.get(11));
			// len(arr) >= k
			assertEquals(result.get(12), input.get(12));
		}
}
