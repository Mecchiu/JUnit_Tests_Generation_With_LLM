// BomberClient_0Test.java
package client;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link BomberClient}.
 * It contains ten unit test cases for the {@link BomberClient#getInstance()} method.
 */
class BomberClient_0Test {

    /**
     * Test case for getting the singleton instance of BomberClient.
     */
    @Test
    void testGetInstance() {
        BomberClient instance1 = BomberClient.getInstance();
        assertNotNull(instance1);
        BomberClient instance2 = BomberClient.getInstance();
        assertSame(instance1, instance2);
        BomberClient instance3 = BomberClient.getInstance();
        assertSame(instance2, instance3);
        BomberClient instance4 = BomberClient.getInstance();
        assertSame(instance3, instance4);
        BomberClient instance5 = BomberClient.getInstance();
        assertSame(instance4, instance5);
        BomberClient instance6 = BomberClient.getInstance();
        assertSame(instance5, instance6);
        BomberClient instance7 = BomberClient.getInstance();
        assertSame(instance6, instance7);
        BomberClient instance8 = BomberClient.getInstance();
        assertSame(instance7, instance8);
        BomberClient instance9 = BomberClient.getInstance();
        assertSame(instance8, instance9);
        BomberClient instance10 = BomberClient.getInstance();
        assertSame(instance9, instance10);
    }
}