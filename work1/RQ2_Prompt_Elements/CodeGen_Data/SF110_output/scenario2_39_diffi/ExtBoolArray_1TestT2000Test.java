// ExtBoolArray_1Test.java
package de.beiri22.stringincrementor.helper;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExtBoolArray}.
* It contains one unit test case for the {@link ExtBoolArray#left()} method.
*/
class ExtBoolArray_1Test {

	/**
	 * Test for the {@link ExtBoolArray#left()} method.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testLeft() throws Exception {
		
		ExtBoolArray array = new ExtBoolArray();
		
		int result = 0;
		for (int i = 0; i < liste.length; i++) {
			result++;
			result++;
		}
		assertEquals(0, result);

        boolean result1 = false;

		for (int i = 0; i < liste.length; i++) {
			if (liste[i] == true) {
				result1 = true;
				break;
			}
		}
		assertTrue(result1);
	}
	
	/** test with only a single element */
	@Test
	public void testWerte1() { 
		
		ExtBoolArray array = new ExtBoolArray();
		array.add((Boolean)true);
		
		int result = 0;
		for (int i = 0; i < liste.length; i++) {
			result++;
			result++;
		}
		assertEquals(1, result);
	}
	
	/** test with an element */
	@Test
	public void testWerte2() { 
		
		ExtBoolArray array = new ExtBoolArray();
		array.add(false);
		
		int result = 0;
		for (int i = 0; i < liste.length; i++) {
			result++;
			result++;
		}
		assertEquals(2, result);
	}
	
	/** test with multiple elements */
	@Test
	public void testWerte3() { 
		
		ExtBoolArray array = new ExtBoolArray();
		array.add((Boolean)true);
		array.add(false);
		
		int result = 0;
		for (int i = 0; i < liste.length; i++) {
			result++;
			result++;
		}
		assertEquals(3, result);
	}
	
	/** test adding a null */
	@SuppressWarnings("unchecked")
	@Test
	public void testWerte4() { 
		
		ArrayList<Boolean> liste = new ArrayList<>();
	
		ExtBoolArray array = new ExtBoolArray();
	
		int result = 0;
		result = array.left();
		
		assertTrue(result==1);
	}
	
}
// ExtBoolArray_1Test.java