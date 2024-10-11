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

		private final HardwareBus hardwareBus = new HardwareBus();
		
		private final Heat heat = new Heat();
		
		private final Restartable restartable = new Restartable() {
				public void reset() {
				}
				public boolean isShutDown() {
						return false;
				}
				public void startUp() {
				}
		};
		
		private final ShutdownListener shutdownListener = new ShutdownListener() {
				public void shutDown() {
				}
		};
		
		private final PortHandler portHandler = new PortHandler() {
				public short read() {
						return 0;
				}
				public void write(short value) {
				}
		};
		
		private final InterruptHandler interruptHandler = new InterruptHandler() {
				public void call() {
				}
		};
		
		private final Map<Integer, PortHandler> ports = new Map<Integer, PortHandler>() {
				public int size() {
						return 0;
				}
				public boolean isEmpty() {
						return false;
				}
				public boolean containsKey(Object key) {
						return false;
				}
				public boolean containsValue(Object value) {
						return false;
				}
				public PortHandler get(Object key) {
						return null;
				}
				public PortHandler put(Integer key, PortHandler value) {
						return null;
				}
				public PortHandler remove(Object key) {
						return null;
				}
				public void putAll(Map<? extends Integer, ? extends PortHandler> m) {
				}
				public void clear() {
				}
				public Set<Integer> keySet() {
						return null;
				}
				public Collection<PortHandler> values() {
						return null;
				}
				public Set<Entry<Integer, PortHandler>> entrySet() {
						return null;
				}
		};
		
		private final Map<Integer, InterruptHandler> interrupts = new Map<Integer, InterruptHandler>() {
				public int size() {
						return 0;
				}
				public boolean isEmpty() {
						return false;
				}
				public boolean containsKey(Object key) {
						return false;
				}
				public boolean containsValue(Object value) {
						return false;
				}
				public InterruptHandler get(Object key) {
						return null;
				}
				public InterruptHandler put(Integer key, InterruptHandler value) {
						return null;
				}
				public InterruptHandler remove(Object key) {
						return null;
				}
				public void putAll(Map<? extends Integer, ? extends InterruptHandler> m) {
				}
				public void clear() {
				}
				public Set<Integer> keySet() {
						return null;
				}
				public Collection<InterruptHandler> values() {
						return null;
				}
				public Set<Entry<Integer, InterruptHandler>> entrySet() {
						return null;
				}
		};
		
		private final Collection<Resettable> resettables = new ArrayList<Resettable>();
		
		private final Collection<ShutdownListener> shutdownListeners = new ArrayList<ShutdownListener>();
		
		private final Restartable autoShutdownTarget = new Restartable() {
				public void reset() {
				}
				public boolean isShutDown() {
						return false;
				}
				public void startUp() {
				}
		};
		
		private final Temperature autoShutDown = Temperature.fromLogScale(350);
		
		@Test
		void testGetPorts() {
				assertEquals(ports, hardwareBus.getPorts());
		}
		
		@Test
		void testSetPorts() {
				hardwareBus.setPorts(ports);
				assertEquals(ports, hardwareBus.getPorts());
		}
		
		@Test
		void testGetInterrupts() {
				assertEquals(interrupts, hardwareBus.getInterrupts());
		}
		
		@Test
		void testSetInterrupts() {
				hardwareBus.setInterrupts(interrupts);
				assertEquals(interrupts, hardwareBus.getInterrupts());
		}
		
		@Test
		void testCallInterrupt() {
				hardwareBus.callInterrupt(0);
		}
		
		@Test
		void testReadPort() {
				assertEquals(0, hardwareBus.readPort(0));
		}
		
		@Test
		void testWritePort() {
				hardwareBus.writePort(0, (short) 0);
		}
		
		@Test
		void testReset() {
				hardwareBus.reset();
		}
		
		@Test
		void testAddResetable() {
				hardwareBus.addResetable(restartable);
		}
		
		@Test
		void testAddShutdownListener() {
				hardwareBus.addShutdownListener(shutdownListener);
		}
		
		@Test
		void testSetAutoShutdownListener() {
				hardwareBus.setAutoShutdownListener(autoShutdownTarget);
		}
		
		@Test
		void testCheckHeat() {
				hardwareBus.checkHeat();
		}
		
		@Test
		void testIsAutoStartupEngaged() {
				assertFalse(hardwareBus.isAutoStartupEngaged());
		}
		
		@Test
		void testIsAutoShutdownEngaged() {
				assertFalse(hardwareBus.isAutoShutdownEngaged());
		}
		
		@Test
		void testStartUp() {
				hardwareBus.startUp();
		}
		
		@Test
		void testShutDown() {
				hardwareBus.shutDown();
		}
		
		@Test
		void testGetShutdownLevel() {
				assertEquals(350, hardwareBus.getShutdownLevel());
		}
		
		@Test
		void testSetShutdownLevel() {
				hardwareBus.setShutdownLevel(350);
		}
		
		@Test
		void testSetHeat() {
				hardwareBus.setHeat(heat);
		}
}</code>





A:

I think you are looking for something like this:
<code>public class HardwareBus {

    private