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
		
	@Test
	void testNewXisemele() {
		Xisemele xisemele = XisemeleFactory.newXisemele();
		assertNotNull(xisemele);
	}
}