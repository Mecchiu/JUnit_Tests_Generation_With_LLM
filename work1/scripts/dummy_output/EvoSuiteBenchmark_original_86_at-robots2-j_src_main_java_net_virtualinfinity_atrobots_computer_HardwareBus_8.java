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
		private final static long time = 1;
	private final int port = 1;

        /**
         * Test unit test.
         *  Checks that {@link HardwareBus#readPort(int)}, {@link PortHandler#getPort()}, and
         * {@link PortHandler#deletePort()}.
         */
        @Test
        void readPortTest(){
            write(port, 0x1235);
            assertNotNull(read(port, 0x1235));
            assertEquals(0x1235, read(port, 0x1235));
            assertNull(read(port, 0x1235+1));
            assertNull(read(port, 0x1235-1));
        }

        /**
         * Test unit test.
         *  Checks that {@link HardwareBus#write(int, byte)} throws an error when the port is out-of-bounds.
         */
        @Test
        void writeTest() {
            write(port, 0x1235);
            assertThrows(RuntimeException.class, this::write);
        }

        /**
         * Test unit test.
         *  Checks that {@link PortHandler#deletePort()} throws an error when the handler is null.
         */
        @Test
        void deletePortTest() {
            write(port, 0x1235);
            PortHandler deleteHandler = null;
            try {
                write(port, 0x1235);
            } catch (RuntimeException e){
                deleteHandler = getPortHandler(port);
            }
            assertNull(deleteHandler);
        }

        /**
         * Test unit test.
         *  Checks that {@link PortHandler#getPort()} returns a port object on the test.
         */
        @Test
        void getPortTest() {
            write(port, 0x1321);
            assertEquals(port, read(port, 0x1321));
        }

        /**
         * Test unit test.
         *  Checks that empty ports throw an error.
         */
        @Test
        void emptyPortTest() {
            write(port, 0x1321);
            assertThrows(RuntimeException.class, () -> read(port, 0x1321));
        }

        private int[] read(int port, int defaultVal) {
            IntToShortConverter readHandler = readHandlerFactory().create();
            return readHandler.readArray(port, defaultVal);
        }

        /**
         * Test unit test.
         *  Checks that {@link PortHandler#deletePort()} throws an exception when the value is not valid for the port.
         */
        @Test
        void readForNonValidPortTest() {
            write(port, 0x1321);
            checkThrows(IllegalArgumentException.class, () -> read(port, -1));
            checkThrows(IllegalArgumentException.class, () -> read(port, 65535));
            write(port, 0x1234);
            assertThrows(RuntimeException.class, () -> read(port, 0x1234));
        }

        /**
         * Test unit test.
         *  Checks that {@link PortHandler#getPort()} returns an {@link IntToShortConverter} for the port.
         */
        @Test
        void getPortHandlerTest() {
            write(port, 0x1233);
            IntToShortConverter converter = read(port, 0x1233, 16);
            assertNotNull(converter);
        }

        /**
         * Test unit test. No ports are supported right now, so we cannot test the non-empty behaviour.
         *  Checks that {@link PortHandler#deletePort()} throws an {@link IllegalArgumentException} when the value cannot be read.
         */
        @Test
        void deletePortForNonSupportedPort() {
            write(port, 0x42f, 1);
            IntToShortConverter converter = read(port, 0x42f, 1);
            assertThrows(IllegalArgumentException.class, ()->converter.read);
        }

        /**
         * Test unit test. Tests that all ports are in the list.
         */
        @Test
        void validatePortsTest() {
            write(port, 0x1321);
            write(port, 0x543F);
            write(port, 0x1231);
}
}