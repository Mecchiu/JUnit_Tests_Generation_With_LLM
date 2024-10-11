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
		* Test method for {@link nu.staldal.xtree.Element#Element(java.lang.String, java.lang.String)}.
		*/
		@org.junit.jupiter.api.Test
		void testElement10() {
		}
}

class Element_1Test {
	/**
	* Test method for {@link nu.staldal.xtree.Element#Element(java.lang.String, java.lang.String, java.lang.boolean, java.lang.String, java.lang.String, java.util.Vector)}.
	*/
	@org.junit.jupiter.api.Test
	void testElement11() {
	}
}

class Element_2Test {
		/**
		* Test method for {@link nu.staldal.xtree.Element#Element(java.lang.String, java.lang.String, java.lang.boolean, java.lang.String, java.lang.String, java.util.Vector)}.
		*/
		@org.junit.jupiter.api.Test
		void testElement12() {
		}
} 

/**
 * Test {@link nu.staldal.xtree.Element#ELEMENT_0TESTSHAPEELEMENTS} and
 * {@link nu.staldal.xtree.Element#ELEMENT_1TESTSHAPEELEMENTS} and
 * {@link nu.staldal.xtree.Element#ELEMENT_2TESTSHAPEELEMENTS} methods.
 */ 
public class ELEMENT_TestsHape extends junit.framework.TestCase {
    /**
     * @see
     *   {@link junit.framework.TestCase#TEST_FOCUS_METHOD_HELPERS}
     */
    private void testFocusMethods( Element e ) throws Exception
    {
        System.out.println( e );
        System.out.println( "------------------------------------------------------------------------" );

        URL url = getClass().getClassLoader().getResource( "Element_Test.xml" );
        final String name = "Element_Test.xml";
        URL u = getClass().getClassLoader().getResource( name );
        XDocument doc = xmlDocumentFactory.createDocument( url, name );
        final Node n_Element_0 = doc.getElementsByTagName( "Element_0" ).item( 0 );
        final Node n_Element_1 = doc.getElementsByTagName( "Element_1" ).item( 0 );
        final Node n_Element_2 = doc.getElementsByTagName( "Element_2" ).item( 0 );

        final AttributesImpl attrNames = new AttributesImpl();
        @org.junit.jupiter.api.Assertions
        final Vector<String> expected = new Vector<>();
        expected.addElement( "id", String.class.getName() );
        expected.addElement( "name", String.class.getName() );
        expected.addElement( "shape" );
        expected.addElement( "type", String.class.getName() );
        expected.addElement( "coordinatesystem", Vector.class.getName() );
        expected.addElement( "feature-ids", Vector.class.getName() );

        final AttributesImpl attrAttributes = new AttributesImpl();
        @org.junit.jupiter.api.Assertions
        final Vector<String> actual = new Vector<>( doc.getElementsByTagName( "ELEMENT_0TESTSHAPEELEMENTS" ) );

        // check elements
        assertTrue( n_Element_0.hasAttribute( "id" ) );
        assertTrue( n_Element_0.hasAttribute( "name" ) );
        assertTrue( expected.size() > 0 );
        assertTrue( expected.contains( n_Element_0.getAttribute( "name" ) ) );
        assertFalse( expected.contains( doc.getElementsByTagName( "ELEMENT_1TESTSHAPEELEMENTS" ).item( 0 ).getNodeName() ) );
        assertFalse( expected.contains( doc.getElementsByTagName( "ELEMENT_2TESTSHAPEELEMENTS" ).item( 0 ).getNodeName() ) );

        // check attributes
        final NodeList attrNodes = doc.getElementsByTagName( "ELEMENT_0TESTSHAPEELEMENTS" );

        for ( int i=0; i<attrNodes.getLength(); i++ )
        {
            assertFalse( attrNames.getLength() > 0 );
            assertEquals( attrNames.getIndex( n_Element_0.getNodeName() ), attrNodes.item( i ).getNodeName() );
            final String value = expected.getShortString( attrNodes.item( i ).getNodeName().substring( n_Element_0.getNodeName().length() ) );
            final Node attrValue = doc.item( attrNodes.item( i ).getNodeName() );
            if ( "coordinatesystem".equals( attrNodes.item( i ).getNodeName() ) )
            {
                assertEquals( expected.getShortString( attrNodes.item( i ).getNodeName().substring( n_Element_0.getNodeName().length() ) ), value );
            }
            else if ( "shape".equals( attrNodes.item( i ).getNodeName() ) )
            {
                assertEquals( expected.getShortString( attrNodes.item( i ).getNodeName().substring( n_Element_0.getNodeName().length() ) )
               , attrValue.getAttributeValue( "value" ) );
            }
            else
            {
                if ( attrNodes.item( i ).getNodeName().substring( n_Element_0.getNodeName().length() )
                   .equals ( attrNodes.item( i ).getLocalName() ) )
                {
                    assertEquals( value, attrValue.getValue() );
                }
            }
        }
        assertTrue( n_Element_2.hasAttribute( "id" ) );
        assertTrue( n_Element_2.hasAttribute( "feature-ids" ) );
    }

    /**
	* Test method for {@link nu.staldal.xtree.Element#lookupAttribute(java.lang.String, java.lang.String)}.
	*/
	@org.junit.jupiter.api.Test
	public void testLookupAttribute() throws Exception
	{
		Vector expected = new Vector();
		expected.addElement( "id", String.class.getName() );
		expected.addElement( "name", String.class.getName() );
		expected.addElement( "shape" );
		expected.addElement( "type" );

		Element_0Test.testFocusMethods( this );

		assertEquals( "", expected.firstElement().getAttributeValue( "id" ) );
		assertEquals( "", expected.firstElement().getAttributeValue( "name" ) );
}
}