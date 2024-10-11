// JniInchiWrapper_4Test.java
package net.sf.jniinchi;

import net.sf.jnati.NativeCodeException;
import net.sf.jnati.deploy.NativeLibraryLoader;
import java.util.List;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiWrapper}.
* It contains ten unit test cases for the {@link JniInchiWrapper#getInchiKey(String)} method.
*/
class JniInchiWrapper_4Test {
		java
    @Test
    void testGetInchiKey_NullInput() {
        assertThrows(IllegalArgumentException.class, () -> JniInchiWrapper.getInchiKey(null));
    }

    @Test
    void testGetInchiKey_ValidInput() {
        String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H";
        assertDoesNotThrow(() -> JniInchiWrapper.getInchiKey(inchi));
    }

    @Test
    void testGetInchiKey_EmptyInput() {
        String inchi = "";
        assertThrows(IllegalArgumentException.class, () -> JniInchiWrapper.getInchiKey(inchi));
    }

    @Test
    void testGetInchiKey_InvalidInchi() {
        String inchi = "InvalidInChI";
        assertThrows(JniInchiException.class, () -> JniInchiWrapper.getInchiKey(inchi));
    }

    @Test
    void testGetInchiKey_ValidInchiKey() {
        String inchiKey = "UHOVQNZJYSORNB-UHFFFAOYSA-N";
        assertDoesNotThrow(() -> JniInchiWrapper.getInchiKey(inchiKey));
    }

    @Test
    void testGetInchiKey_NullInchiKey() {
        String inchiKey = null;
        assertThrows(IllegalArgumentException.class, () -> JniInchiWrapper.getInchiKey(inchiKey));
    }

    @Test
    void testGetInchiKey_InvalidInchiKey() {
        String inchiKey = "InvalidInChIKey";
        assertThrows(JniInchiException.class, () -> JniInchiWrapper.getInchiKey(inchiKey));
    }

    @Test
    void testGetInchiKey_LongInchiKey() {
        String inchiKey = "UHOVQNZJYSORNB-UHFFFAOYSA-N-LongKey";
        assertDoesNotThrow(() -> JniInchiWrapper.getInchiKey(inchiKey));
    }

    @Test
    void testGetInchiKey_SpecialCharactersInKey() {
        String inchiKey = "UHOVQNZJYSORNB-UHFFFAOYSA-N@Special";
        assertDoesNotThrow(() -> JniInchiWrapper.getInchiKey(inchiKey));
    }
}