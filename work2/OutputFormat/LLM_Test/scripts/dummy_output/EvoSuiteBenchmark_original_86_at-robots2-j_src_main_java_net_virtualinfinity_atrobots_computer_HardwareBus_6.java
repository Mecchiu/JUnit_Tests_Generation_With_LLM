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
     * Set to stop test while the robot is running.
     */
    @Test
    void testStopThreads() {
    }
	
    /**
     * Tests adding a port handler.
     */
    @Test
    void testAddingPort() {
        PortHandler portHandler = new SerialPortHandler();
        new HardwareBus().addPort(portHandler);
        assertNotNull("The port handler of the addPort operation should not be null", portHandler);
    }
    
    /**
     * Tests resetting the bus.
     */
    @Test
    void testReset() {
        HardwareBus bus = new HardwareBus();
        assertNotNull("No bus was created", bus);
        bus.reload();
        assertEquals("Bus reset after creation", new HardwareBus().getBusLevel(), System.currentTimeMillis(), 
            "Bus is still active after calling reset");
        bus.loadResettable(new Resettable() {
            @Override
            public void execute() throws InterruptedException {
                throw new InterruptedException();
            }
        }
        );
        assertTrue("Could not reload the bus", bus.isReady());
        TimeRunner.startTime("Reset", 0, System.currentTimeMillis());
        bus.rescheduleAll();
        bus.run();
        assertTrue("Bus reset after one second", System.currentTimeMillis() <= System.currentTimeMillis() + 1000);
        
        TimeRunner.endSeconds("Reset", "Test after", System.currentTimeMillis());
        
        assertFalse("The bus should be set to shutdown!", bus.isReady());
        
        new SoftwareShutdown(new int[] { 1 }, new int[] { 1, 2 }, new int[] { 0, 0 }, new ArrayList<ShutdownListener>()).start();
        
        System.out.println("The machine shutdowns at " + new SoftwareShutdown().shutdownMessage() + " in " + System.currentTimeMillis());
    }
    
    /**
     * Tests the call of one interrupt.
     */
    @Test
    void testOneInterrupt() {
        int commandIndex = 0;
        InterruptHandler interruptHandler = new InterruptHandler(new int[][] { { 0 }, {} });
        new HardwareBus().addInterrupt(interruptHandler, new Interrupt(commandIndex));
        assertEquals("No interrupt handler was created", new HardwareBus().getInterruptHandlerCount(), 1, "interrupt handler was not initialized correctly");
        for (InterruptHandler handler : new HardwareBus().getInterruptHandlerCollection()) assertFalse("The interrupt handler has already been registered",
                                                                                       new HardwareBus().getInterruptHandlerCount() > 0,
                                                                                       "interrupt handler was not returned correctly");
    }

    /**
     * Tests adding resettable from within the reset method.
     */
    @Test
    void testResetFromReset() {
       
        new SoftwareShutdown(new int[][] {}, new int[][] {}, new int[][] {}, new ArrayList<ShutdownListener>())
               .start();
        new HardwareBus().addResetable(new Resettable() {
            
            @Override
            public boolean execute() throws InterruptedException {
                throw new InterruptedException();
            }
        });
    }

    /**
     * Test of the call of shutdown
     */
    @Test
    void testShutdown() {
        new SoftwareShutdown(new int[][] {}, new int[][] {}, new int[][] {}, new ArrayList<ShutdownListener>())
               .start();
        new SoftwareShutdown(new int[][] {}, new int[][] {}, new int[][] {}, new ArrayList<ShutdownListener>())
               .start();
        assertEquals("The bus shutdown does not make any new call", newSoftwareShutdown().stop(), new SoftwareShutdown().stop());
    }
    
    private SoftwareShutdown testShutdown() {
        return new SoftwareShutdown();
    }
    
    private HardwareBus instance() {
        return new HardwareBus();
    }
    
    private SoftwareShutdown instanceShutdown() {
        return new SoftwareShutdown();
    }
}