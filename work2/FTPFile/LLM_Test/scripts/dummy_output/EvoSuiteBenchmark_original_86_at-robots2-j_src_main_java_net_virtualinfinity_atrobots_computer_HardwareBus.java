package net.virtualinfinity.atrobots.computer;
java
import org.junit.jupiter.api.BeforeEach;

import static org.mockito.Mockito.*;

class HardwareBusTest {

    private HardwareBus hardwareBus;
    private Map<Integer, PortHandler> mockPorts;

    @BeforeEach
    void setUp() {
        hardwareBus = new HardwareBus();
        mockPorts = mock(Map.class);
        hardwareBus.setPorts(mockPorts);
    }

    @Test
    void testReadPort_whenPortExists_thenReturnValue() {
        int portNumber = 1;
        short expectedValue = 100;
        PortHandler mockPortHandler = mock(PortHandler.class);
        when(mockPorts.containsKey(portNumber)).thenReturn(true);
        when(mockPorts.get(portNumber)).thenReturn(mockPortHandler);
        when(mockPortHandler.read()).thenReturn(expectedValue);

        short actualValue = hardwareBus.readPort(portNumber);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    void testReadPort_whenPortDoesNotExist_thenReturnZero() {
        int portNumber = 2;
        when(mockPorts.containsKey(portNumber)).thenReturn(false);

        short actualValue = hardwareBus.readPort(portNumber);

        assertEquals(0, actualValue);
    }

    // Add more test cases for readPort method as needed

}
