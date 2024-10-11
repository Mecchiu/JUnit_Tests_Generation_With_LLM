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
     *  One unit testcase for {@link Dependency#getTypeDesc()}. 
     */
    @Test
    public void testgetTypeDesc()
    {
        org.apache.axis.description.TypeDesc typeDesc = Dependency.getTypeDesc();
        assertEquals("DependencyDescriptor",typeDesc.getJustification());
    }
    
    // Type description
	String getId(); 
	
	/**
	Get unit test ID.
	*/
	String getDependency();
	
}

