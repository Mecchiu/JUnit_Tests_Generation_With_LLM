// TextTest.java
package nu.staldal.xtree;

import org.xml.sax.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Text}.
* It contains one unit test case for the {@link Text#asCharArray()} method.
*/
class TextTest {
		
	// Test class constructor.
    /**
     * This unit test uses some non-null values as argument to the
                 constructor.
     */
    @Test
    public void testConstructorAsCharArray_Null() {
        new Text("") {};
    };
    
	// Test the constructor.
    /**
     * Initialize a new {@link Text} object, which represents a character
             content with content from the specified XML character sequence.
             <ul>
		 <li>char sequence is empty</li>
		 <li>
		   the length of char sequence represents an integer value</li>
		 <li>char sequence contains length 1, or
		   char sequence starts with an element</li>
	</ul>
     */
    @Test
    public void testConstructorWithCharSequence_Null() {
        new Text(null) {};
    };
    
	// Test the constructors.
    /**
     * Initialize a new {@link Text} object:<ul>
     * <li>char sequence is empty</li>
     * <li>
     *   the length of char sequence represents an integer value</li> 
     * <li>char sequence contains length 1, or
     *   char sequence starts with an element</li>
     * </ul>
     */
    @Test
    public void testConstructorWithCharSequence() {
        new Text("") {},
        new Text("a") { { setContent("A"); } } };
    
	// Test the setCharArray method of the {@link Text} object.
    /**
     * Test the char[].
     */
    @Test
    public void testCharArray_NotNull() {
        // An instance of the 'char[]' type will be created for each character
        // content.
        Character[] content = new String[30];
    		
        // The content will be empty.
        final Node node = new Text("");
        final Object contentElement = content[0];
        assertFalse("content element", contentElement instanceof CharSequence);
    		
        // It should have no content.
        assertTrue("content.length", content.length == 0);
        // Should not have an attribute.
        assertFalse("content.hasAttribute", content.hasAttribute("xmlns"));
        // Should have just one child node (the xmlns node, not a child yet).
        assertEquals("content.getChild(0).getNodeType", Node.ATTRIBUTE_NODE, content[0].getNodeType());
        // Should not have an attribute value.
        assertTrue("content.get(0).getNodeValue()", content[0].getNodeValue().equals("xmlns"));
        // The child should have a default value.
        assertEquals("content.getChild(0).getAttrDefaultValue(\"xmlns\")", null, content[0].getAttrDefaultValue("xmlns"));
        // Should have an attribute with an attribute value.
        assertArrayEquals("content.getNodeAttrValueArray(content.getChild(0))", 
                Content.DEFAULT_NODE_ATTRIBUTE_VALUE.toCharArray(), 
                new CharSequence[]{content[0], content[1], content[2]});
        // Should not have any child nodes, yet.
        assertEquals("content.getChild().getNodeType", Node.TEXT_NODE, content[1].getNodeType());
        // A text node has no text content or a node value.
        assertArrayEquals("text content", new String[0], content[1].getChildNodes());
        // The child should have a value.
        assertArrayEquals("content.getNodeValueArray()", Content.DEFAULT_NODE_VALUE.toCharArray(), content[1].getNodeValue());
        // The child should have an attribute.
        assertTrue("content.hasAttribute(content.getChild(0).getNodeName())", content.hasAttribute(content.getChild(0).getNodeName()));
        // The child should not have a child node.
        assertEquals("content.getChild(1).getNodeType", Node.EMPTY_NODE, content[2].getNodeType());
        assertEquals("content.getChild(1).getFirstChild().getNodeValue()", "<!ATTLIST A attr.val>", content[2].getChild("a").getNodeValue());
        assertNull("content.getChild(2).getFirstChild()", content[2].getChild(2));
		// The value should be empty.
        assertEquals("content.getChild(2).getFirstChild().getNodeValue()", "", content[2].getChild(content[2]).getNodeValue());
	};
}