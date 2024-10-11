// ProgramTest.java
package net.virtualinfinity.atrobots.computer;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Program}.
* It contains one unit test case for the {@link Program#createProgramMemory()} method.
*/
class ProgramTest {
		 /**
		 * Creates a test {@link Program} with a given program code.
		 */
		private Program programTester = new Program(new short[] { 1, 2, 4, 5, 7, 23 });

		 /**
		 * Test method 1 for {@link Program#createProgramMemory()}.
		 */
		@Test
    /**
     * Testing the getCode for the first 5 program codes.
     */
		public void testFirstCode() {
   		assertArrayEquals(
                   new short[] {
                       1, 2, 4, 5, 7, 23
                   },
                    programTester.getCode()
            );
   	}



		 /**
		 * Test method 1 for {@link Program#getCode()}.
		 */
		@Test
    /**
     * Testing the getCode for the second program codes plus 10, 11, 12, and 13.
     */
		public void testCodeForNext() {
   		assertArrayEquals(
                   new short[] {
                       9, 100, 500, 799, 1, 2000, 2199, 4350, 2900, 9999, 999909, 999912
                   },
                    programTester.getCode()
            );
   	}

		/**
		 * Test method 2 for getProgramCode().
		 */
		@Test
		/**
         * Testing the getProgramCode method with a code at the start of the program.
         */
        public void testGetProgramCode() {
   		assertArrayEquals(
                   new short[] {
                       97, 100, 505, 598, 100, 799
                   },
                    programTester.getProgramCode()
            );
   	}

		/**
		 * Test method 2 for setProgramCode().
		 */
		@Test
    /**
     * Testing the setProgramCode method with a previous code.
     */
		public void testSetProgramCode() {
   		assertArrayEquals(
                   new short[] {
                       97, 100, 505, 798, 101, 799
                   },
                    programTester.setProgramCode(
                                        new short[] {
                                            97, 6, 100, 799
                                        }
			                  )
            );
   	}

		/**
		 * Test method 3 for putProgramCode().
		 */
		@Test
    /**
     * Testing the putProgramCode method with null argument.
     */
        public void testPutProgramCode() {
   		assertArrayEquals(
                   new short[] {
                       98, 100, 507, 798
                   },
                    programTester.putProgramCode(
                                        null
			                  )
            );
   	}




		 /**
		 * Test method 4 for getProgramLength().
		 */
		@Test
    /**
     * Testing the getProgramLength for a 0-length program data file.
     */
        public void testGetProgramLengthZero() {
   		assertArrayEquals(
                   new short[] {
                       98, 100, 507, 798
                   },
                    programTester.getProgramLength(0)
            );
   	}




}