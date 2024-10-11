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

//	private final DriverTest driverTest = new DriverTest();
//	private final SensorTest sensorTest = new SensorTest();
//	private final DriverCompositeTest driverCompositeTest = new DriverCompositeTest();

	/**
	 * Test getters and setters.
	 *
	 * A test unit that uses {@link hardware.HardwareBus#testHardware} to get hardware.
	 */
//	static {
//		tests.add(hardware.HardwareBus.class);
//		tests.add(hardware.hardware.driver.Driver.class);
//		tests.add(hardware.hardware.sensor.SensorTest.class);
//		tests.add(hardware.hardware.drivers.DriverComposite.class);
//	}

    /**
     * Verifies that the hardware is read correctly using the {@link Hardware#hardware()} method.
     *
     * Verifies using the <code>readPort(int)</code> method.
     *
     * @throws AssertionError
     *          always throws AssertionError
     */
    @Test
    void testHardware() {
		
    	// We are making sure no changes in hardware are made within the same operation

		Collection<String> keys = driverTest.testHardware(new Hardware(new HardwareInput(1)));
    	
		assertEquals(1,keys.size());
				
		String key = keys.iterator().next();
    		
    	// we need to check the value of the key
    	
		assertEquals("Driver input 1",key);
    }
	
    /**
     * Verifies that the hardware is read correctly using the {@link Hardware#hardware()} method.
     *
     * Verifies using the <code>readPort(int)</code> method.
     *
     * @throws AssertionError
     *          always throws AssertionError
     */
    @Test
    void testHardwareWithSensorOutput() {
		
    	// We are making sure all output from this key are set on the hardware
    	
    	Collection<String> keys = driverCompositeTest.testHardware(new Hardware(new HardwareOutput(1)));
    	
		assertEquals(3,keys.size());
    	
		String key = keys.iterator().next();
    		
    	// we need to check the value of the key
    	
		assertEquals("Driver output 1",key);
    }
}
