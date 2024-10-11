// ExtBoolArray_1Test.java
package de.beiri22.stringincrementor.helper;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExtBoolArray}.
* It contains one unit test case for the {@link ExtBoolArray#left()} method.
*/
class ExtBoolArray_1Test {
		
	private final ExtBoolArray bo1 = new ExtBoolArray(2);
	private final ExtBoolArray bo2 = new ExtBoolArray(3);
	private final ExtBoolArray bo3 = new ExtBoolArray(4);

	
	@Test
	public void left() {
	assertEquals(0, bo1.left());
	assertEquals(1, bo2.left());
	assertEquals(2, bo3.left());
	}
	
	
	public ExtBoolArray getWertest() {
		return new ExtBoolArray(5);
	}
	
	
	@Test
	public void setTrue() {
		
		bo1.setTrue(1, true);
		bo1.setTrue(2, false);		
		
		bo2.setTrue(1, true);
		bo2.setTrue(2, false);
		
		bo3.setTrue(1, true);
		bo3.setTrue(2, false);
		
		assertEquals(false, bo1.isFalse(1,2));
		
		assertEquals(false, bo2.isFalse(true));
		assertEquals(false, bo3.isFalse(true));
		}
}