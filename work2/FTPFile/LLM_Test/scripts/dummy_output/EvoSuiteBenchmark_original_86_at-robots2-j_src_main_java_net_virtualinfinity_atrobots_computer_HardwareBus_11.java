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
		
	@Test
	void readPort() {
		assertEquals("read-port test", 0x0000, HardwareBus.readPort(0));
		
		assertEquals("read-port test", 0xffff, HardwareBus.readPort(65535));

		assertEquals("read-port test", 723, readPort(0x8001));
		
		assertNull("remove port test", readPort(0x8002));
		
		assertEquals("read-port test", 723, readPort(0x8003));
		
		assertEquals("read-port test", 723, readPort(0x8005));
		
		assertNull("remove port test", readPort(0x8006));
 		
		assertNull("remove port test", readPort(0x8007));
		
		assertNull("remove port test", readPort(0x8009));
		
		assertEquals("read-port test", 723, readPort(0x800A));
		
		assertNull("remove port test", readPort(0x800B));
		
		assertEquals("read-port test", 723, readPort(0x800C));
		
		assertNull("remove port test", readPort(0x800D));
		
		assertNull("remove port test", readPort(0x800E));
		
		assertNull("remove port test", readPort(0x800F));
	}
}