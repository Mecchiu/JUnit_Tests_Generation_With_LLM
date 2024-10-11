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

    private final int size;

    public Memory(int size) {
        this.size = size;
    }

    /**
     * Get the total size of this memory.
     *
     * @return the size.
     */
    public int size() {
        return size;
    }
}

// Memory_0Test.java
package net.virtualinfinity.atrobots.computer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Memory}.
* It contains ten unit test cases for the {@link Memory#size()} method.
*/
class Memory_0Test {

    @Test
    void testSize() {
        Memory memory = new Memory(100);
        assertEquals(100, memory.size());
    }

    @Test
    void testSizeZero() {
        Memory memory = new Memory(0);
        assertEquals(0, memory.size());
    }

    @Test
    void testSizeNegative() {
        assertThrows(IllegalArgumentException.class, () -> new Memory(-1));
    }

    @Test
    void testSizeMaxValue() {
        Memory memory = new Memory(Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, memory.size());
    }

    @Test
    void testSizeMinValue() {
        assertThrows(NegativeArraySizeException.class, () -> new Memory(Integer.MIN_VALUE));
    }

    @Test
    void testSizeOverflow() {
        assertThrows(OutOfMemoryError.class, () -> new Memory(Integer.MAX_VALUE + 1));
    }

    @Test
    void testSizeUnderflow() {
        assertThrows(OutOfMemoryError.class, () -> new Memory(Integer.MIN_VALUE - 1));
    }

    @Test
    void testSizeHalfMaxValue() {
        Memory memory = new Memory(Integer.MAX_VALUE / 2);
        assertEquals(Integer.MAX_VALUE / 2, memory.size());
    }

    @Test
    void testSizeHalfMinValue() {
        assertThrows(NegativeArraySizeException.class, () -> new Memory(Integer.MIN_VALUE / 2));
    }
}