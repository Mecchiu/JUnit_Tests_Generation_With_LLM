// _Complete_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Complete}.
* It contains one unit test case for the {@link _Complete#getTypeDesc()} method.
*/
class _Complete_1Test {
		
;
    final static java.lang.String _COMPLETE = "COMPLETE";
    final static java.lang.String _JOB = "JOB";
	
	/**
     * Run the int getTypeDesc() method test.
     * 
     * @throws java.lang.Exception
     */
    @Test
    public void testGetTypeDesc() throws java.lang.Exception {
        final java.lang.String expected_return = "COMPLETE";
        final java.lang.String result = _Complete.getTypeDesc();
        assertEquals(expected_return, result);
    }
    /**
     * Run the java.lang.Class getJavaClass() method test.
     */
    @Test
    public void testGetJavaClass() {
        final java.lang.Class result = _Complete.java.Class.class;
        assertNotNull(result);
    }
    /**
     * Run the boolean equals(java.lang.Object) method test.
     * 
     * @throws java.lang.Exception
     */
    @Test
    public void testEqualsLjava_lang_Object() throws java.lang.Exception {
        final boolean result = _Complete.java.Class.equals(null);
        assertEquals(false, result);
        
        final java.lang.Class _xnulltype = Boolean.TYPE;
        final Boolean _xnull = new Boolean().valueOf(null);
        final java.lang.Class _nulltype = Boolean.class;
        assertEquals(false, _Complete.java.Class.equals(_xnulltype));
        assertEquals(false, _Complete.java.Class.equals(_nulltype));
    }
    /**
     * Run the java.lang.String toString() method test.
     */
    @Test
    public void testToStringLjava_lang_String() {
        final java.lang.String expected_return
            = "mygrid.web.Completion[type=\"COMPLETE\"]" +
                "\n mygrid.web.Completion[type=\"JOB\"]";
        final java.lang.String result = _Complete.java.String.toString();
        assertEquals(expected_return, result);
    }
    /**
     * Run the java.lang.String javaToString() method test.
     */
    @Test
    public void testJavaToStringLjava_lang_String() {
        final java.lang.String expected_return = "complete";
        final java.lang.String result = _Complete.java.String.javaToString();
        assertEquals(expected_return, result);
    }
    /**
     * Run the int parseFrom(java.lang.String) method test.
     */
    @Test
    public void testParseFromLjava_lang_String() throws java.lang.Exception {
        final int _expected_return = 0;
        // BEGIN main/src/java/mygrid/web/Completion-1.2.0-SNAPSHOT.jar
        final java.lang.String expected = "mygrid.web.Completion[type=\"COMPLETE\",job=\"JOB\"]";
        final int _x0 = _Complete.parseFrom("COMPLETE").intValue();
        assertEquals(expected, (int)_x0);
        {
        final java.lang.String expected_1 = "mygrid.web.Completion[type=\"JOB\",job=\"JOB\"]";
	java.lang.String _str_x = "JOB";
        {
	final int _expected_1_return = _str_x.length();
        java.lang.String _x0 = _Completed.parseFrom(_str_x).intValue();
        assertEquals(_expected_1_return, _x0.length());
        }
    }
}
}