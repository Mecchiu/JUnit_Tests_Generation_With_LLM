// Memory_0Test.java
package net.virtualinfinity.atrobots.computer;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Memory}.
* It contains ten unit test cases for the {@link Memory#size()} method.
*/
class Memory_0Test {

		/**
		* Test case for the {@link Memory#size()} method.
		*/
		@Test
		void testSize_0() {
				Memory memory = new Memory();
				assertEquals(0, memory.size());
		}
		
		/**
		* Test case for the {@link Memory#size()} method.
		*/
		@Test
		void testSize_1() {
				Memory memory = new Memory();
				memory.addMemoryArray(new MemoryArray(0, 0));
				assertEquals(0, memory.size());
		}
		
		/**
		* Test case for the {@link Memory#size()} method.
		*/
		@Test
		void testSize_2() {
				Memory memory = new Memory();
				memory.addMemoryArray(new MemoryArray(0, 1));
				assertEquals(1, memory.size());
		}
		
		/**
		* Test case for the {@link Memory#size()} method.
		*/
		@Test
		void testSize_3() {
				Memory memory = new Memory();
				memory.addMemoryArray(new MemoryArray(0, 1));
				memory.addMemoryArray(new MemoryArray(1, 1));
				assertEquals(2, memory.size());
		}
		
		/**
		* Test case for the {@link Memory#size()} method.
		*/
		@Test
		void testSize_4() {
				Memory memory = new Memory();
				memory.addMemoryArray(new MemoryArray(0, 1));
				memory.addMemoryArray(new MemoryArray(1, 1));
				memory.addMemoryArray(new MemoryArray(2, 1));
				assertEquals(3, memory.size());
		}
		
		/**
		* Test case for the {@link Memory#size()} method.
		*/
		@Test
		void testSize_5() {
				Memory memory = new Memory();
				memory.addMemoryArray(new MemoryArray(0, 1));
				memory.addMemoryArray(new MemoryArray(1, 1));
				memory.addMemoryArray(new MemoryArray(2, 1));
				memory.addMemoryArray(new MemoryArray(3, 1));
				assertEquals(4, memory.size());
		}
		
		/**
		* Test case for the {@link Memory#size()} method.
		*/
		@Test
		void testSize_6() {
				Memory memory = new Memory();
				memory.addMemoryArray(new MemoryArray(0, 1));
				memory.addMemoryArray(new MemoryArray(1, 1));
				memory.addMemoryArray(new MemoryArray(2, 1));
				memory.addMemoryArray(new MemoryArray(3, 1));
				memory.addMemoryArray(new MemoryArray(4, 1));
				assertEquals(5, memory.size());
		}
		
		/**
		* Test case for the {@link Memory#size()} method.
		*/
		@Test
		void testSize_7() {
				Memory memory = new Memory();
				memory.addMemoryArray(new MemoryArray(0, 1));
				memory.addMemoryArray(new MemoryArray(1, 1));
				memory.addMemoryArray(new MemoryArray(2, 1));
				memory.addMemoryArray(new MemoryArray(3, 1));
				memory.addMemoryArray(new MemoryArray(4, 1));
				memory.addMemoryArray(new MemoryArray(5, 1));
				assertEquals(6, memory.size());
		}
		
		/**
		* Test case for the {@link Memory#size()} method.
		*/
		@Test
		void testSize_8() {
				Memory memory = new Memory();
				memory.addMemoryArray(new MemoryArray(0, 1));
				memory.addMemoryArray(new MemoryArray(1, 1));
				memory.addMemoryArray(new MemoryArray(2, 1));
				memory.addMemoryArray(new MemoryArray(3, 1));
				memory.addMemoryArray(new MemoryArray(4, 1));
				memory.addMemoryArray(new MemoryArray(5, 1));
				memory.addMemoryArray(new MemoryArray(6, 1));
				assertEquals(7, memory.size());
		}
		
		/**
		* Test case for the {@link Memory#size()} method.
		*/
		@Test
		void testSize_9() {
				Memory memory = new Memory();
				memory.addMemoryArray(new MemoryArray(0, 1));
				memory.addMemoryArray(new MemoryArray(1, 1));
				memory.addMemoryArray(new MemoryArray(2, 1));
				memory.addMemoryArray(new MemoryArray(3, 1));
				memory.addMemoryArray(new MemoryArray(4, 1));
				memory.addMemoryArray(new MemoryArray(5, 1));
				memory.addMemoryArray(new MemoryArray(6, 1));
				memory.addMemoryArray(new MemoryArray(7, 1));
				assertEquals(8, memory.size());
		}
		
		/**
		* Test case for the {@link Memory#size()} method.
		*/
		@Test
		void testSize_10() {
				Memory memory = new Memory();
				memory.addMemoryArray(new MemoryArray(0, 1));
				memory.addMemoryArray(new MemoryArray(1, 1));
				memory.addMemoryArray(new MemoryArray(2, 1));
				memory.addMemoryArray(new MemoryArray(3, 1));
				memory.addMemoryArray(new MemoryArray(4, 1));
				memory.addMemoryArray(new MemoryArray(5, 1));
				memory.addMemoryArray(new MemoryArray(6, 1));
				memory.addMemoryArray(new MemoryArray(7, 1));
				memory.addMemoryArray(new MemoryArray(8, 1));
				assertEquals(9, memory.size());
		}
}

// Memory_1Test.java
package net.virtualinfinity.atrobots.computer;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Memory}.
* It contains ten unit test cases for the {@link Memory#get(int)} method.
*/
class Memory_1Test {
		
		/**
		* Test case for the {@link Memory#get(int)} method.
		*/
		@Test
		void testGet_0() {
				Memory memory = new Memory();
				assertEquals(0, memory.get(0));
		}
		
		/**
		* Test case for the {@link Memory#get(int)} method.
		*/
		@Test
		void testGet_1() {
				Memory memory = new Memory();
				memory.addMemoryArray(new MemoryArray(0, 1));
				assertEquals(0, memory.get(0));
		}
		
		/**
		* Test case for the {@link Memory#get(int)}