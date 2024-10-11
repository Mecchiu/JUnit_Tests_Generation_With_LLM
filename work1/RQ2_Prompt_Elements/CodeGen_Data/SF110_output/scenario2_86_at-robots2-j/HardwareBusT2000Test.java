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
     * Test cases.
     */
    @Test
    public void writePortTest() {
        byte b0 = 10;
        byte b3 = 35;
        byte b2 = 33;
        short s0 = 10;
        short s3 = 35;
        short s2 = 33;
        
        byte[] data = {b0, b1, b2 };
        
        // Set b3 and s2
        HardwareBus.writePort(3, 20);
        assertEquals(Byte.toString(b3), Byte.toString(data[3]));
        assertEquals(Byte.toString(s3), Byte.toString(data[4]));


        // Set b0 and s2
        HardwareBus.writePort(0, 20);
        assertEquals(Byte.toString(b0), Byte.toString(data[0]));
        assertEquals(Byte.toString(s2), Byte.toString(data[1]));
        
        // Invalid ports => AssertException
        assertThrows(NullPointerException.class, () -> {
            HardwareBus.writePort(10, 20);
        });
        
        // Invalid hardware => AssertException
        assertThrows(ClassCastException.class, () -> {
            HardwareBus.writePort(2, 30);
        });
        
        // Invalid hardware => AssertException
        assertThrows(InvalidParameterException.class, () -> {
            HardwareBus.writePort(2, -16);
        });
        
        // Invalid data => AssertException 
        assertThrows(InvalidDataException.class, () -> {
            HardwareBus.writePort(2, 30, data);
        });

        // Invalid data => AssertException 
        assertThrows(InvalidDataException.class, () -> {
            HardwareBus.writePort(2, 30, s3);
        });

        // Valid ports => Array of bytes
        assertThrows(ClassCastException.class, () -> {
            byte[] data = {s2};
            HardwareBus.writePort(2, 30, data);
        });

        // Valid data => byte[]
        assertThrows(ClassCastException.class, () -> {
            byte[] data = {s0, s1};
            HardwareBus.writePort(2, 30, data);
        });
        
        // Valid data => byte[]
        assertThrows(ClassCastException.class, () -> {
            byte[] data = {s0};
            HardwareBus.writePort(2, 30, data);
        });
        
    }

    @Test
    public void readPortTest() {
        byte[] data = {10,35,25};
        byte[] expectedData = {"10", "35", "25"};
        
        // Set data
        HardwareBus.readPort(0);
        byte[] testData = new byte[data.length];
        for (int i = 0; i < data.length; i++) {
            testData[i] = data[i];
        }
        assertArrayEquals(expectedData, testData);
        
        // Unset the data
        HardwareBus.readPort(3);
        expectedData = new byte[data.length];
        if (data.length!= expectedData.length) {
            System.out.println("Warning: Data is truncated at position "
                    + Arrays.toString(expectedData)+ " to position "
                    + Arrays.toString(data));
        }
        for (int i = 0; i < data.length; i++) {
            testData[i] = expectedData[i];
        }
        assertArrayEquals(expectedData, testData);
        
        // Invalid ports => AssertException
        assertThrows(IndexOutOfBoundsException.class, () -> {
            HardwareBus.readPort(-10);
        });
        
        // Invalid hardware => AssertException
        assertThrows(ClassCastException.class, () -> {
            HardwareBus.readPort(2);
        });

        // Valid ports => Array of bytes
        assertThrows(IndexOutOfBoundsException.class, () -> {
            byte[] data = {10};
            HardwareBus.readPort(2, data.length);
        });

        // Valid data => byte[]
        assertThrows(IndexOutOfBoundsException.class, () -> {
            byte[] data = {10};
            HardwareBus.readPort(2, data.length);
        });

        // Valid data => byte[]
        assertThrows(ClassCastException.class, () -> {
            byte[] data = {10};
            HardwareBus.readPort(2, data.length);
        });

        // Valid data => byte[]
        assertThrows(ClassCastException.class, () -> {
            byte[] data = {s2};
            HardwareBus.readPort(2, data.length);
        });

        // Valid data => byte[]
        assertThrows(ClassCastException.class, () -> {
            byte[] data = {s0};
            HardwareBus.readPort(2, data.length);
        });
    }

    @Test
    public void portHandlerTest() {
        byte[] data = {10,35,25};
        Collection<PortHandler<byte[]>> handlers = createHandlers(data);
        
        for (PortHandler<byte[]> handler : handlers) {
            assertEquals(100, handler.get());
        }
        
        // Unset the data
        Collection<PortHandler<byte[]>> handlers2 = createHandlers(new byte[]);
        assertArrayEquals(new ArrayList<>(), handlers2);
        
        // Invalid ports => AssertException
        assertThrows(NullPointerException.class, () -> {
            PortHandler<byte[]> handler = new PortHandler<>();
            assertEquals(100, (int) handler.get());
        });
        
        // Invalid hardware => AssertException
        assertThrows(ClassCastException.class, () -> {
            PortHandler<byte[]> handler = new PortHandler<>();
            assertEquals(100, (int) handler.get());
        });
        
        // Valid ports => Array of bytes
        Collection<PortHandler<byte[]>> handlers3 = createHandlers(data);
        assertArrayEquals(new ArrayList<>(), handlers3);
        
        // Valid data => byte[]
        Collection<PortHandler<byte[]>> handlers4 = createHandlers(new byte[]);
        assertArrayEquals(new ArrayList<>(), handlers4);
        
        // Valid data => byte[]
        Collection<PortHandler<byte[]>> handlers5 = createHandlers(new byte[]);
        assertArrayEquals(new ArrayList<>(), handlers5);
        
        // Valid data => byte[]
        Collection<PortHandler<byte[]>> handlers6 = createHandlers(new byte[]);
        assertArrayEquals(new ArrayList<>(), handlers6);
    }
    
    private Collection<PortHandler<byte[]>> createHandlers(byte[] data) {
        Collection<byte[]> handlers = new ArrayList<>();
        for (Port