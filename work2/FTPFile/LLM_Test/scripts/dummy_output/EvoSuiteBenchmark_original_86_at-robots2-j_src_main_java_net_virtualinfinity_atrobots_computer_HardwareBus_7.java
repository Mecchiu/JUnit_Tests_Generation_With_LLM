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
		
    private final InterruptHandler interruptOne = new InterruptHandler("one", 1);
    private final InterruptHandler interruptTwo = new InterruptHandler("two", 2);

    private final InterruptHandler interruptThree = new InterruptHandler("three", 3);
    private final InterruptHandler interruptFour = new InterruptHandler("four", 4);

    private final ShutdownListener shutdownOne = new ShutdownListener(1, interruptOne);
    private final ShutdownListener shutdownTwo = new ShutdownListener(2, interruptTwo);
    private final ShutdownListener shutdownThree = new ShutdownListener(3, interruptThree);
    private final ShutdownListener shutdownFour = new ShutdownListener(4, interruptFour);

    private final boolean isShuttingDownOne;
    private final boolean isShuttingDownTwo;
    private final boolean isShuttingDownThree;
    private final boolean isShuttingDownFour;

    /**
     * Create a test class of {@link HardwareBus}.
     * It contains one unit test case for the {@link HardwareBus#readPort(int)} method.
     */
    public HardwareBusTest() {
        reset();
        isShuttingDownOne = shutdownOne.hasBeenCleaned();
        isShuttingDownTwo = shutdownTwo.hasBeenCleaned();
        isShuttingDownThree = shutdownThree.hasBeenCleaned();
        isShuttingDownFour = shutdownFour.hasBeenCleaned();
    }

    /**
     * Test method of {@link HardwareBus#readPort(int)}.
     */
    @Test
    void testReadPort() {
        assertEquals("one number", 1, readPort(1));
        System.in.read(); // Enter the interrupt for one...
        assertEquals("two number", 2, readPort(2));
        assertEquals("three number", 3, readPort(3));
        assertEquals("four number", 4, readPort(4));
    }

    /**
     * Test the {@link HardwareBus#callInterrupt(int)} method.
     */
    @Test
    void testCallInterrupt() {
        assertEquals("one number", 1, callInterrupt(1));
        assertEquals("one number", 1, callInterrupt(1));
        assertEquals("one number", 1, callInterrupt(1));
        assertEquals("two number", 2, callInterrupt(2));
        assertEquals("two number", 2, callInterrupt(2));
        assertEquals("three number", 3, callInterrupt(3));
        assertEquals("three number", 3, callInterrupt(3));
        assertEquals("four number", 4, callInterrupt(4));
        assertEquals("four number", 4, callInterrupt(4));

        try {
            callInterrupt(-1); // If you have a number here which is not in the
                            // range [0, 9] (which is the standard range where the
                            // number will get corrupted), you get an exception.
            fail("An exception should be thrown as the interrupt number must be <= 0.");
        } catch (IllegalArgumentException expected) {
            // We expect this error, so we should get a nice message.
        }
    }

    /**
     * Test the {@link HardwareBus#shutdown()} method.
     */
    @Test
    void testShutdown() {
        shutdownOne.clear();
        assertEquals("1 number", 1, getShutdownLevel());
        assertNotEquals(1, getShutdownLevel());

        shutdownTwo.setHasCleaned();
        System.in.read();  // Enter the interrupt for two...
        assertEquals("2 number", 2, getShutdownLevel());
        assertNotEquals(2, getShutdownLevel());

        shutdownThree.setHasBeenCleaned();
        sleep(4);    // Wait a little after three...
        assertEquals("2 number", 2, getShutdownLevel());
        assertNotEquals(2, getShutdownLevel());

        shutdownOne.setHasBeenCleaned();
        assertEquals("1 number", 1, getShutdownLevel());
        assertNotEquals(1, getShutdownLevel());

        shutdownFour.setHasBeenCleaned();
        System.in.read(); // Enter the interrupt for four...
        assertEquals("3 number", 3, getShutdownLevel());
        assertNotEquals(3, getShutdownLevel());
        shutdownFour.setHasBeenCleaned();
}
}