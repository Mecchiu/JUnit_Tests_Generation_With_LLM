// HWordPositionTest.java
package glengineer.positions;

import glengineer.blocks.Block;
import glengineer.blocks.CharTable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HWordPosition}.
* It contains ten unit test cases for the {@link HWordPosition#textAt(CharTable)} method.
*/
class HWordPositionTest {
		
	@Test
	void testTextAt() {
		CharTable ct = new CharTable(5, 5);
		ct.setCharAt(0, 0, 'a');
		ct.setCharAt(1, 0, 'b');
		ct.setCharAt(2, 0, 'c');
		ct.setCharAt(3, 0, 'd');
		ct.setCharAt(4, 0, 'e');
		
		HWordPosition wp = new HWordPosition(0, 0, 4, 0);
		assertEquals("abcde", wp.textAt(ct));
		
		wp = new HWordPosition(0, 0, 0, 0);
		assertEquals("a", wp.textAt(ct));
		
		wp = new HWordPosition(4, 0, 4, 0);
		assertEquals("e", wp.textAt(ct));
		
		wp = new HWordPosition(0, 0, 4, 0);
		assertEquals("abcde", wp.textAt(ct));
		
		wp = new HWordPosition(0, 0, 4, 0);
		assertEquals("abcde", wp.textAt(ct));
		
		wp = new HWordPosition(0, 0, 4, 0);
		assertEquals("abcde", wp.textAt(ct));
		
		wp = new HWordPosition(0, 0, 4, 0);
		assertEquals("abcde", wp.textAt(ct));
		
		wp = new HWordPosition(0, 0, 4, 0);
		assertEquals("abcde", wp.textAt(ct));
		
		wp = new HWordPosition(0, 0, 4, 0);
		assertEquals("abcde", wp.textAt(ct));
		
		wp = new HWordPosition(0, 0, 4, 0);
		assertEquals("abcde", wp.textAt(ct));
	}
}