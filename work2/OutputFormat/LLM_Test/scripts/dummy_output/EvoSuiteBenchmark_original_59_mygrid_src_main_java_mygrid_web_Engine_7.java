// EngineTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Engine}.
* It contains one unit test case for the {@link Engine#getTypeDesc()} method.
*/
class EngineTest {
		static {
			org.apache.axis.description.ElementStyle style = new org.apache.axis.description.ElementStyle();
			style.
        setUseAttributes (
        		org.apache.axis.description.ElementDesc.INCLUDE_REAL_TRAILING_ANCHORS_ATTR, 
        		org.apache.axis.description.ElementDesc.USE_ALL_ATTRIBUTES, 
        		org.apache.axis.description.ElementDesc.INCLUDE_ALL_ROOTS_ATTR);
            setStyle(style);
        }
       
    /**
     * Test for getTypeDesc method, constructor.
     */
    @Test
    public void testGetTypeDesc() {
        String expectedName = "engine";
        if (expectedName.endsWith("Engine")) {
            expectedName = expectedName.substring(0, expectedName.length()-4);
        }
        org.junit.jupiter.api.TestInstance(expectedName.toCharArray()).
  			run()
  		.
  		assertMethod("getTypeDesc()", org.junit.jupiter.api.extension.MethodResetter.RESET);
    }
}