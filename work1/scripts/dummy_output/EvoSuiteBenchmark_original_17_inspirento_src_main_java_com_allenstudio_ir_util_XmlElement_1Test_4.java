// XmlElement_1Test.java
package com.allenstudio.ir.util;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XmlElement}.
* It contains one unit test case for the {@link XmlElement#getElement(String)} method.
*/
class XmlElement_1Test {
		
    /**
     * This test will demonstrate how to set and get the path of the element.
     */
    @Test
    public void testGetElement( ) {
        XmlElement el = new XmlElement( "test-path" );

        try {
            String path = "test-path";
            String result = el.getElement( path ).toString();
            assertNotNull( result );
            assertTrue( "result=" + path + ", expected=test-path", path.equals( result ) );
        } catch( Exception e ) {
            e.printStackTrace( );
        }
        
	
}

}