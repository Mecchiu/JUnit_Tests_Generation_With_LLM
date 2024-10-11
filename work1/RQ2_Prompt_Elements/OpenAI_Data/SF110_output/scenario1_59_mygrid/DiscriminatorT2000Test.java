// DiscriminatorTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Discriminator}.
* It contains ten unit test cases for the {@link Discriminator#getTypeDesc()} method.
*/
class DiscriminatorTest {

	/**
	* Test case for {@link Discriminator#getTypeDesc()} method.
	* Test case for the {@link Discriminator#getTypeDesc()} method.
	* It checks if the method returns a non-null value.
	*/
	@Test
	void testGetTypeDesc() {
		assertNotNull(Discriminator.getTypeDesc());
	}
}