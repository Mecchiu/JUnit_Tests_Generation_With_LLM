// JobTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Job}.
* It contains ten unit test cases for the {@link Job#getTypeDesc()} method.
*/
class JobTest {
		
	@Test
	void testGetTypeDesc() {
		assertNotNull(Job.getTypeDesc());
	}
}