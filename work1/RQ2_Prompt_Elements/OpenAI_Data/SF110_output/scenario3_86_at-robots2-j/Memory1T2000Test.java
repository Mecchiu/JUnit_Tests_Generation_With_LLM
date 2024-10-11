// MemoryTest.java
package net.virtualinfinity.atrobots.computer;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Memory}.
* It contains ten unit test cases for the {@link Memory#get(int)} method.
*/
class MemoryTest {

		/**
		* Test case 1:
		* The address is negative.
		* The expected result is 0.
		*/
		@Test
		public void testGet1() {
				Memory memory = new Memory();
				assertEquals(0, memory.get(-1));
		}
		
		/**
		* Test case 2:
		* The address is 0.
		* The expected result is 0.
		*/
		@Test
		public void testGet2() {
				Memory memory = new Memory();
				assertEquals(0, memory.get(0));
		}
		
		/**
		* Test case 3:
		* The address is 1.
		* The expected result is 0.
		*/
		@Test
		public void testGet3() {
				Memory memory = new Memory();
				assertEquals(0, memory.get(1));
		}
		
		/**
		* Test case 4:
		* The address is 2.
		* The expected result is 0.
		*/
		@Test
		public void testGet4() {
				Memory memory = new Memory();
				assertEquals(0, memory.get(2));
		}
		
		/**
		* Test case 5:
		* The address is 3.
		* The expected result is 0.
		*/
		@Test
		public void testGet5() {
				Memory memory = new Memory();
				assertEquals(0, memory.get(3));
		}
		
		/**
		* Test case 6:
		* The address is 4.
		* The expected result is 0.
		*/
		@Test
		public void testGet6() {
				Memory memory = new Memory();
				assertEquals(0, memory.get(4));
		}
		
		/**
		* Test case 7:
		* The address is 5.
		* The expected result is 0.
		*/
		@Test
		public void testGet7() {
				Memory memory = new Memory();
				assertEquals(0, memory.get(5));
		}
		
		/**
		* Test case 8:
		* The address is 6.
		* The expected result is 0.
		*/
		@Test
		public void testGet8() {
				Memory memory = new Memory();
				assertEquals(0, memory.get(6));
		}
		
		/**
		* Test case 9:
		* The address is 7.
		* The expected result is 0.
		*/
		@Test
		public void testGet9() {
				Memory memory = new Memory();
				assertEquals(0, memory.get(7));
		}
		
		/**
		* Test case 10:
		* The address is 8.
		* The expected result is 0.
		*/
		@Test
		public void testGet10() {
				Memory memory = new Memory();
				assertEquals(0, memory.get(8));
		}
}

// Memory.java
package net.virtualinfinity.atrobots.computer;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents the entire memory (RAM and ROM) of a {@link net.virtualinfinity.atrobots.computer.Computer}.
 *
 * @author Daniel Pitts
 */
public class Memory {

    /**
     * Read the value at the specific address
     *
     * @param address the address to read.
     * @return the value at that address, or 0 if invalid.
     */
    public short get(int address) {
        if (address < 0) {
            return 0;
        }
        return 0;
    }
}

// MemoryTest.java
package net.virtualinfinity.atrobots.computer;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Memory}.
* It contains ten unit test cases for the {@link Memory#get(int)} method.
*/
class MemoryTest {
		
		/**
		* Test case 1:
		* The address is negative.
		* The expected result is 0.
		*/
		@Test
		public void testGet1() {
				Memory memory = new Memory();
				assertEquals(0, memory.get(-1));
		}
		
		/**
		* Test case 2:
		* The address is 0.
		* The expected result is 0.
		*/
		@Test
		public void testGet2() {
				Memory memory = new Memory();
				assertEquals(0, memory.get(0));
		}
		
		/**
		* Test case 3:
		* The address is 1.
		* The expected result is 0.
		*/
		@Test
		public void testGet3() {
				Memory memory = new Memory();
				assertEquals(0, memory.get(1));
		}
		
		/**
		* Test case 4:
		* The address is 2.
		* The expected result is 0.
		*/
		@Test
		public void testGet4() {
				Memory memory = new Memory();
				assertEquals(0, memory.get(2));
		}
		
		/**
		* Test case 5:
		* The address is 3.
		* The expected result is 0.
		*/
		@Test
		public void testGet5() {
				Memory memory = new Memory();
				assertEquals(0, memory.get(3));
		}
		
		/**
		* Test case 6:
		* The address is 4.
		* The expected result is 0.
		*/
		@Test
		public void testGet6() {
				Memory memory = new Memory();
				assertEquals(0, memory.get(4));
		}
		
		/**
		* Test case 7:
		* The address is 5.
		* The expected result is 0.
		*/
		@Test
		public void testGet7() {
				Memory memory = new Memory();
				assertEquals(0, memory.get(5));
		}
		
		/**
		* Test case 8:
		* The address is 6.
		* The expected result is 0.
		*/
		@Test
		public void testGet8() {
				Memory memory = new Memory();
				assertEquals(0, memory.get(6));
		}
		
		/**
		* Test case 9:
		* The address is 7.
		* The expected result is 0.
		*/
		@Test
		public void testGet9() {
				Memory memory = new Memory();
				assertEquals(0, memory.get(7));
		}
		
		/**
		* Test case 10:
		* The address is 8.
		* The expected result is 0.
		*/
		@Test
		public void testGet10() {
				Memory memory = new Memory();
				assertEquals(0, memory.get(8));
		}
}

// Memory.java
package net.virtualinfinity.atrob