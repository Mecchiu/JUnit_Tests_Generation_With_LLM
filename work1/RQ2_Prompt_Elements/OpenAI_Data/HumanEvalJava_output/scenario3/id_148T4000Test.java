// BfTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Bf}.
* It contains ten unit test cases for the {@link Bf#bf(String, String)} method.
*/
class BfTest {

	@Test
	void testBf1() {
		List<Object> result = Bf.bf("Jupiter", "Neptune");
		assertEquals(2, result.size());
		assertEquals("Saturn", result.get(0));
		assertEquals("Uranus", result.get(1));
	}
	
	@Test
	void testBf2() {
		List<Object> result = Bf.bf("Earth", "Mercury");
		assertEquals(1, result.size());
		assertEquals("Venus", result.get(0));
	}
	
	@Test
	void testBf3() {
		List<Object> result = Bf.bf("Mercury", "Uranus");
		assertEquals(5, result.size());
		assertEquals("Venus", result.get(0));
		assertEquals("Earth", result.get(1));
		assertEquals("Mars", result.get(2));
		assertEquals("Jupiter", result.get(3));
		assertEquals("Saturn", result.get(4));
	}
	
	@Test
	void testBf4() {
		List<Object> result = Bf.bf("Neptune", "Venus");
		assertEquals(5, result.size());
		assertEquals("Earth", result.get(0));
		assertEquals("Mars", result.get(1));
		assertEquals("Jupiter", result.get(2));
		assertEquals("Saturn", result.get(3));
		assertEquals("Uranus", result.get(4));
	}
	
	@Test
	void testBf5() {
		List<Object> result = Bf.bf("Earth", "Earth");
		assertEquals(0, result.size());
	}
	
	@Test
	void testBf6() {
		List<Object> result = Bf.bf("Mars", "Earth");
		assertEquals(0, result.size());
	}
	
	@Test
	void testBf7() {
		List<Object> result = Bf.bf("Jupiter", "Makemake");
		assertEquals(0, result.size());
	}
	
	@Test
	void testBf8() {
		List<Object> result = Bf.bf("Jupiter", "Pluto");
		assertEquals(0, result.size());
	}
	
	@Test
	void testBf9() {
		List<Object> result = Bf.bf("Pluto", "Jupiter");
		assertEquals(0, result.size());
	}
	
	@Test
	void testBf10() {
		List<Object> result = Bf.bf("Pluto", "Pluto");
		assertEquals(0, result.size());
	}
}