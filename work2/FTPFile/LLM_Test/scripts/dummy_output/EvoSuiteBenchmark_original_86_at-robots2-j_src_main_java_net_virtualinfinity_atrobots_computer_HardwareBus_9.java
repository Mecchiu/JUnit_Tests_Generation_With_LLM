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
	 * Create a test driver for a set of hardware.
	 *
	 * @param ports contains the keys to set
	 * @return a class {@link HardwareBus.HardwareBus} instance that contains a set hardware
	 * of the given keys.
	 */
	public static HardwareBus<Integer> createHardbus(Map<Integer, PortHandler> ports) {
		
		InterruptHandler interrupts = InterruptHandler.create();

		if (interrupts!= null) {
			PortHandler ph = ports.containsKey(InterruptedExceptionHandler.port)
						? PhHandlerFactory.PH_HARDWARE_INTERRUPT
						: ports.get(InterruptedExceptionHandler.port);
			interrupts.addListener(ph);
		}

		return new HardwareBus<>(new IntrHandler(), interrupts, new IntrHandler());
	}

	/**
	 * Initialize a test driver of a set of hardware.
	 *
	 * @param ports contains the keys to set
	 */
	public static void initHardware(
		    Map<Integer, PortHandler> ports
		) {
		HardwarePort.initSoftware(HardwarePort.Type.HARDWARE, getHardbus(ports));
	}

    /**
     * Test harness for a single port.
     */
    @Test
    public void testSinglePort() {
        testHardware(new MachinePort(1), new SoftwarePort);
    }

    /**
     * Test harness for a set number of ports.
     */
    @Test
    public void testMultiPorts() {
        testHardware(new MachinePort(1), new SoftwarePort,
                     new MachinePort(2), new SoftwarePort);
    }

    /**
     * Test harness for a custom interrupt handler.
     *
     * @param ports contains the keys to set
     */
    @Test
    public void testCustomInterruptHandler() {
        testHardware(new MachinePort(1), new SoftwarePort,
                     new InterruptHandler(() -> "InterruptedException"), new InterruptHandler(() -> "OtherInterrupt"));
    }

    /**
     * Test harness for a software port.
     *
     * @param ports contains the keys to set
     */
    @Test
    public void testSoftwarePort() {
        testHardware(new MachinePort(1), new SoftwarePort,
                     new MachinePort(2), new SoftwarePort(5));
    }
}