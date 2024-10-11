// IntersperseTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Intersperse}.
* It contains one unit test case for the {@link Intersperse#intersperse(List, int)} method.
*/
class IntersperseTest {

	/**
	 * Test interspersed numbers with delimiter {@value String#COMMA}. 
	 */
	@Test
	public void intersperseSimpleStr() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add("1");
		numbers.add("2");
		numbers.add("3");
		List<Object> strings = new ArrayList<Object>();
		strings.add("a");
		strings.add("b");
		strings.add("c");
		String delimiter = String.valueOf(String.COMMA);
		
		int result = intersperse(numbers, delimiter);
		
		assertEquals(1, result);
		
		numbers = new ArrayList<Object>();
		numbers.add(1);
		numbers.add(1);
		numbers.add(2);
		strings = interspersed(numbers, delimiter);
		assertEquals(2, strings.size());
		assertEquals(1, strings.get(0));
		assertEquals(2, strings.get(1));	
	}
	
	/**
	 * Test interspersed numbers with delimiter {@value String#COMMA} and {@value String#UNICODE_RADIX}. 
	 */
	@Test
	public void intersperseSimpleStrUnicode() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add("a");
		numbers.add("b");
		numbers.add("c");
		List<Object> strings = new ArrayList<Object>();
		strings.add("a");
		strings.add("c");
		strings.add("b");
		strings.add("b");
		strings.add("b");
		strings.add("b");
		strings.add("b");
		strings.add("b");
		strings.add("b");
		strings.add("b");
		strings.add("b");
		strings.add("b");
		strings.add("c");
		String delimiter = String.valueOf(String.COMMA);
		
		int result = intersperse(numbers, delimiter);
		
		assertEquals(1, result);
		
		numbers = new ArrayList<Object>();
		numbers.add(1);
		numbers.add(1);
		numbers.add(2);
		strings = interspersed(numbers, delimiter);
		assertEquals(2, strings.size());
		assertEquals(1, strings.get(0));
		assertEquals(2, strings.get(1));	
	}
	
	/**
	 * Test interseeds numbers with delimiter {@value String#UNICODE_RADIX} and {@value String#COMMA}. 
	 */
	@Test
	public void intersperseSimpleStrUnicodeUnicode() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add("a");
		numbers.add("b");
		numbers.add("c");
		List<Object> strings = new ArrayList<Object>();
		strings.add("a");
		strings.add("b");
		strings.add("c");
		strings.add("b");
		strings.add("b");
		strings.add("b");
		strings.add("b");
		strings.add("b");
		strings.add("b");
		strings.add("b");
		strings.add("b");
		strings.add("b");
		strings.add("b");
		strings.add("b");
		strings.add("b");
		strings.add("c");
		String delimiter = String.valueOf(String.UNICODE_RADIX);
		
		int result = intersperse(numbers, delimiter);
		
		assertEquals(1, result);
		
		numbers = new ArrayList<Object>();
		numbers.add(1);
		numbers.add(1);
		numbers.add(2);
		strings = interspersed(numbers, delimiter);
		assertEquals(2, strings.size());
		assertEquals(1, strings.get(0));
		assertEquals(2, strings.get(1));	
	}
	
	/**
	 * Test interseeds numbers with delimiter {@value String#COMMA} and {@value String#UNICODE_RADIX} and {@value String#UNICODE_DIGITS}. 
	 */
	@Test
	public void intersperseStrUnicodeUnicodeUnicode() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add("a");
		numbers.add("b");
		numbers.add("c");
		List<Object> strings = new ArrayList<Object>();
		strings.add("a");
		strings.add("b");
		strings.add("c");
		strings.add("b");
		strings.add("b");
		strings.add("b");
		strings.add("b");
		strings.add("b");
		strings.add("b");
		strings.add("b");
		strings.add("b");
		strings.add("b");
		strings.add("b");
		strings.add("b");
		strings.add("b");
		strings.add("b");
		strings.add("b");
		strings.add("b");
		strings.add("b");
		strings.add("b");
		strings.add("b");
		strings.add("b");
		strings.add("c");
		String delimiter = String.valueOf(String.UNICODE_RADIX);
		
		int result = intersperse(numbers, delimiter);
		
		assertEquals(1, result);
		
		numbers = new ArrayList<Object>();
		numbers.add(1);
		numbers.add(1);
		numbers.add(2);
		strings = interspersed(numbers, delimiter);
		assertEquals(2, strings.size());
		assertEquals(1, strings.get(0));
		assertEquals(2, strings.get(1));	
	}	
}
