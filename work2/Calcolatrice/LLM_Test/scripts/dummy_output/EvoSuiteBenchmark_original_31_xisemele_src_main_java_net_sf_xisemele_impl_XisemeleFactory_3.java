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
		
    @Test
    public void shouldReturnInstanceWithValidName() {
        assertNotNull("Xisemele factory should return an instance of Xisemele with valid name", newXisemele());
    }

    @Test
    public void shouldReturnInstanceWithInvalidName() {
        assertNull("Xisemele factory should return null.", newXisemele("non-existing-factory"));
    }
    
    @Test
    public void shouldBeEqualWhenIdentical() {
        assertTrue(newXisemel("ID").equals(newXisemel("ID")));
    }
    
    @Test
    public void shouldBeNotEqualWhenDifferent() {
        assertFalse(newXisemel("YOS").equals(newXisemel("XIS")));
    }
}