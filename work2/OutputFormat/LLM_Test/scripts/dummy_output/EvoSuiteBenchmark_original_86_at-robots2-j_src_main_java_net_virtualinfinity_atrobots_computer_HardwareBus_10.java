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
		
	private HardwareBus hardwareBus;

    private Map<Integer, PortHandler> ports;

    private Map<Integer, InterruptHandler> interrupts;

    /**
     * <p>
     * Call readPort to ensure the hardware and ports being accessed are in
     * the same state, and set write() methods to correctly write some data to
     * a channel.
     * </p>
     */
    // TODO: make sure the read method has a better idea on which port that the
    // hardware is using.  There is not a way to know which port is in use and
    // therefore it will require some testing.
    // TODO: make sure write correctly does this.
    private void callReadPort();
    

    @Test
    void test_readPorts_writesDataToChannel() {
    	//callReadPort calls getPorts();
        portHandler = new PortHandler(new MyChannel());
        this.hardwareBus.setPorts(this.ports);
        this.hardwareBus.addInterrupts(getInterrupts());
        this.hardwareBus.setShutdownListeners(new ShutdownListener[] {}); //don't add shutdown listener to hardware bus yet.
        
        //getPorts() call first time
        assertTrue(portHandler.opened());
        
        this.writePort(12, (short)12); //will trigger write()
        assertTrue(portHandler.closed());
        assertEquals(12, (int)portHandler.getValue());
        
        assertTrue(portHandler.opened());
        
        this.ports = portHandler.getPorts(); //again getPorts call
        assertTrue(portHandler.closed());
    }

    @Test
    void test_shutdownNotResequentialPorts_notReset() {
    	//callReadPort calls getPorts();
        portHandler = new PortHandler(new MyChannel());
        
        //set a shutdown listener that does nothing
        this.hardwareBus.setShutdownListeners(new ShutdownListener[] {}); //don't add shutdown listener to hardware bus yet.
        
        //getPorts() call first time
        assertTrue(portHandler.opened());
        
        //set up an interrupted status
        portHandler.onInterrupt(new InterruptedException());

        //shutdown does nothing
        this.hardwareBus.shutdown();
        assertFalse(portHandler.isInterruptible());
    }
    
    @Test
    void test_shutdownNotReset_notReset() {
    	//callReadPort calls getPorts();
        portHandler = new PortHandler(new MyChannel());
        
        //set a shutdown listener that does nothing
        this.hardwareBus.setShutdownListeners(new ShutdownListener[] {}); //don't add shutdown listener to hardware bus yet.
        
        //call readPort()
        portHandler.onInterrupt(new InterruptedException());

        //shutdown does nothing
    	this.hardwareBus.shutdown();
        
    	assertFalse(portHandler.isInterruptible());
    }

    
    //TODO: test for interruptStatus on shutdown of hardware bus should also work in shutdown
    @Test
    void test_reset_notReset() {
    	//callReadPort calls getPorts();
        portHandler = new PortHandler(new MyChannel());
        
        //set a shutdown listener that does nothing
        this.hardwareBus.setShutdownListeners(new ShutdownListener[] {}); //don't add shutdown listener to hardware bus yet.
        
        //call readPort()
        portHandler.onInterrupt(new InterruptedException());

        // reset does nothing
    	this.hardwareBus.reset();
    }
    
    class MyChannel extends PortChannel {

    }

}