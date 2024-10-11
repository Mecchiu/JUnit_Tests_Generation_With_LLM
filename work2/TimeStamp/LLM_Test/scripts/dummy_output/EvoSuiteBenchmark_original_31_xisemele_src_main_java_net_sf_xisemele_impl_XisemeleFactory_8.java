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
     * Test method for
     * {@link net.sf.xisemele.impl.XisemeleFactory#newXisemele()}.
     */
    @Test
    public void testNewXisemele() {
        final Xisemele xisemele = XisemeleFactory.newXisemele();
	assertNotNull(xisemele);
    }
}