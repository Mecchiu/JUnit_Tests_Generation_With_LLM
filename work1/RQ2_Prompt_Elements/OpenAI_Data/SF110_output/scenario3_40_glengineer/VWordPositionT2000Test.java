// VWordPositionTest.java
package glengineer.positions;

import glengineer.blocks.Block;
import glengineer.blocks.CharTable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link VWordPosition}.
* It contains ten unit test cases for the {@link VWordPosition#textAt(CharTable)} method.
*/
class VWordPositionTest {

	@Test
	void testTextAt() {
		CharTable ct = new CharTable(10, 10);
		ct.setCharAt(0, 0, 'a');
		ct.setCharAt(0, 1, 'b');
		ct.setCharAt(0, 2, 'c');
		ct.setCharAt(0, 3, 'd');
		ct.setCharAt(0, 4, 'e');
		ct.setCharAt(0, 5, 'f');
		ct.setCharAt(0, 6, 'g');
		ct.setCharAt(0, 7, 'h');
		ct.setCharAt(0, 8, 'i');
		ct.setCharAt(0, 9, 'j');
		ct.setCharAt(1, 0, 'k');
		ct.setCharAt(1, 1, 'l');
		ct.setCharAt(1, 2, 'm');
		ct.setCharAt(1, 3, 'n');
		ct.setCharAt(1, 4, 'o');
		ct.setCharAt(1, 5, 'p');
		ct.setCharAt(1, 6, 'q');
		ct.setCharAt(1, 7, 'r');
		ct.setCharAt(1, 8, 's');
		ct.setCharAt(1, 9, 't');
		ct.setCharAt(2, 0, 'u');
		ct.setCharAt(2, 1, 'v');
		ct.setCharAt(2, 2, 'w');
		ct.setCharAt(2, 3, 'x');
		ct.setCharAt(2, 4, 'y');
		ct.setCharAt(2, 5, 'z');
		ct.setCharAt(2, 6, 'a');
		ct.setCharAt(2, 7, 'b');
		ct.setCharAt(2, 8, 'c');
		ct.setCharAt(2, 9, 'd');
		ct.setCharAt(3, 0, 'e');
		ct.setCharAt(3, 1, 'f');
		ct.setCharAt(3, 2, 'g');
		ct.setCharAt(3, 3, 'h');
		ct.setCharAt(3, 4, 'i');
		ct.setCharAt(3, 5, 'j');
		ct.setCharAt(3, 6, 'k');
		ct.setCharAt(3, 7, 'l');
		ct.setCharAt(3, 8, 'm');
		ct.setCharAt(3, 9, 'n');
		ct.setCharAt(4, 0, 'o');
		ct.setCharAt(4, 1, 'p');
		ct.setCharAt(4, 2, 'q');
		ct.setCharAt(4, 3, 'r');
		ct.setCharAt(4, 4, 's');
		ct.setCharAt(4, 5, 't');
		ct.setCharAt(4, 6, 'u');
		ct.setCharAt(4, 7, 'v');
		ct.setCharAt(4, 8, 'w');
		ct.setCharAt(4, 9, 'x');
		ct.setCharAt(5, 0, 'y');
		ct.setCharAt(5, 1, 'z');
		ct.setCharAt(5, 2, 'a');
		ct.setCharAt(5, 3, 'b');
		ct.setCharAt(5, 4, 'c');
		ct.setCharAt(5, 5, 'd');
		ct.setCharAt(5, 6, 'e');
		ct.setCharAt(5, 7, 'f');
		ct.setCharAt(5, 8, 'g');
		ct.setCharAt(5, 9, 'h');
		ct.setCharAt(6, 0, 'i');
		ct.setCharAt(6, 1, 'j');
		ct.setCharAt(6, 2, 'k');
		ct.setCharAt(6, 3, 'l');
		ct.setCharAt(6, 4, 'm');
		ct.setCharAt(6, 5, 'n');
		ct.setCharAt(6, 6, 'o');
		ct.setCharAt(6, 7, 'p');
		ct.setCharAt(6, 8, 'q');
		ct.setCharAt(6, 9, 'r');
		ct.setCharAt(7, 0, 's');
		ct.setCharAt(7, 1, 't');
		ct.setCharAt(7, 2, 'u');
		ct.setCharAt(7, 3, 'v');
		ct.setCharAt(7, 4, 'w');
		ct.setCharAt(7, 5, 'x');
		ct.setCharAt(7, 6, 'y');
		ct.setCharAt(7, 7, 'z');
		ct.setCharAt(7, 8, 'a');
		ct.setCharAt(7, 9, 'b');
		ct.setCharAt(8, 0, 'c');
		ct.setCharAt(8, 1, 'd');
		ct.setCharAt(8, 2, 'e');
		ct.setCharAt(8, 3, 'f');
		ct.setCharAt(8, 4, 'g');
		ct.setCharAt(8, 5, 'h');
		ct.setCharAt(8, 6, 'i');
		ct.setCharAt(8, 7, 'j');
		ct.setCharAt(8, 8, 'k');
		ct.setCharAt(8, 9, 'l');
		ct.setCharAt(9, 0, 'm');
		ct.setCharAt(9, 1, 'n');
		ct.setCharAt(9, 2, 'o');
		ct.setCharAt(9, 3, 'p');
		ct.setCharAt(9, 4, 'q');
		ct.setCharAt(9, 5, 'r');
		ct.setCharAt(9, 6, 's');
		ct.setCharAt(9, 7, 't');
		ct.setCharAt(9, 8, 'u');
		ct.setCharAt(9, 9, 'v');
		
		VWordPosition wp = new VWordPosition(0, 0, 0, 9);
		assertEquals("abcdefghij", wp.textAt(ct));
		
		wp = new VWordPosition(0, 1, 0, 9);
		assertEquals("klmnopqrst", wp.textAt(ct));
		
		wp = new VWordPosition(0, 2, 0, 9);
		assertEquals("uvwxyzabcd", wp.textAt(ct));
		
		wp = new VWordPosition(0, 3, 0, 9);
		assertEquals("efghijklmn", wp.textAt(ct));
		
		wp = new VWordPosition(0, 4, 0, 9);
		assertEquals("opqrstuvwx", wp.textAt(ct));
		
		wp = new VWordPosition(0, 5, 0, 9);
		assertEquals("yzabcdefgh", wp.textAt(ct));
		
		wp = new VWordPosition(0, 6, 0, 9);
		assertEquals("ijklmnopqr", wp.textAt(ct));
		
		wp = new VWordPosition(0, 7, 0, 9);
		assertEquals("stuvwxyzab", wp.textAt(ct));
		
		wp = new VWordPosition(0, 8, 0, 9);
		assertEquals("c