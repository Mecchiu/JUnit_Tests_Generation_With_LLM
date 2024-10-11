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
		
    /**
     * Create a unit test.
     *
     * @param _size the size.
     */
    public Memory_0Test(int _size) {
        if (_size < 4) {
            throw new UnsupportedOperationException();
        }
    }

    @Test
    public void testSize() {
        int[] values = {1, 2, 3};
        for (int i = 0; i < values.length; i++) {
            assertEquals(_size(i, values), values.length);
        }

        int size = values.length - 1;
        for (int i = 0; i < values.length; i++) {
            assertEquals(_size(i + 1, values), size);
        }

        values = null;
        throw new UnsupportedOperationException();
    }

	/**
	 * Gets the value for a particular array location.
	 *
	 * <pre>
	 * get_value(array_location).value
	 * </pre>
	 *
	 * @param _arrayLocation the array location.
	 * @return the value of the given array location.
	 */
	public short get_value(int _arrayLocation);

	public void set(int _arrayLocation, int _value);
	public short get_value(int address);

	/**
	 * Test the function of setting the {@link AddressFinder}, {@link AddressMap},
	 * {@link MemoryCell} and {@link Memory} objects.
	 * This class tests the actual behaviour when set, get, increment, decrement, or
	 * increment/decrement.
	 */
	public class TestObject {

}
}