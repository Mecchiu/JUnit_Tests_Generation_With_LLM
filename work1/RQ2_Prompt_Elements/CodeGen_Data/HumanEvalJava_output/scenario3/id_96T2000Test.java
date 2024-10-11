// CountUpToTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountUpTo}.
* It contains one unit test case for the {@link CountUpTo#countUpTo(int)} method.
*/
class CountUpToTest {

	@Test
	void testCountUpToConcrete() {
		List<Object> res = countUpTo(10);
		assertNotNull(res);
		assertEquals(10, res.size());
		for (int i = 0; i < res.size(); i++) {
			assertTrue(res.get(i) instanceof Integer);
			assertEquals(i, ((Integer) res.get(i)).intValue());
		}
	}
	
	@Test
	void testCountUpTo() {
			List<Object> res = countUpTo(1);
			assertNotNull(res);
			assertEquals(1, res.size());
			for (int i = 0; i < res.size(); i++) {
				assertTrue(res.get(i) instanceof Integer);
				assertEquals(i, ((Integer) res.get(i)).intValue());
			}
	}
	
	@Test
	void testCountUpToNoArgs() {
			List<Object> res = countUpTo(10);
			assertNotNull(res);
			assertEquals(10, res.size());
			for (int i = 0; i < res.size(); i++) {
				assertTrue(res.get(i) instanceof Integer);
				assertEquals(i, ((Integer) res.get(i)).intValue());
			}
	}
}
