// ProcessorTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Processor}.
* It contains one unit test case for the {@link Processor#getTypeDesc()} method.
*/
class ProcessorTest {
		
    @Test
    public void testGetTypeDesc(){
        Processor processor = new Processor();
        assertNotNull(processor.getTypeDesc());
    }

    @Test
    public void testType(){
        Processor processor = new Processor();
        assertNotNull(processor.getType());
    }


}