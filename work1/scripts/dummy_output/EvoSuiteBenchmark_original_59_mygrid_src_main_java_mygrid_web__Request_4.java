// _RequestTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Request}.
* It contains one unit test case for the {@link _Request#getTypeDesc()} method.
*/
class _RequestTest {
		
    private java.lang.Object getTestObj;
    
    /**
     * Test constructor.
     */
    public _RequestTest() {
        
    }

	/**
	* Test method for
	* {@link mygrid.web.Request#getTypeDesc(javax.xml.namespace.QName)}
	*.
	*/
	@Test
    public void testGetTypeDesc() {
		
		java.lang.Object clazz;

	        clazz = _Request.class;

	        assertEquals("Wrong class returned", "mygrid.web.Request_QNAME", clazz);
    }

	/**
	* Test method for 
	* {@link java.lang.Object#toString()}
	*.
	*/
	@Test
    public void testToString() {
				
		java.lang.Object clazz;

	        // Creating test objet with a default (null) constructor.
	        testObj = null;
	        clazz = org.jivesoftware.smack.Thing().setAttribute(org.jivesoftware.smack.Namespace.NAMESPACE_SEARCH, "jabber.org");
	        testObj = clazz;
	        System.out.println(testObj);
	        assertTrue("Test class cannot be instantiated (because the default constructor was called)", 
	        		(testObj.getClass().isInstance(testObj)));
                    
	        // Creating test objet with a non null value.
	        testObj = new TestCase();
	        clazz = org.jivesoftware.smack.Thing().setAttribute(org.jivesoftware.smack.Namespace.NAMESPACE_SEARCH, "jabber.org");
	        clazz = org.jivesoftware.smack.Thing().setAttribute(org.jivesoftware.smack.Namespace.NAMESPACE_SEARCH, "mycloud");
	        testObj = clazz;
	        System.out.println(testObj);
	        assertTrue("Test class cannot be instantiated (because the non null value was used)", 
	        		(testObj.getClass().isInstance(testObj)));
	        
	    }


}