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
		public void testReadPort() {
				HardwareBus hardwareBus = new HardwareBus();
				Map<Integer, PortHandler> ports = new HashMap<Integer, PortHandler>();
				ports.put(1, new PortHandler() {
						public short read() {
								return 1;
						}
						public void write(short value) {
						}
				});
				hardwareBus.setPorts(ports);
				assertEquals(1, hardwareBus.readPort(1));
		}
		
		/**
		* Test case for {@link HardwareBus#readPort(int)} method.
		* This test case checks if the method returns the correct value for a given port number.
		*/
		@Test
		public void testReadPort2() {
				HardwareBus hardwareBus = new HardwareBus();
				Map<Integer, PortHandler> ports = new HashMap<Integer, PortHandler>();
				ports.put(2, new PortHandler() {
						public short read() {
								return 2;
						}
						public void write(short value) {
						}
				});
				hardwareBus.setPorts(ports);
				assertEquals(2, hardwareBus.readPort(2));
		}
		
		/**
		* Test case for {@link HardwareBus#readPort(int)} method.
		* This test case checks if the method returns the correct value for a given port number.
		*/
		@Test
		public void testReadPort3() {
				HardwareBus hardwareBus = new HardwareBus();
				Map<Integer, PortHandler> ports = new HashMap<Integer, PortHandler>();
				ports.put(3, new PortHandler() {
						public short read() {
								return 3;
						}
						public void write(short value) {
						}
				});
				hardwareBus.setPorts(ports);
				assertEquals(3, hardwareBus.readPort(3));
		}
		
		/**
		* Test case for {@link HardwareBus#readPort(int)} method.
		* This test case checks if the method returns the correct value for a given port number.
		*/
		@Test
		public void testReadPort4() {
				HardwareBus hardwareBus = new HardwareBus();
				Map<Integer, PortHandler> ports = new HashMap<Integer, PortHandler>();
				ports.put(4, new PortHandler() {
						public short read() {
								return 4;
						}
						public void write(short value) {
						}
				});
				hardwareBus.setPorts(ports);
				assertEquals(4, hardwareBus.readPort(4));
		}
		
		/**
		* Test case for {@link HardwareBus#readPort(int)} method.
		* This test case checks if the method returns the correct value for a given port number.
		*/
		@Test
		public void testReadPort5() {
				HardwareBus hardwareBus = new HardwareBus();
				Map<Integer, PortHandler> ports = new HashMap<Integer, PortHandler>();
				ports.put(5, new PortHandler() {
						public short read() {
								return 5;
						}
						public void write(short value) {
						}
				});
				hardwareBus.setPorts(ports);
				assertEquals(5, hardwareBus.readPort(5));
		}
		
		/**
		* Test case for {@link HardwareBus#readPort(int)} method.
		* This test case checks if the method returns the correct value for a given port number.
		*/
		@Test
		public void testReadPort6() {
				HardwareBus hardwareBus = new HardwareBus();
				Map<Integer, PortHandler> ports = new HashMap<Integer, PortHandler>();
				ports.put(6, new PortHandler() {
						public short read() {
								return 6;
						}
						public void write(short value) {
						}
				});
				hardwareBus.setPorts(ports);
				assertEquals(6, hardwareBus.readPort(6));
		}
		
		/**
		* Test case for {@link HardwareBus#readPort(int)} method.
		* This test case checks if the method returns the correct value for a given port number.
		*/
		@Test
		public void testReadPort7() {
				HardwareBus hardwareBus = new HardwareBus();
				Map<Integer, PortHandler> ports = new HashMap<Integer, PortHandler>();
				ports.put(7, new PortHandler() {
						public short read() {
								return 7;
						}
						public void write(short value) {
						}
				});
				hardwareBus.setPorts(ports);
				assertEquals(7, hardwareBus.readPort(7));
		}
		
		/**
		* Test case for {@link HardwareBus#readPort(int)} method.
		* This test case checks if the method returns the correct value for a given port number.
		*/
		@Test
		public void testReadPort8() {
				HardwareBus hardwareBus = new HardwareBus();
				Map<Integer, PortHandler> ports = new HashMap<Integer, PortHandler>();
				ports.put(8, new PortHandler() {
						public short read() {
								return 8;
						}
						public void write(short value) {
						}
				});
				hardwareBus.setPorts(ports);
				assertEquals(8, hardwareBus.readPort(8));
		}
		
		/**
		* Test case for {@link HardwareBus#readPort(int)} method.
		* This test case checks if the method returns the correct value for a given port number.
		*/
		@Test
		public void testReadPort9() {
				HardwareBus hardwareBus = new HardwareBus();
				Map<Integer, PortHandler> ports = new HashMap<Integer, PortHandler>();
				ports.put(9, new PortHandler() {
						public short read() {
								return 9;
						}
						public void write(short value) {
						}
				});
				hardwareBus.setPorts(ports);
				assertEquals(9, hardwareBus.readPort(9));
		}
		
		/**
		* Test case for {