// ArrayOfContextElementTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfContextElement}.
* It contains one unit test case for the {@link ArrayOfContextElement#getTypeDesc()} method.
*/
class ArrayOfContextElementTest {
		
  // ==================================================
  // Test Methods
  // ==================================================
  
  /**
   * Test of getTypeDesc method, of class mygrid.web.ArrayOfContextElement.
   */
  @Test
  public void testGetTypeDesc() {
    System.out.println("getTypeDesc");
    ArrayOfContextElement instance = null;
    org.apache.axis.description.TypeDesc typeDesc = instance.getTypeDesc();
    assertNotNull(typeDesc);
  }
  
}