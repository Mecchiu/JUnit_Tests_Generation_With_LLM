// ArrayOfJobTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfJob}.
* It contains one unit test case for the {@link ArrayOfJob#getTypeDesc()} method.
*/
class ArrayOfJobTest {
		
    @Test
    public void testTypeDesc() {
        ArrayOfJob res = ArrayOfJob.getTypeDesc();
        assertNotNull(res);
    }

    // ArrayOfJobTest.java
    
}