Here's an example implementation of the `DiscriminatorTest` class with ten unit test cases for the `getTypeDesc()` method:

```
package mygrid.web;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Discriminator}.
 * It contains ten unit test cases for the {@link Discriminator#getTypeDesc()} method.
 */
class DiscriminatorTest {

    @Test
    void getTypeDesc_returnsNonNullTypeDesc() {
        assertNotNull(Discriminator.getTypeDesc());
    }

    @Test
    void getTypeDesc_returnsTypeDescWithCorrectXmlType() {
        assertEquals("ns:Discriminator", Discriminator.getTypeDesc().getXmlType().getLocalPart());
    }

    @Test
    void getTypeDesc_returnsTypeDescWithCorrectXmlNamespace() {
        assertEquals("http://mygrid.org.uk/", Discriminator.getTypeDesc().getXmlType().getNamespaceURI());
    }

    @Test
    void getTypeDesc_returnsTypeDescWithCorrectElementQName() {
        assertEquals("ns:discriminator", Discriminator.getTypeDesc().getElementQName().getLocalPart());
    }

    @Test
    void getTypeDesc_returnsTypeDescWithCorrectElementNamespace() {
        assertEquals("http://mygrid.org.uk/", Discriminator.getTypeDesc().getElementQName().getNamespaceURI());
    }

    @Test
    void getTypeDesc_returnsTypeDescWithCorrectXmlTypeNamespace() {
        assertEquals("http://www.w3.org/2001/XMLSchema", Discriminator.getTypeDesc().getXmlType().getNamespaceURI());
    }

    @Test
    void getTypeDesc_returnsTypeDescWithCorrectXmlTypePrefix() {
        assertEquals("xsd", Discriminator.getTypeDesc().getXmlType().getPrefix());
    }

    @Test
    void getTypeDesc_returnsTypeDescWithCorrectElementName() {
        assertEquals("discriminator", Discriminator.getTypeDesc().getElementName());
    }

    @Test
    void getTypeDesc_returnsTypeDescWithCorrectXmlTypeClass() {
        assertEquals(org.apache.axis.description.TypeDesc.class, Discriminator.getTypeDesc().getClass());
    }

    @Test
    void getTypeDesc_returnsTypeDescWithCorrectType() {
        assertEquals(Discriminator.class, Discriminator.getTypeDesc().getTypeClass());
    }
}
```