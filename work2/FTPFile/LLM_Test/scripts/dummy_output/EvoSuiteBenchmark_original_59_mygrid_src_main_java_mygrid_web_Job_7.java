// JobTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Job}.
* It contains one unit test case for the {@link Job#getTypeDesc()} method.
*/
class JobTest {
		//private static java.lang.String typeDesc = new
				//java.lang.String("Discriminator")
					
	@Test public void testGetTypeDesc() {
		mygrid.web.Discriminator d1 = new mygrid.web.Discriminator();
		assertNotNull(d1.getTypeDesc());
	}
}