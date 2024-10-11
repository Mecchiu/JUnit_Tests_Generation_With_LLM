// DiscriminatorTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Discriminator}.
* It contains one unit test case for the {@link Discriminator#getTypeDesc()} method.
*/
class DiscriminatorTest {
		
    private final float cpu = 1;
    
    private final float memory = 50000;
    
    private final String os = "Linux";
    
    private final String vmType = "xen";
    
    /**
     * Method which performs one unit test case of {@link Discriminator#getTypeDesc()}, using the static constants defined in mygrid.web.ArrayOfString
     * and mygrid.jaxb.Processor.
     */
    @Test
    public void testGetTypeDesc() {
        
        // Set the constants defined in mygrid.web.ArrayOfString and mygrid.jaxb.Processor
        Discriminator.setAllowedEngines(new mygrid.web.ArrayOfString());
        Discriminator.setCPU("40.0");
        Discriminator.setRAM("500.0 k");
        Discriminator.setOS("Linux");
        
        // Perform the test
        org.junit.jupiter.api.Assertions.assertEquals(org.junit.jupiter.api.Assertions.assertNotNull(typeDesc(cpu, memory, vmType)).getTypeDesc(), Discriminator.class);
    }
    
}