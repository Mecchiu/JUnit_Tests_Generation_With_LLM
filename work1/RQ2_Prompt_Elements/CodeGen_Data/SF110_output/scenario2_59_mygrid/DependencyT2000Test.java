// DependencyTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Dependency}.
* It contains one unit test case for the {@link Dependency#getTypeDesc()} method.
*/
class DependencyTest {

    	@Test
    	int value = 99;

    	public void test() {
    		assertEquals(value, Dependency.getTypeDesc().javaType);
    	}
    }