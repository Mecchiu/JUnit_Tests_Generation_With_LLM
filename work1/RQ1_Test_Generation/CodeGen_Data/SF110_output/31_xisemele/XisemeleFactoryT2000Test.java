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
		 * Verify that factory class can instantiate any factory class.
		 *
		 * @throws Exception
		 *	to be thrown by a <i>unit test</i>.
		*/
		@Test
		public void test() {
			new XisemeleFactory();
			assertNotNull(XisemeleFactory.newXisemele());
		}
}