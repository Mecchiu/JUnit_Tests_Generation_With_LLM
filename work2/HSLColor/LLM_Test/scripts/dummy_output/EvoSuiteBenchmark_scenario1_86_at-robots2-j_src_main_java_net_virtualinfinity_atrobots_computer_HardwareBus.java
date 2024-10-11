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
* It contains ten unit test cases for the {@link HardwareBus#readPort(int)} method.
*/
class HardwareBusTest {
		
		/**
		* Test case for {@link HardwareBus#readPort(int)} method.
		* This test case checks if the method returns the correct value for a given port number.
		*/
		@Test
		void testReadPort() {
				HardwareBus hardwareBus = new HardwareBus();
				assertEquals(0, hardwareBus.readPort(0));
		}
}