// Element_0Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains one unit test case for the {@link Element#lookupAttribute(String, String)} method.
*/
class Element_0Test {
		
	/**
	 * Test lookupAttribute(String, String).
	 */
	public void testLookupAttribute() {
		// Add a attribute to the element.
		Node child = new Element( "testchild", new StringValue( "child", "Hello, this is an example of a Element" ) );

		// Lookup the index of an attribute to this element.
		int index = Element.lookupAttribute( "testchild", "type" );
		assertNotNull( "Lookup the index of an attribute to this element.", index );

		// Make sure the index of an attribute to this element is correct.
		assertEquals( "Lookup the index of an attribute to this element.", 2, index );

		// Check the value of the attribute to this node.
		String string = child.getAttributeValue( "testchild", "type" );
		Vector vector = Element.getAllNamespaceDefinitions();

		assertEquals( "Lookup the value of the attribute to this element.", new Vector( vector ), string );
	}

		
	/**
	* Test getAttributeNames().
	*/
	@Test
	public void testGetAttributeNames() {
		// Add a dummy attribute to the element.
		// Create an additional attribute which will return multiple results with the same namespace.
		Node child = new Element( "testchild", new StringValue( "child", "Hello, this is an example of a Element" ) ); ;
		child.addAttribute( new Attribute( "testchild", "v", "1" ) );
		child.addAttribute( new Attribute( "testchild", "v", "2" ) );
		child.addAttribute( new Attribute( "testchild", "v", "v" ) );

		// Check the names of the attributes.
		Vector list;
		assertEquals( "Create and return an additional attribute which will return multiple results with the same namespace.", new Vector( 2 ),  getAllAttributeNames( child ) );
		assertEquals( "Create an additional attribute which won't be returned by this method.", new Vector( 3 ), getAllAttributeNames( child, "v" ) );
		assertEquals( "Get the names of multiple attributes.", new Vector( 4 ), getAllAttributeNames( child ) );
		assertEquals( "Get a list of all attribute names.", new Vector( 4 ), getAllAttributeNames( child, "v" ) );

		// Test toString().
		list = getAllAttributeNames( child );
		assertEquals( "Get the names of a node.", new Vector( 4 ), list );

		// Create a child element.
		child = new Element( "testchild", new StringValue( "v1", "v1 value" ),  new StringValue( "a", "a value" ) );
		child.addAttribute( new Attribute( "testchild", "v", "1" ) );

		// Test toString().
		list = getAllAttributeNames( child );
		assertEquals( "Get a list of multiple attributes.", new Vector( 4 ), list );

		// Test toString().
		list = getAllAttributeNames( child );
		assertEquals( "Get the names of multiple attributes.", new Vector( 4 ), list );

	}

	/**
	 * Test appendChild().
	 */
	@Test
	public void testAppendChild() {
		// Test toString().
		String appender = "   ";
		StringValue s = new StringValue( "v", appender );
		Element child = new Element( "testchild", s,  new StringValue( "v", "v value" ) );
		StringBuilder stringBuilder = new StringBuilder( appender );
		appendChild( child, stringBuilder );
		
		// Assert that toString() doesn't return empty result.
		assertEquals( "AppendChild(): toString() returns empty.", child.toString(), stringBuilder.toString() );
	}


	/**
	 * Test getAttributeNames().
	 */
	@Test
	public void testGetAttributeNames() {
		// Test toString().
		String toString = "        ";
		StringBuilder stringBuilder = new StringBuilder( toString );
		testToString( new Vector( 0 ), stringBuilder, true );
		testToString( new Vector( 1 ), stringBuilder, true );
		testToString( new Vector( 2 ), stringBuilder, true );
		testToString( new Vector( 3 ), stringBuilder, true );
	}

	/**
	 * Test getAllAttributeNames().
	 */
	@Test
	public void testGetAllAttributeNames() {
		// Test toString().
		String appender = "      ";
		StringBuilder stringBuilder = new StringBuilder( appender );
		testToString( new Vector( 0 ), stringBuilder, false );
		testToString( new Vector( 1 ), stringBuilder, false );
		testToString( new Vector( 2 ), stringBuilder, false );
		testToString( new Vector( 3 ), stringBuilder, false );
	}
	
	public Iterable<?> getAllAttributeNames(final Element subNode) {
		Vector list;
		list = Element.getAllNamespaceDefinitions();
		return Element.getAllAttributeNames( subNode, list );

	}

	private void testToString( @SuppressWarnings("unused") final Vector namespaces,
			@SuppressWarnings("unused") final StringBuilder stringBuilder,
			final boolean toStringResult ) {
		// Check this.
		assertTrue( "The stringBuilder must be initialized as a non-null value.", stringBuilder!= null );

		// Get the list of all attribute names.
}
}