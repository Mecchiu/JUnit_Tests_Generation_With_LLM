// ContextElementTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContextElement}.
* It contains one unit test case for the {@link ContextElement#getTypeDesc()} method.
*/
class ContextElementTest {

	/**
	* Method which executes of the "get" method.
	*/
	@org.junit.jupiter.api.Test
    public void testGet() {
		
    	assertNotNull(ContextElement.getTypeDesc());
    }
        
} 
//ContextElementTest.java