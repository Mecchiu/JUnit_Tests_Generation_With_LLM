// Here's an example implementation of the HardwareBusTest class:

class HardwareBusTest {

    @Test
    void testReadPortReturnsCorrectValue() {
        // Arrange
        HardwareBus bus = new HardwareBus();
        Map<Integer, PortHandler> ports = new HashMap<>();
        ports.put(0, new TestPortHandler((short) 42));
        bus.setPorts(ports);

        // Act
        short result = bus.readPort(0);

        // Assert
        assertEquals(42, result);
    }

    @Test
    void testReadPortThrowsExceptionForInvalidPortNumber() {
        // Arrange
        HardwareBus bus = new HardwareBus();

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> bus.readPort(-1));
        assertThrows(IllegalArgumentException.class, () -> bus.readPort(65536));
    }

    @Test
    void testReadPortReturnsZeroForUnmappedPort() {
        // Arrange
        HardwareBus bus = new HardwareBus();

        // Act
        short result = bus.readPort(0);

        // Assert
        assertEquals(0, result);
    }

    @Test
    void testReadPortCallsPortHandler() {
        // Arrange
        HardwareBus bus = new HardwareBus();
        TestPortHandler portHandler = new TestPortHandler((short) 42);
        Map<Integer, PortHandler> ports = new HashMap<>();
        ports.put(0, portHandler);
        bus.setPorts(ports);

        // Act
        bus.readPort(0);

        // Assert
        assertTrue(portHandler.isReadCalled());
    }

    @Test
    void testReadPortPassesCorrectValueToPortHandler() {
        // Arrange
        HardwareBus bus = new HardwareBus();
        TestPortHandler portHandler = new TestPortHandler((short) 0);
        Map<Integer, PortHandler> ports = new HashMap<>();
        ports.put(0, portHandler);
        bus.setPorts(ports);

        // Act
        bus.readPort(0);

        // Assert
        assertEquals(0, portHandler.getLastReadValue());
    }

    @Test
    void testReadPortReturnsValueFromPortHandler() {
        // Arrange
        HardwareBus bus = new HardwareBus();
        TestPortHandler portHandler = new TestPortHandler((short) 42);
        Map<Integer, PortHandler> ports = new HashMap<>();
        ports.put(0, portHandler);
        bus.setPorts(ports);

        // Act
        short result = bus.readPort(0);

        // Assert
        assertEquals(42, result);
    }

    @Test
    void testReadPortDoesNotCallOtherPortHandlers() {
        // Arrange
        HardwareBus bus = new HardwareBus();
        TestPortHandler portHandler = new TestPortHandler((short) 0);
        Map<Integer, PortHandler> ports = new HashMap<>();
        ports.put(0, portHandler);
        ports.put(1, new TestPortHandler((short) 0));
        bus.setPorts(ports);

        // Act
        bus.readPort(0);

        // Assert
        assertFalse(ports.get(1).isReadCalled());
    }

    @Test
    void testReadPortCallsAllPortHandlers() {
        // Arrange
        HardwareBus bus = new HardwareBus();
        TestPortHandler portHandler1 = new TestPortHandler((short) 0);
        TestPortHandler portHandler2 = new TestPortHandler((short) 0);
        Map<Integer, PortHandler> ports = new HashMap<>();
        ports.put(0, portHandler1);
        ports.put(1, portHandler2);
        bus.setPorts(ports);

        // Act
        bus.readPort(0);

        // Assert
        assertTrue(portHandler1.isReadCalled());
        assertTrue(portHandler2.isReadCalled());
    }

    @Test
    void testReadPortReturnsValueFromLastPortHandler() {
        // Arrange
        HardwareBus bus = new HardwareBus();
        TestPortHandler portHandler1 = new TestPortHandler((short) 0);
        TestPortHandler portHandler2 = new TestPortHandler((short) 42);
        Map<Integer, PortHandler> ports = new HashMap<>();
        ports.put(0, portHandler1);
        ports.put(1, portHandler2);
        bus.setPorts(ports);

        // Act
        short result = bus.readPort(0);

        // Assert
        assertEquals(42, result);
    }

    private static class TestPortHandler implements PortHandler {
        private short lastReadValue;
        private boolean readCalled;

        public TestPortHandler(short lastReadValue) {
            this.lastReadValue = lastReadValue;
        }

        @Override
        public short read() {
            readCalled = true;
            return lastReadValue;
        }

        @Override
        public void write(short value) {
            // Do nothing
        }

        public short getLastReadValue() {
            return lastReadValue;
        }

        public boolean isReadCalled() {
            return readCalled;
        }
    }
}