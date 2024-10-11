// Here's an example implementation of the Element class and a test class for the numberOfNamespaceMappings() method:

// Element.java
package nu.staldal.xtree;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;

/**
 * An XML Element.
 */
public class Element extends NodeWithChildren {

    private Map<String, String> namespaceMappings;

    public Element(String name) {
        super(name);
        namespaceMappings = new HashMap<>();
    }

    /**
     * Return the number of namespace mappings for this element.
     */
    public int numberOfNamespaceMappings() {
        return namespaceMappings.size();
    }

    /**
     * Add a namespace mapping to this element.
     */
    public void addNamespaceMapping(String prefix, String uri) {
        namespaceMappings.put(prefix, uri);
    }

    /**
     * Get the namespace URI for a given prefix in this element.
     */
    public String getNamespaceURI(String prefix) {
        return namespaceMappings.get(prefix);
    }
}

// Element_6Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Element}.
 * It contains ten unit test cases for the {@link Element#numberOfNamespaceMappings()} method.
 */
class Element_6Test {

    @Test
    void testNoNamespaceMappings() {
        Element element = new Element("test");
        assertEquals(0, element.numberOfNamespaceMappings());
    }

    @Test
    void testOneNamespaceMapping() {
        Element element = new Element("test");
        element.addNamespaceMapping("ns", "http://example.com/ns");
        assertEquals(1, element.numberOfNamespaceMappings());
    }

    @Test
    void testMultipleNamespaceMappings() {
        Element element = new Element("test");
        element.addNamespaceMapping("ns1", "http://example.com/ns1");
        element.addNamespaceMapping("ns2", "http://example.com/ns2");
        element.addNamespaceMapping("ns3", "http://example.com/ns3");
        assertEquals(3, element.numberOfNamespaceMappings());
    }

    @Test
    void testDuplicateNamespaceMappings() {
        Element element = new Element("test");
        element.addNamespaceMapping("ns", "http://example.com/ns1");
        element.addNamespaceMapping("ns", "http://example.com/ns2");
        assertEquals(1, element.numberOfNamespaceMappings());
    }

    @Test
    void testGetNamespaceURI() {
        Element element = new Element("test");
        element.addNamespaceMapping("ns", "http://example.com/ns");
        assertEquals("http://example.com/ns", element.getNamespaceURI("ns"));
    }

    @Test
    void testGetNamespaceURINull() {
        Element element = new Element("test");
        assertNull(element.getNamespaceURI("ns"));
    }

    @Test
    void testGetNamespaceURINotFound() {
        Element element = new Element("test");
        element.addNamespaceMapping("ns", "http://example.com/ns");
        assertNull(element.getNamespaceURI("foo"));
    }

    @Test
    void testGetNamespaceURIMultipleMappings() {
        Element element = new Element("test");
        element.addNamespaceMapping("ns1", "http://example.com/ns1");
        element.addNamespaceMapping("ns2", "http://example.com/ns2");
        assertEquals("http://example.com/ns1", element.getNamespaceURI("ns1"));
    }

    @Test
    void testGetNamespaceURIDuplicateMappings() {
        Element element = new Element("test");
        element.addNamespaceMapping("ns", "http://example.com/ns1");
        element.addNamespaceMapping("ns", "http://example.com/ns2");
        assertEquals("http://example.com/ns1", element.getNamespaceURI("ns"));
    }
}