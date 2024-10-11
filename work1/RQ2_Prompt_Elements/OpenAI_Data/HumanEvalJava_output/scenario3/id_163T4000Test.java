// GenerateIntegersTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GenerateIntegers}.
* It contains ten unit test cases for the {@link GenerateIntegers#generateIntegers(int, int)} method.
*/
class GenerateIntegersTest {

	@Test
	void testGenerateIntegers() {
		List<Object> result = GenerateIntegers.generateIntegers(2, 8);
		assertEquals(4, result.size());
		assertEquals(2, result.get(0));
		assertEquals(4, result.get(1));
		assertEquals(6, result.get(2));
		assertEquals(8, result.get(3));
	}
	
	@Test
	void testGenerateIntegers2() {
		List<Object> result = GenerateIntegers.generateIntegers(8, 2);
		assertEquals(4, result.size());
		assertEquals(2, result.get(0));
		assertEquals(4, result.get(1));
		assertEquals(6, result.get(2));
		assertEquals(8, result.get(3));
	}
	
	@Test
	void testGenerateIntegers3() {
		List<Object> result = GenerateIntegers.generateIntegers(10, 14);
		assertEquals(0, result.size());
	}
	
	@Test
	void testGenerateIntegers4() {
		List<Object> result = GenerateIntegers.generateIntegers(2, 10);
		assertEquals(4, result.size());
		assertEquals(2, result.get(0));
		assertEquals(4, result.get(1));
		assertEquals(6, result.get(2));
		assertEquals(8, result.get(3));
	}
	
	@Test
	void testGenerateIntegers5() {
		List<Object> result = GenerateIntegers.generateIntegers(10, 2);
		assertEquals(4, result.size());
		assertEquals(2, result.get(0));
		assertEquals(4, result.get(1));
		assertEquals(6, result.get(2));
		assertEquals(8, result.get(3));
	}
	
	@Test
	void testGenerateIntegers6() {
		List<Object> result = GenerateIntegers.generateIntegers(132, 2);
		assertEquals(4, result.size());
		assertEquals(2, result.get(0));
		assertEquals(4, result.get(1));
		assertEquals(6, result.get(2));
		assertEquals(8, result.get(3));
	}
	
	@Test
	void testGenerateIntegers7() {
		List<Object> result = GenerateIntegers.generateIntegers(17, 89);
		assertEquals(0, result.size());
	}
	
	@Test
	void testGenerateIntegers8() {
		List<Object> result = GenerateIntegers.generateIntegers(2, 2);
		assertEquals(1, result.size());
		assertEquals(2, result.get(0));
	}
	
	@Test
	void testGenerateIntegers9() {
		List<Object> result = GenerateIntegers.generateIntegers(2, 4);
		assertEquals(2, result.size());
		assertEquals(2, result.get(0));
		assertEquals(4, result.get(1));
	}
	
	@Test
	void testGenerateIntegers10() {
		List<Object> result = GenerateIntegers.generateIntegers(4, 2);
		assertEquals(2, result.size());
		assertEquals(2, result.get(0));
		assertEquals(4, result.get(1));
	}
}