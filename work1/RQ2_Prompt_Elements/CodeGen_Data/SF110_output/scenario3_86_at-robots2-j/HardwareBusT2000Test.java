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
// TODO Test of class method
		@Test
		public void testReadPort(@SuppressWarnings("FieldCanBeLocal") final HardwareBus w) {
			assertTrue("Unknown hardware", w instanceof MemoryBus);
			assertNotNull("Null hardware", w);
			testReadPort(w, false);
			testReadPort(w, true);
		}
}
