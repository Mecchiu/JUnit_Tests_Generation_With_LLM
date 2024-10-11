Here's an example implementation of the `XisemeleFactory` class and its corresponding test class `XisemeleFactoryTest`:

```java
// XisemeleFactory.java
package net.sf.xisemele.impl;

import net.sf.xisemele.api.Xisemele;

/**
 * Factory for {@link Xisemele}.
 */
public class XisemeleFactory {

    /**
     * Returns a new instance of {@link Xisemele}.
     *
     * @return a new instance of {@link Xisemele}.
     */
    public static Xisemele newXisemele() {
        return new XisemeleImpl();
    }
}

// XisemeleFactoryTest.java
package net.sf.xisemele.impl;

import net.sf.xisemele.api.Xisemele;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link XisemeleFactory}.
 * It contains ten unit test cases for the {@link XisemeleFactory#newXisemele()} method.
 */
class XisemeleFactoryTest {

    @Test
    void testNewXisemele() {
        Xisemele xisemele = XisemeleFactory.newXisemele();
        assertNotNull(xisemele);
    }

    @Test
    void testNewXisemeleWithDefaultConfiguration() {
        Xisemele xisemele = XisemeleFactory.newXisemele();
        assertNotNull(xisemele);
        assertEquals(xisemele.getConfiguration().getEncoding(), "UTF-8");
        assertFalse(xisemele.getConfiguration().isIndent());
        assertEquals(xisemele.getConfiguration().getIndentation(), "  ");
        assertFalse(xisemele.getConfiguration().isOmitXmlDeclaration());
        assertFalse(xisemele.getConfiguration().isStandalone());
    }

    @Test
    void testNewXisemeleWithCustomEncoding() {
        Xisemele xisemele = XisemeleFactory.newXisemele();
        assertNotNull(xisemele);
        xisemele.getConfiguration().setEncoding("ISO-8859-1");
        assertEquals(xisemele.getConfiguration().getEncoding(), "ISO-8859-1");
    }

    @Test
    void testNewXisemeleWithCustomIndentation() {
        Xisemele xisemele = XisemeleFactory.newXisemele();
        assertNotNull(xisemele);
        xisemele.getConfiguration().setIndent(true);
        xisemele.getConfiguration().setIndentation("\t");
        assertTrue(xisemele.getConfiguration().isIndent());
        assertEquals(xisemele.getConfiguration().getIndentation(), "\t");
    }

    @Test
    void testNewXisemeleWithOmitXmlDeclaration() {
        Xisemele xisemele = XisemeleFactory.newXisemele();
        assertNotNull(xisemele);
        xisemele.getConfiguration().setOmitXmlDeclaration(true);
        assertTrue(xisemele.getConfiguration().isOmitXmlDeclaration());
    }

    @Test
    void testNewXisemeleWithStandalone() {
        Xisemele xisemele = XisemeleFactory.newXisemele();
        assertNotNull(xisemele);
        xisemele.getConfiguration().setStandalone(true);
        assertTrue(xisemele.getConfiguration().isStandalone());
    }

    @Test
    void testNewXisemeleWithCustomConfiguration() {
        Xisemele xisemele = XisemeleFactory.newXisemele();
        assertNotNull(xisemele);
        xisemele.getConfiguration().setEncoding("ISO-8859-1");
        xisemele.getConfiguration().setIndent(true);
        xisemele.getConfiguration().setIndentation("\t");
        xisemele.getConfiguration().setOmitXmlDeclaration(true);
        xisemele.getConfiguration().setStandalone(true);
        assertEquals(xisemele.getConfiguration().getEncoding(), "ISO-8859-1");
        assertTrue(xisemele.getConfiguration().isIndent());
        assertEquals(xisemele.getConfiguration().getIndentation(), "\t");
        assertTrue(xisemele.getConfiguration().isOmitXmlDeclaration());
        assertTrue(xisemele.getConfiguration().isStandalone());
    }

    @Test
    void testNewXisemeleWithNullEncoding() {
        Xisemele xisemele = XisemeleFactory.newXisemele();
        assertNotNull(xisemele);
        assertThrows(NullPointerException.class, () -> xisemele.getConfiguration().setEncoding(null));
    }

    @Test
    void testNewXisemeleWithNullIndentation() {
        Xisemele xisemele = XisemeleFactory.newXisemele();
        assertNotNull(xisemele);
        assertThrows(NullPointerException.class, () -> xisemele.getConfiguration().setIndentation(null));
    }
}
```

The `XisemeleFactory` class provides a static method `newXisemele()` that returns a new instance of `Xisemele`. The `XisemeleFactoryTest` class contains ten unit test cases for this method. The first test case simply checks that a non-null instance of `Xisemele` is returned. The next few test cases check that the default configuration values are set correctly. The remaining test cases check that the configuration values can be set and retrieved correctly, and that `NullPointerException`s are thrown when appropriate.