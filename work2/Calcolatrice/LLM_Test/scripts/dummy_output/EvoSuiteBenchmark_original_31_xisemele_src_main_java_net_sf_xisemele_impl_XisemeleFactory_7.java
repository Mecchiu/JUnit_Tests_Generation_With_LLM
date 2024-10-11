// XisemeleFactoryTest.java
package net.sf.xisemele.impl;

import net.sf.xisemele.api.Xisemele;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XisemeleFactory}.
* It contains one unit test case for the {@link XisemeleFactory#newXisemele()} method.
*/
class XisemeleFactoryTest {
		
	/**
	 * Test of constructor {@link XisemeleFactory#XisemeleFactory(String...)} and method {@link XisemeleFactory#newXisemele()}.
	 */
	@Test
	public void testConstructionXisemele() {
		XisemeleFactory factory = new XisemeleFactory( new String[] {"default"});
		assertNotNull("factory", factory);
	}

    /**
	 * Test of newXisemele method.
	 */
	@Test
    public void testNewXisemele() {
        System.out.println("testNewXisemele");
        String[] args = {"default"};
        Xisemele factory = newXisemele(args);
        assertNotNull("factory", factory);
    }
}