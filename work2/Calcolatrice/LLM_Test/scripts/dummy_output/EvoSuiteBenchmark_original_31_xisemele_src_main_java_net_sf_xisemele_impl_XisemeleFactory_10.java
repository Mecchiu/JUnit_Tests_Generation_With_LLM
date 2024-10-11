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
	 * Test of newXisemele method, of class XisemeleFactory.
	 */
	@Test
	void testNewXisemele() {
		assertTrue(instance == null);
		instance = newXisemele();
	}
		
	/**
	 * Test of getElemClass method, of class XisemeleFactory.
	 */

	@Test
	void testGetElemClass() {
		assertEquals(Xisemele.class, instance.getElemClass());
		assertEquals(Xisemele.class.equals(instance.getElemClass()), true);
	}

}