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
     * Test reading from a hard wired port.
     */
    @Test
    void testGetPort() {
	assertEquals(0, HardwareBridge.readPort(0));
    }


    /**
     * Test writing to a hard wired port.
     */
    @Test
    void testWritePort() {
	// write a value
	assertEquals(6, HardwareBridge.writePort(0, 6));
	// write another value
	assertEquals(7, HardwareBridge.writePort(0, 7));
    }


    /**
     * Test writing to a hard wired port that is not supported by the hardware.
     */
    @Test
    void testWritePortNotSupported() {
	HardwareBridge.addResettable(new ThreadExceptionResettable());
	// write to a port that is not supported by the hardware
	assertEquals(0, HardwareBridge.writePort(1, 9));
	// write again to the port
	assertEquals(0, HardwareBridge.writePort(1, 23));
	// write over another port
	assertEquals(1, HardwareBridge.writePort(2, 3));
	// write over a different port
	assertEquals(5, HardwareBridge.writePort(0, 7));
	// write over a different port and another port
	assertEquals(0, HardwareBridge.writePort(1, 5));
	// write over a different port but some other port
	assertEquals(6, HardwareBridge.writePort(2, 1));
	// write over one port and another
	assertEquals(7, HardwareBridge.writePort(3, 5));
    }
}

// HardwareBridgeTest.java