// JWBF_0Test.java
package net.sourceforge.jwbf;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link JWBF}.
 * It contains ten unit test cases for the {@link JWBF#getVersion(Class)} method.
 */
class JWBF_0Test {

    @Test
    void testGetVersion() {
        String version = JWBF.getVersion(JWBF_0Test.class);
        assertEquals("1.0.0", version);
    }

    @Test
    void testGetVersionWithDifferentClass() {
        String version = JWBF.getVersion(JWBF.class);
        assertEquals("1.0.0", version);
    }

    @Test
    void testGetVersionWithNull() {
        String version = JWBF.getVersion(null);
        assertNull(version);
    }

    @Test
    void testGetVersionWithNonExistingClass() {
        String version = JWBF.getVersion(String.class);
        assertNull(version);
    }

    @Test
    void testGetVersionWithInnerClass() {
        String version = JWBF.getVersion(InnerClass.class);
        assertEquals("1.0.0", version);
    }

    @Test
    void testGetVersionWithAnonymousClass() {
        String version = new Object(){}.getClass().getEnclosingClass() == null ? null : JWBF.getVersion(new Object(){}.getClass().getEnclosingClass());
        assertNull(version);
    }

    @Test
    void testGetVersionWithInterface() {
        String version = JWBF.getVersion(Runnable.class);
        assertNull(version);
    }

    @Test
    void testGetVersionWithPrimitiveType() {
        String version = JWBF.getVersion(int.class);
        assertNull(version);
    }

    @Test
    void testGetVersionWithArray() {
        String version = JWBF.getVersion(new int[]{});
        assertNull(version);
    }

    @Test
    void testGetVersionWithEnum() {
        String version = JWBF.getVersion(TestEnum.class);
        assertNull(version);
    }

    private static class InnerClass {
    }

    private enum TestEnum {
    }
}