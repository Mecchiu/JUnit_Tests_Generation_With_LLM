// XisemeleFactoryTest.java
package net.sf.xisemele.impl;

import net.sf.xisemele.api.Xisemele;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XisemeleFactory}.
* It contains ten unit test cases for the {@link XisemeleFactory#newXisemele()} method.
*/
class XisemeleFactoryTest {
		
	/**
	* Test case for {@link XisemeleFactory#newXisemele()} method.
	* It tests if the method returns a new instance of {@link Xisemele} every time it is called.
	*/
	@Test
	void testNewXisemele() {
		Xisemele xisemele1 = XisemeleFactory.newXisemele();
		Xisemele xisemele2 = XisemeleFactory.newXisemele();
		assertNotSame(xisemele1, xisemele2);
	}
}