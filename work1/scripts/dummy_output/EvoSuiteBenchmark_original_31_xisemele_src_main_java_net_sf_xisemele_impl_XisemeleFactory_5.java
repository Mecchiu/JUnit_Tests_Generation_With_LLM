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
		 * Test of constructor for {@link XisemeleFactory}.
		 */
		@Test
		void constructor() {
				assertNotNull(new XisemeleFactory());
				assertNotNull(new XisemeleFactory(0));
				assertNotNull(new XisemeleFactory(new int()));
				assertNull(new XisemeleFactory(null));
				assertNull(new XisemeleFactory(Integer.MAX_VALUE));
				assertEquals(0, new XisemeleFactory(0,new Integer(0)));
		}

}