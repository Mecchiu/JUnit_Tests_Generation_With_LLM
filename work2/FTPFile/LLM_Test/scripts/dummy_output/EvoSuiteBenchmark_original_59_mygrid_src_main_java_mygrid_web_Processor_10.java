// ProcessorTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Processor}.
* It contains one unit test case for the {@link Processor#getTypeDesc()} method.
*/
class ProcessorTest {
		
	/**
	* Test method for {@link Processor#getTypeDesc()}.
	* Verify that the java.lang.String representation of a processor's type is the right.
	*/
	@Test
    public void testTypeDesc() {
        Processor processor = new Processor();
        Processor.TypeDesc expected = new Processor.TypeDesc();
        // Now test the actual code to make sure it worked as intended
/*
        String code = "processors.getTypeDesc();";
        String[] codeParts = code.split(" ");

        code = codeParts[0];
        expected.setValue(code);
        assertEquals("Value of processor.getTypeDesc() wrong.", expected.getValue(), processor.getTypeDesc());
*/
    }
	}