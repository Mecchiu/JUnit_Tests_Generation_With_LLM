// HardwareBusTest.java
package net.virtualinfinity.atrobots.computer;

import net.virtualinfinity.atrobots.measures.Heat;
import net.virtualinfinity.atrobots.measures.Temperature;
import net.virtualinfinity.atrobots.ports.PortHandler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HardwareBus}.
* It contains one unit test case for the {@link HardwareBus#readPort(int)} method.
*/
class HardwareBusTest {
		/**
		 * Asserts that {@code value} is written to the port with the specified port number.
		 *
		 * @param portNumber the port number to check for.
		 * @param value       the value to check to.
		 */
    public static void assertOne(final int portNumber, final short value)
    {
        assertTrue(Arrays.asList(new short[] { value }).contains(new short[] { portNumber }), "One value.");
    }

        /**
        * Asserts that {@code value} is written to the port with the specified port number.
        *
        * @param portNumber the port number to check for.
        * @param values     the values for the values to check to.
        */
    private static void assertMany(
            final int portNumber,
            final short[] values)
    {
        assertArrayEquals(new short[] {values[0]}, values, "One value.");
    }	

	/**
	 * Asserts that {@code value} is written to the port with the specified port number and
	 * contains the values represented in the {@code values}.
	 *
	 * @param portNumber the port number to check for.
	 * @param values     the values for the values to check to.
	 */
    private static void assertOne(final int portNumber, final String[] values)
    {
        assertTrue(Arrays.asList(new String[] { values }).contains(new String[] { values[0] }), "One value.");
    }

    /**
     * Asserts that {@code value} is written to the port with the specified port number.
     *
     * @param portNumber the port number to check for.
     * @param values     the values for the values to check to.
     */
    private static void assertMany(
            final int portNumber,
            final String[] values)
    {
        assertArrayEquals(new String[] { values[0] }, values, "One value.");
    }
    }