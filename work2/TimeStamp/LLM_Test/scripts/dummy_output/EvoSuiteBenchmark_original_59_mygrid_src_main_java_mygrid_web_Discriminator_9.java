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
	 * Just to test if we can find the type of the test.
	 */
	@Test
	public void getTypeDesc() {
		assertNotNull(Discriminator.getInstance().getTypeDesc());
	}
}