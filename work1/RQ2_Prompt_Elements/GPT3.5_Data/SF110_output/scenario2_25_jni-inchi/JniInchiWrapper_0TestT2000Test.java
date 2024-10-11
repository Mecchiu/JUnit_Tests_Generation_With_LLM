// JniInchiWrapper_0Test.java
package net.sf.jniinchi;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link JniInchiWrapper}.
 * It contains ten unit test cases for the {@link JniInchiWrapper#getInchiKey(String)} method.
 */
class JniInchiWrapper_0Test {

    @Test
    void testGetInchiKey_NullInchi() {
        assertThrows(IllegalArgumentException.class, () -> JniInchiWrapper.getInchiKey(null));
    }

    @Test
    void testGetInchiKey_EmptyInchi() {
        assertThrows(JniInchiException.class, () -> JniInchiWrapper.getInchiKey(""));
    }

    @Test
    void testGetInchiKey_InvalidInchi() {
        assertThrows(JniInchiException.class, () -> JniInchiWrapper.getInchiKey("invalid inchi"));
    }

    @Test
    void testGetInchiKey_ValidInchi() throws JniInchiException {
        String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H";
        JniInchiOutputKey key = JniInchiWrapper.getInchiKey(inchi);
        assertNotNull(key);
        assertEquals("UHOVQNZJYSORNB-UHFFFAOYSA-N", key.getKey());
    }

    @Test
    void testGetInchiKey_ValidInchiWithAuxInfo() throws JniInchiException {
        String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H";
        JniInchiOutput output = JniInchiWrapper.getInchiOutput(inchi);
        assertNotNull(output);
        assertNotNull(output.getAuxInfo());
        JniInchiOutputKey key = JniInchiWrapper.getInchiKey(output.getInchi());
        assertNotNull(key);
        assertEquals("UHOVQNZJYSORNB-UHFFFAOYSA-N", key.getKey());
    }

    @Test
    void testGetInchiKey_ValidInchiWithFixedH() throws JniInchiException {
        String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H";
        JniInchiOutput output = JniInchiWrapper.getInchiOutput(inchi);
        assertNotNull(output);
        assertTrue(output.hasFixedH());
        JniInchiOutputKey key = JniInchiWrapper.getInchiKey(output.getInchi());
        assertNotNull(key);
        assertEquals("UHOVQNZJYSORNB-UHFFFAOYSA-N", key.getKey());
    }

    @Test
    void testGetInchiKey_ValidInchiWithReconnected() throws JniInchiException {
        String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H";
        JniInchiOutput output = JniInchiWrapper.getInchiOutput(inchi);
        assertNotNull(output);
        assertTrue(output.hasReconnected());
        JniInchiOutputKey key = JniInchiWrapper.getInchiKey(output.getInchi());
        assertNotNull(key);
        assertEquals("UHOVQNZJYSORNB-UHFFFAOYSA-N", key.getKey());
    }

    @Test
    void testGetInchiKey_ValidInchiWithWarnings() throws JniInchiException {
        String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H";
        JniInchiOutput output = JniInchiWrapper.getInchiOutput(inchi);
        assertNotNull(output);
        assertTrue(output.hasWarning());
        JniInchiOutputKey key = JniInchiWrapper.getInchiKey(output.getInchi());
        assertNotNull(key);
        assertEquals("UHOVQNZJYSORNB-UHFFFAOYSA-N", key.getKey());
    }

    @Test
    void testGetInchiKey_ValidInchiWithFixedHAndReconnected() throws JniInchiException {
        String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H";
        JniInchiOutput output = JniInchiWrapper.getInchiOutput(inchi);
        assertNotNull(output);
        assertTrue(output.hasFixedH());
        assertTrue(output.hasReconnected());
        JniInchiOutputKey key = JniInchiWrapper.getInchiKey(output.getInchi());
        assertNotNull(key);
        assertEquals("UHOVQNZJYSORNB-UHFFFAOYSA-N", key.getKey());
    }

    @Test
    void testGetInchiKey_ValidInchiWithFixedHAndWarnings() throws JniInchiException {
        String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H";
        JniInchiOutput output = JniInchiWrapper.getInchiOutput(inchi);
        assertNotNull(output);
        assertTrue(output.hasFixedH());
        assertTrue(output.hasWarning());
        JniInchiOutputKey key = JniInchiWrapper.getInchiKey(output.getInchi());
        assertNotNull(key);
        assertEquals("UHOVQNZJYSORNB-UHFFFAOYSA-N", key.getKey());
    }

    @Test
    void testGetInchiKey_ValidInchiWithReconnectedAndWarnings() throws JniInchiException {
        String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H";
        JniInchiOutput output = JniInchiWrapper.getInchiOutput(inchi);
        assertNotNull(output);
        assertTrue(output.hasReconnected());
        assertTrue(output.hasWarning());
        JniInchiOutputKey key = JniInchiWrapper.getInchiKey(output.getInchi());
        assertNotNull(key);
        assertEquals("UHOVQNZJYSORNB-UHFFFAOYSA-N", key.getKey());
    }

}