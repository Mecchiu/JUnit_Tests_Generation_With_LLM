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
     * Test of readPort(int) method of <code>#HardwareBus(Map,Map,HardwareBus<Map,Map,boolean>,boolean)</code> class.
     */
    @Test
    public void testReadPort_InputPort1() {
        
        Map<Integer, PortHandler> ports = new HashMap<Integer, PortHandler>();
        ports.put(new Integer(1), new PortHandler());
        
        Map<Integer, InterruptHandler> interrupts = new HashMap<Integer, InterruptHandler>();
        interrupts.put(new Integer(0), new InterruptHandler());
        
        Map<Integer, SystemShutdownListener> shutdownListeners = new HashMap<Integer, SystemShutdownListener>();
        SystemShutdownListener listener = new SystemShutdownListener();
        shutdownListeners.put(new Integer(1), listener);
        
        // We will add two shutdown listeners because of the interrupt on the first interrupt port.
        ShutdownListener firstShutdownListener = new ShutdownListener(new ShutDownListener(new InterruptHandler(),1));
        shutdownListeners.put(new Integer(0), firstShutdownListener);
        
        SystemShutdownListener secondShutdownListener = new ShutdownListener(new ShutDownListener(new InterruptHandler(), 0));
        shutdownListeners.put(new Integer(1), secondShutdownListener);
        
        setInterrupts(interrupts);
        setShutdownListeners(shutdownListeners);
        
        HardwareBus bus = new HardwareBus(ports, interrupts, shutdownListeners);
        
        int portNumber = 1;
        short value = hardwareBus.readPort(portNumber);
        System.out.println("Read: "+value);
        
        System.out.println("Result: "+ value);
    }
    
    /**
     * Test of readPort(int) method of <code>#HardwareBus(Map,Map,HardwaredBus<Map,Map,boolean>,boolean)</code> class.
     */
    @Test
    public void testReadPort_InputPort2() {
        
        Map<Integer, PortHandler> ports = new HashMap<Integer, PortHandler>();
        ports.put(new Integer(1), new PortHandler());
        
        Map<Integer, InterruptHandler> interrupts = new HashMap<Integer, InterruptHandler>();
        interrupts.put(new Integer(0), new InterruptHandler());
        
        Map<Integer, SystemShutdownListener> shutdownListeners = new HashMap<Integer, SystemShutdownListener>();
        shutdownListeners.put(new Integer(1), new ShutDownListener());
        
        Map<Integer, SystemShutdownListener> shutdownListeners2 = new HashMap<Integer, SystemShutdownListener>();
        shutdownListeners2.put(new Integer(0), new SystemShutdownListener());
        
        SystemShutdownListener listener = new SystemShutdownListener();
        shutdownListeners2.put(new Integer(1), listener);
        
        SystemShutdownListener secondShutdownListener = new SystemShutdownListener();
        shutdownListeners2.put(new Integer(1), secondShutdownListener);

        setInterrupts(interrupts);
        setShutdownListeners(shutdownListeners);

        setShutdownListeners2(shutdownListeners2);
        
        HardwareBus bus = new HardwareBus(ports, interrupts, shutdownListeners, true);
        
        int portNumber = 1;
        short value = hardwareBus.readPort(portNumber);
        System.out.println("Read: "+value);
        
        System.out.println("Result: "+ value);
    }
    
    
    /**
     * Reset all resetables in this hardward bus.
     */
    void reset() {
        setInterrupts(new HashMap());
        shutdownListeners.clear();
        System.out.println("Resetting...");
        hardwareBus.reset();
        assertNotNull(hardwareBus.getResettable());
        System.out.println("OK!");
    }
    
    /**
     * Start up.
     */
    void startUp() {
        
        hardwareBus.startUp();
        assertNotNull(hardwareBus);
        System.out.println("Start up...");
        
        reset();
        assertNotNull(hardwareBus.getResettable());
}
}