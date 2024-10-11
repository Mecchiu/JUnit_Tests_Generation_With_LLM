// DiscriminatorTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Discriminator}.
* It contains one unit test case for the {@link Discriminator#getTypeDesc()} method.
*/
class DiscriminatorTest {

	/**
	 * Test method for {@link Discriminator#getTypeDesc()}.
	*/
         @Test
         public void testGetTypeDesc(){
            assertEquals("DiscriminatorTest", this.getClass().getName());
         }
}
