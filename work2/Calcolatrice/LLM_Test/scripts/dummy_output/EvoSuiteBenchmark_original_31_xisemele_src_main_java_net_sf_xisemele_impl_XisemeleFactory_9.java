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
// * Test of constructor initializing with an already existing object.
//   */
    @Test
    public void testConstructorNonExisting() {
        //System.out.println("constructor");

        //System.out.println("Test 3");
        assertThrows(IllegalStateException.class, () -> { XisemeleFactory.newXisemele(); });
    }
}

    // XisemeleFactoryTest.java