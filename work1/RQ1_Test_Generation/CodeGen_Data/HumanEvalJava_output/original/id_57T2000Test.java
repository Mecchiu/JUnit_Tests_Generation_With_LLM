// MonotonicTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Monotonic}.
* It contains one unit test case for the {@link Monotonic#monotonic(List)} method.
*/
class MonotonicTest {

	@Test
	public void test(){
		
		List<Integer> list = new Monotonic.Monotonic(1,1)
			.getResult();
		
		assertNotNull(list);
		assertTrue(list.size() == 1);
		assertTrue(list.get(0) == 1);
	}
	
	@Test
	public void test2(){
		
		List<Integer> list = new Monotonic.Polynomial(-1)
		.getResult();
		
		assertNotNull(list);
		assertTrue(list.size() == 4);
		for (int i = 0; i < 4; i++) {
			assertTrue(list.get(i) == i);
		}
	}
	
	@Test
	public void test3() throws NegativeNumberException {
		
		List<Integer> list = new Monotonic.Polynomial(3)
							.getResult();
		
		assertNotNull(list);
		assertTrue(list.size() == 1);
		assertTrue(list.get(0) == 4);
	}
	
}
