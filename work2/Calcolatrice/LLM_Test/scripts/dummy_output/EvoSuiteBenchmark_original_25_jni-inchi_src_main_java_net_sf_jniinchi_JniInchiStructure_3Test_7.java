// JniInchiStructure_3Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains one unit test case for the {@link JniInchiStructure#getAtom(int)} method.
*/
class JniInchiStructure_3Test {
		
    private final JniInchiStructure instance;
    private JniInchiStructure_3Test(JniInchiStructure instance) {
        this.instance = instance;
    }

    @Test
    public void testGetAtomAtom() {
        assertNotNull("getAtom() must not return null", instance.getAtom());
    }

    @Test
    public void testGetAtomNChars() {
        assertNotNull("getAtomNChars() must not return null", instance.getAtomNChars());
    }

    @Test
    public void testGetAtomBits() {
        assertNotNull("getAtomBits() must not return null", instance.getAtomBits());
    }

    @Test
    public void testGetAtomBounds() {
        assertNotNull("getAtomBounds() must not return null", instance.getAtomBounds());
    }

    @Test
    public void testGetAtomAtomSize() {
        assertEquals("getAtomAtomSize() changed to non-existant atom",
                     0, instance.getAtomAtomSize((long) (long) -1));
    }

    @Test
    public void testGetAtomAtomDataSize() {
        assertEquals("getAtomAtomDataSize() changed to non-existant atom",
                     0, instance.getAtomAtomDataSize((long) -1));
    }

    @Test
    public void testGetAtomStringSize() {
        assertEquals("getAtomStringSize() changed to non-existant atom",
                     0, instance.getAtomStringSize((long) -1));
    }

    @Test
    public void testGetAtomCompressedSize() {
        assertEquals("getAtomCompressedSize() changed to non-existant atom",
                     0, instance.getAtomCompressedSize((long) -1));
    }

    @Test
    public void testGetAtomDataSizeWithBitLength() {
        long a = 0, b = 1;

        // Test that data is still at least this short.
        // Since this is just a test, we won't be writing too much data.
        a = instance.getAtomDataSizeWithLength(b);
        long s = instance.getAtomDataSizeWithLength(b--);
        if (a == -1) {
            assertTrue("got wrong value after short", s!= (long)-1);
        } else {
            assertEquals("got wrong value after short", s, a);
        }

        // We didn't need this long, so make sure we can get back an invalid atom
        assertNull("getAtomDataSizeWithLength() returned invalid atom",
                   instance.getAtomDataSizeWithLength(b--));

        // Test that data is still at least this short.
        // Since this is just a test, we won't be writing too much data.
        a = instance.getAtomDataSizeWithLength(b);
        b = (b << 1) | (b >>> (b % 4)); // (b mod 4)%4==0
        a = instance.getAtomDataSizeWithLength(b--);
        if (a == -1) {
            assertTrue("got wrong value after short", s!= (long)-1);
        } else {
            assertEquals("got wrong value after short", s, a);
        }

        // Now this will be the next test
        // Test that data is more than the previous test short.
        b = (b << 1) | (b >>> (b % 4)); // (b mod 4)%4==0
        a = instance.getAtomDataSizeWithLength(b--);
        if (a!= 1) {
            assertTrue("got wrong value after short", a == 1);
            assertTrue("expected data to equal length of 1",
                       (b == 1 || a == 0)? false : true);
        }
    }

    @Test
    public void testGetAtomStringLength() {
        int a = 0, b = 1;
}
}