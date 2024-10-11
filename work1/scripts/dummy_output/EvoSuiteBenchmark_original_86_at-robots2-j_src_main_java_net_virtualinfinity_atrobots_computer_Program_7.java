// ProgramTest.java
package net.virtualinfinity.atrobots.computer;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Program}.
* It contains one unit test case for the {@link Program#createProgramMemory()} method.
*/
class ProgramTest {
		private Program testobj;
	
		/**
		 * Sets up the test.
		*/
		@Test
		public void test(){
			testobj = new Program(new short[] {
					0x00,    /* 00..00: 00: program code 1 */
					0x00,    /* 00..00: 00: program code 2 */
					0x00,    /* 00..00: 00: program code 3 */
					0x00,    /* 00..00: 00: program code 4 */
					0x00,    /* 00..00: 00: program code 5 */
					0x00,    /* 00..00: 00: program code 6 */
					0x00,    /* 00..00: 00: program code 7 */
					0x00,    /* 00..00: 00: program code 8 */
					0x00
			});
		}

		/**
		 * Returns the test object.
		 * @return the test object.
		 */
		public Program getObject() {
			return testobj;
		}
		@Override
		public String toString() {
			return "ProgramTest [testobj=" + testobj + "]";
		}
	}