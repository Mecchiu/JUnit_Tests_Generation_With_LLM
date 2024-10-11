@Test
void testReadPortReturnsZeroWhenNoPortsConnected() {
    HardwareBus bus = new HardwareBus();
    short result = bus.readPort(0);
    assertEquals(0, result);
}

@Test
void testReadPortReturnsCorrectValueWhenPortConnected() {
    PortHandler port = new PortHandler() {
        @Override
        public short read() {
            return 42;
        }
    };
    HardwareBus bus = new HardwareBus();
    bus.connectPort(0, port);
    short result = bus.readPort(0);
    assertEquals(42, result);
}

@Test
void testReadPortReturnsCorrectValueWhenMultiplePortsConnected() {
    PortHandler port1 = new PortHandler() {
        @Override
        public short read() {
            return 42;
        }
    };
    PortHandler port2 = new PortHandler() {
        @Override
        public short read() {
            return 24;
        }
    };
    HardwareBus bus = new HardwareBus();
    bus.connectPort(0, port1);
    bus.connectPort(1, port2);
    short result1 = bus.readPort(0);
    short result2 = bus.readPort(1);
    assertEquals(42, result1);
    assertEquals(24, result2);
}

@Test
void testReadPortReturnsZeroWhenPortDisconnected() {
    PortHandler port = new PortHandler() {
        @Override
        public short read() {
            return 42;
        }
    };
    HardwareBus bus = new HardwareBus();
    bus.connectPort(0, port);
    bus.disconnectPort(0);
    short result = bus.readPort(0);
    assertEquals(0, result);
}

@Test
void testReadPortReturnsZeroWhenPortNotConnected() {
    HardwareBus bus = new HardwareBus();
    short result = bus.readPort(0);
    assertEquals(0, result);
}

@Test
void testReadPortReturnsCorrectValueWhenPortReconnected() {
    PortHandler port = new PortHandler() {
        @Override
        public short read() {
            return 42;
        }
    };
    HardwareBus bus = new HardwareBus();
    bus.connectPort(0, port);
    bus.disconnectPort(0);
    bus.connectPort(0, port);
    short result = bus.readPort(0);
    assertEquals(42, result);
}

@Test
void testReadPortReturnsCorrectValueWhenMultiplePortsReconnected() {
    PortHandler port1 = new PortHandler() {
        @Override
        public short read() {
            return 42;
        }
    };
    PortHandler port2 = new PortHandler() {
        @Override
        public short read() {
            return 24;
        }
    };
    HardwareBus bus = new HardwareBus();
    bus.connectPort(0, port1);
    bus.connectPort(1, port2);
    bus.disconnectPort(0);
    bus.disconnectPort(1);
    bus.connectPort(0, port1);
    bus.connectPort(1, port2);
    short result1 = bus.readPort(0);
    short result2 = bus.readPort(1);
    assertEquals(42, result1);
    assertEquals(24, result2);
}

@Test
void testReadPortReturnsCorrectValueWhenPortReconnectedToDifferentPortNumber() {
    PortHandler port = new PortHandler() {
        @Override
        public short read() {
            return 42;
        }
    };
    HardwareBus bus = new HardwareBus();
    bus.connectPort(0, port);
    bus.disconnectPort(0);
    bus.connectPort(1, port);
    short result = bus.readPort(1);
    assertEquals(42, result);
}

@Test
void testReadPortReturnsCorrectValueWhenMultiplePortsReconnectedToDifferentPortNumbers() {
    PortHandler port1 = new PortHandler() {
        @Override
        public short read() {
            return 42;
        }
    };
    PortHandler port2 = new PortHandler() {
        @Override
        public short read() {
            return 24;
        }
    };
    HardwareBus bus = new HardwareBus();
    bus.connectPort(0, port1);
    bus.connectPort(1, port2);
    bus.disconnectPort(0);
    bus.disconnectPort(1);
    bus.connectPort(1, port1);
    bus.connectPort(0, port2);
    short result1 = bus.readPort(0);
    short result2 = bus.readPort(1);
    assertEquals(24, result1);
    assertEquals(42, result2);
}

}