// _SetEngineInfoResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _SetEngineInfoResponse}.
* It contains one unit test case for the {@link _SetEngineInfoResponse#getTypeDesc()} method.
*/
class _SetEngineInfoResponseTest {

    private _SetEngineInfoResponse target;
    
    /**
     * Gets a new object of this type with the same fields to the the initial object.
     * Create a shallow copy.
     */
    @Test
    void testGetTypeDesc() {
        // TODO Auto-generated method stub
        assertNotNull(new _SetEngineInfoResponse());
    }
    
    /**
     * Sets up.
     */
    @Test
    void testSetup() {
        // TODO Auto-generated method stub
        target = null;
    }
    
    /**
     * Tears down.
     */
    @Test
    void testTearDown() {
        // TODO Auto-generated method stub
        assertNotNull(target);
    }
    /**
     * Tests the {@link _SetEngineInfoResponse#getTypeDesc()} method.
     */
    @Test
    public void testGetTypeDesc_1() {
       assertEquals(typeDesc, target.getTypeDesc());
    }
}