// DependencyTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Dependency}.
* It contains one unit test case for the {@link Dependency#getTypeDesc()} method.
*/
class DependencyTest {
		DependencyTest(final Dependency d) {
//		System.out.println("DependencyTest");
		}
		
  @Test
    public void testgetTypeDesc() {
      assertNotNull(d);
      assertTrue(d.getTypeDesc()!= null);
    }
}