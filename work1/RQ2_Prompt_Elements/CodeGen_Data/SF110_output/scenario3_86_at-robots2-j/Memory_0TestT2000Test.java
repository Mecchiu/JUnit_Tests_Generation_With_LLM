// Memory_0Test.java
package net.virtualinfinity.atrobots.computer;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Memory}.
* It contains one unit test case for the {@link Memory#size()} method.
*/
class Memory_0Test {

	@Test
	void test() {
			
		// We use a list that we can add units of other types here.
		List<Integer> units = new ArrayList<>();
		for (int unit1 = 1; unit1 <= 16; unit1++) {
		
			units.add(unit1);
			
			addUnit = unit1 >>> 1;
		}
		// We add the unit to that list.
		for (int unit = 0; unit < 5; unit++) {
			
			for (int unit1 = 0; unit1 < 5; unit1++) {
			
				addUnit *= 1024;
			}
		}
		for (int unit1 = 0; unit1 < 16; unit1++) {
		
			for (int unit2 = 0; unit2 < 16; unit2++) {
			
				addUnit1k *= 1024;
			}
		}
		
		assertEquals("size for this class should be equal to 128", 128, Memory.size());
		assertTrue(Memory.size() == Memory_0.size());
		
		int val = Memory_0.size();
		// Test with a larger size, such that the result of the
		// calculation is larger than the maximum.
		val = val << 1 | val >> 4;
		assertEquals("size of unit 1 should be greater than 16", val, 1);
	}

	/**
	 * Create all units, and test with the following cases:
	 *  1. we use the size of 2 units
	 *  2. we use the size of 3 units
	 *  3. we use the size of 1 unit
	 *  4. we use the size of 3 units
	 *  5. we use the size of 2 units
	 */
	@Test
	void test4() {
			
		for (int i = 1; i < 6; i++) {
			
			// Add 0x50 to the total size of all units.
			int add = 0x50 & i;
			int total = add << 1 | add >> 4;
			assertEquals("size must be a multiple of 16", total, 16);
			
			int expectedSize = add << 2 | add >> 6;	
			
			add = add & 3 | add >> 2;	
			expectedSize = expectedSize & add;
			
			if (expectedSize == add) {
				
				// Case 4, add the value.
				total = total | add;
			} else {
				// Case 5, remove the first value.
				total = total & (128 - add);
				
				// Add 4 values into this total.
				total = total & 0xF0 | add & 0x0F;
			}
			
			assertEquals("total unit #" + i + " size should be set like " + add, total, add);
		}
	}

	/**
	 * Create 0k units all the same sizes as this.
	 * This means we add 0k units in all the cases, i.e. first case 4.
	 * After this the total result is 0x7FFF.
	 * Each time we add 1 units, the total result is 0xFFFF.
	 * Then we add 2 units, then 3 and 4, and so on.
	 */
	@Test(expected = RuntimeException.class)
	void test4_1() {
	
		int i = 0;
		
		//Add some value
		int add = 1234;
		for (; i < 12; i++) {
			sum = sum + add;
			assertEquals("sum is not ok", sum, sum & 3);
			add = add | add << 1;
		}
		
		int sum1k = 0;
		
		while (i < 10) {
			// Add some value
			sum1k = sum1k + 1;
			add = sum1k;
			
			for (; (i+1) > 1; i++) {
				assertEquals("sum is not equal to 0", sum1k, sum & 3);
				add = add | add << 1;
			}
			
			sum1k = sum1k | add;
		}
		
		sum = sum + add;
		assertEquals("sum is not ok", 0u, sum);
	}
	
	@Test
    public void test() {
        
		for (int i = 1; i <= 7; i++) {
			
			// add unit 1k for size 7, 6 for size 2, 2k for size 3
			Memory.addUnit1k(i, 16);
			
			// add unit 1k for size 7, 6 for size 2
			for (int newUnit1k = 0; newUnit1k < 16; newUnit1k++) {
				
				Memory.addUnit1k(i, (i & 1)? 16 : 8);
				
			}
			
			// check the total.
			int sum = Memory.size();
			assertEquals("expected memory size", i * 16, sum);
		}
	}

}
