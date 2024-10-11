// EngineTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Engine}.
* It contains one unit test case for the {@link Engine#getTypeDesc()} method.
*/
class EngineTest {
		
    @Test
    public void getTypeDesc() {
        assertNotNull("The message object returned in response body of this message should not be null.", Engine.getTypeDesc() );
    }
}