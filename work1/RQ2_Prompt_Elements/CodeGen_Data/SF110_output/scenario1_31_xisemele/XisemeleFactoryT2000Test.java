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
         * Test method for {@link XisemeleFactory#newXisemele()}.
         * @throws InterruptedException an error was encountered waiting for a join.
         */
		@Test
		public void testNewXisemele() throws InterruptedException {
				Object[] parameters = new Object[]{ };
				Xisemele result = newXisemele();
				Object[] resultArray = new Object[]{ result };

				assertInvariants(parameters, resultArray);
		}
}

// XisemeleImplTest.java
