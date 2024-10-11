// DependencyTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Dependency}.
* It contains one unit test case for the {@link Dependency#getTypeDesc()} method.
*/
class DependencyTest {
		
	/**
	* Return the type {@link Dependency#getTypeDesc()} value.
	*/
	@Test
    public void testGetTypeDesc() {
        System.out.println("testGetTypeDesc");
		
		java.lang.String typeDesc = new Dependency().getTypeDesc();
		
        assertEquals("getTypeDesc", typeDesc);
    }

}