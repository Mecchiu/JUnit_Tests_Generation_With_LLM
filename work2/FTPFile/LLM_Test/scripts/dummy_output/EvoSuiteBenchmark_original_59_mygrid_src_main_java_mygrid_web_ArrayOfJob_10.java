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
    public void testGetTypeDesc() {
          System.out.println("ArrayOfJobTest.testGetTypeDesc");
  ArrayOfJob retObj = new ArrayOfJob();

          assertNotNull(retObj.getTypeDesc());
    }

}