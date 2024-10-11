// ProgramTest.java
package net.virtualinfinity.atrobots.computer;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Program}.
* It contains one unit test case for the {@link Program#createProgramMemory()} method.
*/
class ProgramTest {
		
    final static int M = 256;        // Minimum size (number of bytes).
    final static short CODE = 0xC6; // Initial read code.


    private int[] arrayIn;

	/**
	 * Test for an empty {@link Program}.
	 */
    @Test
    void test() {
       assertTrue(true);
    }

    /**
     * Tests the size of the byte array.
     */
    @Test
    public void testArrayIn() {
        assertEQ(M, arrayIn.length);
    }

    /**
     * Tests if the initial program code and initial memory access is a read of 0.
     *
     * @return true
     */
    public boolean isProgramCode() {
        return READ(0) == CODE;
    }

    /**
     * Tests if the initial program code and initial memory access is the read of 0.
     *
     * @return true
     */
    public boolean isProgramCodeRead() {
        return READ(0) == CODE;
    }

    /**
     * Tests if program code and initial memory access for a long read yields the expected result.
     *
     * @throws Exception
     */
    @Test
    public void testByteArray() throws Exception {
        int initialRead = READ(0);
        for (int i = 0; i<5; i++) {
            short intRead = READ(i);
            if (READ(i) == 0) {
                assertEQ(finalByte(i), intRead);
            }
        }
    }

    /**
     * Tests if program code and initial memory access for a short read also yields the expected result.
     *
     * @throws Exception
     */
    @Test
    public void testShortArray() throws Exception {
        int initialRead = READ(0);
        for (int i = 0; i<4+M; i++) {
            short intRead = READ(i);
            if (READ(i) == 0 && READ(i+1) == 0) {
                assertEQ(intByte(i), intRead);
            }
        }
    }

    /**
     * Sets READ.
     * Tests if read instruction yields expected result.
     *
	 * @throws Exception
     */
    @Test
    public void testReadWriteTrue() throws Exception {
        arrayIn = createProgramMemory();
        for (int i = 0; i < 15; i++) {
            for (short j = 0; j < 5; j++) {
                arrayIn[READ(j)] = READ(i);
            }
        }
        for (int p = 0; p < 40; p++) {
            for (int i = 5; i < 40; i++) {
                finalByte[] intBytes = createIntArray();
                arrayIn[i] = intBytes[READ(i)];
            }
        }
    }

    /**
     * Sets READ (from memory).
     * Tests if read instruction yields expected result.
     */
    @Test
    public void testReadWriteFalse() {
        arrayIn = createProgramMemory();
        for (short j = 0; j < 5; j++) {
            for (short i = 1; i < 5; i++) {
                arrayIn[i] = READ(i);
            }
        }
        arrayIn = createProgramMemory();
        for (short i = 5; i < 40; i++) {
            finalByte[] intBytes = createIntArray();
            arrayIn[i] = intBytes[READ(0)];
        }
    }

    /**
     * Creates the memory that is created by the constructor.
     *
	 * @return
	 */
    private int [] createProgramMemory() {
        int result = 0;
        for (int p = 0; p < M; p++) {
            result = result << 1 | READ(p);
        }
        return result;
    }

    /**
     * Creates an integer array where value is set to a random element.
     *
	 * @return
	 */
    private int [] createIntArray() {
        int[] result = new int[40];
        arrayIn = result;
        for(int i=0;i<M;i++) {
            result[READ(i)]++;
        }
        return result;
    }

    /**
     * Tests READ.
     */
    private void assertEQ(short result, short expected) {
        assertEQ(Integer.toBinaryString(result), Integer.toBinaryString(expected));
    }

    /**
     * Tests READ.
     */
    private short assertEQ(String i, short expected) {
        return (short) Integer.parseInt(i, 16);
    }

    /**
     * Utility method which fills arrayIn with random bytes based on READ().
     *
	 * @return
	 */
    private intByte [] generateRandomInt() {
        return new intByte[]{ READ, READ, READ, READ};
    };

    /**
     * Utility method which fills arrayIn with random bytes based on READ().
     *
	 * @return
	 */
    private intByte [] generateIntArray() {
        return new intByte[]{ READ, READ, READ, READ};
    };
}