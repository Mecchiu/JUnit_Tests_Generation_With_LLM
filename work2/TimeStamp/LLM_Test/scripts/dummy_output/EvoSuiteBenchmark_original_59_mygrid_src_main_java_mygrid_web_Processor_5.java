// ProcessorTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Processor}.
* It contains one unit test case for the {@link Processor#getTypeDesc()} method.
*/
class ProcessorTest {
		private Processor processor;
    private java.lang.String typeDescResult = null;

    /**
     * @see Processor#getTypeDesc()
     * @throws Exception
     */
    @Test
    public void test_getter_single_type() throws Exception {
        assertNotNull(processor.getType());
    }
    /**
     * @see Processor#setType(java.lang.String)
     * @throws Exception
     */
    @Test
    public void test_setter_single_type() throws Exception {
        processor.setType(Type.DEPLOYMENT.getValue());
        typeDescResult = processor.getTypeDesc();
        assertEquals("deployment", typeDescResult);
        processor.setType("unknown");
    }
    /**
     * @see Processor#getTypeDesc()
     * @throws Exception
     */
    @Test
    public void test_setter_multiple() throws Exception {
        processor.setAssembly("unknownAssembly");
        typeDescResult = processor.getTypeDesc();
        assertEquals("deployment", typeDescResult);
        processor.setAssembly("assembly");
    }
    /**
     * @see Processor#getTypeDesc()
     * @throws Exception
     */
    @Test
    public void test_setter_null() throws Exception {
        typeDescResult = processor.getTypeDesc();
        assertEquals("deployment", typeDescResult);
        processor.setAssembly(null);
    }
}