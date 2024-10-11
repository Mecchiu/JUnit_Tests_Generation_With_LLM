// ProcessorTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Processor}.
* It contains one unit test case for the {@link Processor#getTypeDesc()} method.
*/
class ProcessorTest {
		
     private Processor processor = new Processor();

	@Test
    public void getTypeDesc() {
        assertNotNull(processor.getTypeDesc());
    }

    @Test
    public void testSetType() {
              
        // add type and check if processor was updated accordingly
        processor.setType("test");
        assertEquals("test", processor.getType());

        assertTrue(processor.getType() == null);
    }

	@Test
    public void setAssembly() {
              
        // set Assembly and check if processor was updated accordingly
        processor.setAssembly("test");
        assertEquals("test", processor.getAssembly());

        assertTrue(processor.getAssembly() == null);
    }

	@Test
    public void addAssembly() {
              
        // add Assembly and check if processor was updated accordingly
        processor.addAssembly("test");
        assertEquals("test", processor.getAssembly());

        assertTrue(processor.getAssembly() == null);
    }

	@Test
    public void addAssemblyInvalid() {
              
        // add Assembly and check if exception is thrown when adding the Assembly to the existing Assembly
        try {
            processor.addAssembly("test");
        } catch (NumberFormatException ex) {
            assertTrue(ex.getMessage().contains("Invalid assembly address"));
        }
        
        // add Assembly and check if exception is thrown when adding the Assembly to the existing Assembly
        processor = new Processor();
        try {
            processor.addAssembly("test");
        } catch (NumberFormatException ex) {
            assertTrue(ex.getMessage().contains("Invalid assembly address"));
        }
    }

}