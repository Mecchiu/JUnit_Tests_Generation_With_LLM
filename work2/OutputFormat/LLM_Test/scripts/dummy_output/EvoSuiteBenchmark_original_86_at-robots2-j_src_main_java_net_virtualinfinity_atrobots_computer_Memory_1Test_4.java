// Memory_1Test.java
package net.virtualinfinity.atrobots.computer;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Memory}.
* It contains one unit test case for the {@link Memory#get(int)} method.
*/
class Memory_1Test {
		
	@Test
	void testEmptyArray(){
		Memory empty = new Memory();
		System.out.println(empty.toString());
		assertNotNull(empty.getArrayAt(0));
		assertNull(empty.getArrayAt(-1));
	}
	
	@Test
	void testFirstArray(){
		Memory first = new Memory();
		first.addInt(0);
		assertEquals(first.toString(), "0");
		assertNotNull(first.getArrayAt(0));
		first.setInt(0, 1);
		assertEquals(first.toString(), "1");
	}

	@Test
	void testManyArray(){
		Memory first = new Memory();
		for(int i=0;i<11;i++) {
			first.addInt(i*10);
			assertEquals(first.toString(), String.valueOf(i*10));
		}
		assertEquals(first.toString(), String.valueOf(0));
		assertNull(first.getArrayAt(11));
		first.setInt(11, 11);
		assertEquals(first.toString(), String.valueOf(11));
		assertNotNull(first.getArrayAt(11));
		assertNotNull(first.getArrayAt(19));
	}

}