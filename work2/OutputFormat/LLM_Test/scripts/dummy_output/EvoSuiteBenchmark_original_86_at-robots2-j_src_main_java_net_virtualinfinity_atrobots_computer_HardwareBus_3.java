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
		
    private Map<Integer, PortHandler> ports = null;
    
    private Map<Integer, InterruptHandler> interrupts = null;

        
    /**
     * Initialize test.
     */
    private void init() {
        initPorts();
        initInterrupts();
    }

    @Test
    void initHardwareBus() {
        
        HardwareBus.addResettable(new Hardresetable());
        
        HardwareBus.startUp();
        
        init();
    }

    @Test
    void initHardwareBusForResettable() {
        
        HardwareBus.addResettable(new Hardresetable());
        
        HardwareBus.startUp();
        
        HardwareBus.shutDown();
    }

    @Test
    void initHardwareBusForShutdown(Restartable autoShutdown) {
        
        HardwareBus.addRestartable(autoShutdown);
        
        HardwareBus.startUp();
        
        HardwareBus.shutDown();
    }

    @Test
    void initHardwareBusForShutdown(ShutdownListener shutdownListener) {
        
        HardwareBus.addShutdownListener(shutdownListener);
        
        HardwareBus.startUp();
        
        HardwareBus.shutDown();
    }
    
    @Test
    void initHardwareBusForShutdownFromHttpsContext() {
        
        int port = PortHandler.getHTTPSPort();		
        
        initPorts();
        
        assertNull("Wrong HTTP listener port", ports.get(port));
        
        initShutdownListener();
        
        assertNull("Wrong shutdown listener", shutdownListeners.get(port));
        
        HardwareBus.shutDown();
    }    

    private void initPorts() {
            
        System.out.println("Initialising ports...");	
        
        ports = HardwareBus.getPorts();
    }

    private void initShutdownListener() {
        
        System.out.println("Initialising shutdown listener.");
        
        shutdownListeners.add(new ShutdownListener());
    }

    private void initInterrupts() {
        
        System.out.println("Initialising interrupt handler...");

        interrupts = HardwareBus.getInterrupts();
    }

    private void assertShutdownListenerCount(String testName, int counter) {
        
        assertEquals("Wrong number", counter, shutdownListeners.size());
        
        for (ShutdownListener listener : shutdownListeners) {

            System.out.println("Checking shutdown listener " + testName + ".");

            assertTrue("Expected shutdown listener.",shutdownListeners.contains(listener));
        }
    }
    
}