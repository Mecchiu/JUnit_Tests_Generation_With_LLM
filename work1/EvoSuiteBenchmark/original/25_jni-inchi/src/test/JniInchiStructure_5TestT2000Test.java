```java
package net.sf.jniinchi;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JniInchiStructure_5Test {

    @Test
    void testGetStereo0D_WhenIndexIsNegative_ThenThrowIndexOutOfBoundsException() {
        JniInchiStructure structure = new JniInchiStructure();
        assertThrows(IndexOutOfBoundsException.class, () -> structure.getStereo0D(-1));
    }

    @Test
    void testGetStereo0D_WhenIndexIsZero_ThenReturnFirstStereo0D() {
        JniInchiStructure structure = new JniInchiStructure();
        JniInchiStereo0D stereo0D = new JniInchiStereo0D();
        structure.addStereo0D(stereo0D);
        assertEquals(stereo0D, structure.getStereo0D(0));
    }

    @Test
    void testGetStereo0D_WhenIndexIsWithinBounds_ThenReturnCorrectStereo0D() {
        JniInchiStructure structure = new JniInchiStructure();
        JniInchiStereo0D stereo0D1 = new JniInchiStereo0D();
        JniInchiStereo0D stereo0D2 = new JniInchiStereo0D();
        structure.addStereo0D(stereo0D1);
        structure.addStereo0D(stereo0D2);
        assertEquals(stereo0D2, structure.getStereo0D(1));
    }

    @Test
    void testGetStereo0D_WhenIndexIsOutOfBounds_ThenThrowIndexOutOfBoundsException() {
        JniInchiStructure structure = new JniInchiStructure();
        assertThrows(IndexOutOfBoundsException.class, () -> structure.getStereo0D(1));
    }

    @Test
    void testGetStereo0D_WhenNoStereo0DAdded_ThenThrowIndexOutOfBoundsException() {
        JniInchiStructure structure = new JniInchiStructure();
        assertThrows(IndexOutOfBoundsException.class, () -> structure.getStereo0D(0));
    }

    @Test
    void testGetStereo0D_WhenMultipleStereo0DAdded_ThenReturnCorrectStereo0D() {
        JniInchiStructure structure = new JniInchiStructure();
        JniInchiStereo0D stereo0D1 = new JniInchiStereo0D();
        JniInchiStereo0D stereo0D2 = new JniInchiStereo0D();
        structure.addStereo0D(stereo0D1);
        structure.addStereo0D(stereo0D2);
        assertEquals(stereo0D1, structure.getStereo0D(0));
    }

    @Test
    void testGetStereo0D_WhenMultipleStereo0DAddedAndIndexIsLast_ThenReturnLastStereo0D() {
        JniInchiStructure structure = new JniInchiStructure();
        JniInchiStereo0D stereo0D1 = new JniInchiStereo0D();
        JniInchiStereo0D stereo0D2 = new JniInchiStereo0D();
        structure.addStereo0D(stereo0D1);
        structure.addStereo0D(stereo0D2);
        assertEquals(stereo0D2, structure.getStereo0D(1));
    }

    @Test
    void testGetStereo0D_WhenMultipleStereo0DAddedAndIndexIsNegative_ThenThrowIndexOutOfBoundsException() {
        JniInchiStructure structure = new JniInchiStructure();
        JniInchiStereo0D stereo0D1 = new JniInchiStereo0D();
        JniInchiStereo0D stereo0D2 = new JniInchiStereo0D();
        structure.addStereo0D(stereo0D1);
        structure.addStereo0D(stereo0D2);
        assertThrows(IndexOutOfBoundsException.class, () -> structure.getStereo0D(-1));
    }

    @Test
    void testGetStereo0D_WhenMultipleStereo0DAddedAndIndexIsOutOfBounds_ThenThrowIndexOutOfBoundsException() {
        JniInchiStructure structure = new JniInchiStructure();
        JniInchiStereo0D stereo0D1 = new JniInchiStereo0D();
        JniInchiStereo0D stereo0D2 = new JniInchiStereo0D();
        structure.addStereo0D(stereo0D1);
        structure.addStereo0D(stereo0D2);
        assertThrows(IndexOutOfBoundsException.class, () -> structure.getStereo0D(2));
    }

}
```
```