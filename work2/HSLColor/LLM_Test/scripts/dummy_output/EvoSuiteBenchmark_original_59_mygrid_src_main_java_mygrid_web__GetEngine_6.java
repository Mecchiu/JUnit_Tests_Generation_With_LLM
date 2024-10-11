// _GetEngineTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _GetEngine}.
* It contains one unit test case for the {@link _GetEngine#getTypeDesc()} method.
*/
class _GetEngineTest {
		
    /**
     * Test constructor
     */
    @Test
    public void _GetEngineTest(){
        assertEquals(_GetEngine.getTypeDesc().hashCode(), 0);
        assertEquals(1, _GetEngine.getTypeDesc().getFormalParameters().length);
    }
}