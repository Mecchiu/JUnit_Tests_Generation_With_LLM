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
		
    static class TestXisemele {
        
		@Test
        public void newXisemele() {
            assertNotNull(newXisemele());
        }
        
    }
    
}

// Xisemele-test.java