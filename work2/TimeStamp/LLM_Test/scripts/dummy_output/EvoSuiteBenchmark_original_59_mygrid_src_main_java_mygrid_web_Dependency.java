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
     * {@link Dependency#getId()} constructor test.
     */
    @Test
    void testGetId() {
        System.out.println("# DependencyTest.testGetId");
        Dependency depend = new Dependency();
        assertEquals("wrong getId() value", 0, depend.getId());
    }
	
	/**
	 * {@link Dependency#setId(java.lang.String)} constructor test.
	 */
	@Test
    public void testSetId() {
        System.out.println("# DependencyTest.testSetId");
        Dependency depend = new Dependency();
        depend.setId(5);
        assertEquals("wrong getId() value", 5, depend.getId());
    }

    /**
     * {@link Dependency#getName()} constructor test.
     */
    @Test
    public void testGetName() {
        System.out.println("# DependencyTest.testGetName");
        Dependency depend = new Dependency();
        assertEquals("wrong getName() value", null, depend.getName());
    }
	
	/**
	 * {@link Dependency#setName(java.lang.String)} constructor test.
	 */
	@Test
    public void testSetName() {
        System.out.println("# DependencyTest.testSetName");
        Dependency depend = new Dependency();
        depend.setName(null);
        assertEquals("wrong getName() value", null, depend.getName());
    }
}