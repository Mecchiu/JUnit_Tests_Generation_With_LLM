// JobTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Job}.
* It contains one unit test case for the {@link Job#getTypeDesc()} method.
*/
class JobTest {
 
    @Test
    public void test() {
        
        assertNotNull("The Job.getTypeDesc() instance should not be null.", Job.getTypeDesc());
        assertEquals("The Job.getTypeDesc() cannot be set to an empty string.", Job.getTypeDesc().getDefinition(), "");    
    }        
}
