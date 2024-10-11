// ArrayOfString_2Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfString}.
* It contains one unit test case for the {@link ArrayOfString#getTypeDesc()} method.
*/
class ArrayOfString_2Test {
		
	private ArrayOfString objectUnderTest;
	
	
	/**
	* Test of getTypeDesc method, of class ArrayOfString.
	*/
	@Test
    public void testGetTypeDesc() {
        // TODO Auto-generated method stub
        assertNotNull("The test fails!!!",objectUnderTest.getTypeDesc());
    }

	/**
	* Test of clone method, of class ArrayOfString.
	*/
	@Test
    public void testClone() throws java.lang.Throwable {
        objectUnderTest = new ArrayOfString();
		ArrayOfString _clone = null;
        try {
            _clone = (ArrayOfString) objectUnderTest.clone();
        }
        catch (java.lang.CloneNotSupportedException e) {
            e.printStackTrace();
        }
        assertNotNull(
            "Clone of ArrayOfString must not throws exception, since it is not supposed to have thrown",
            _clone
                        );
    }

	/**
	* Test of isNull method, of class ArrayOfString.
	*/
	@Test
    public void testIsNull() throws java.lang.Throwable {
        // TODO Auto-generated method stub
        assertNotNull(
    "The test fails!!!",objectUnderTest.isNull());
    }

	/**
	* Test of getStringValue method, of class ArrayOfString.
	*/
	@Test
    public void testGetStringValue() throws java.lang.Throwable {
        // TODO Auto-generated method stub
        ArrayOfString _getString = new ArrayOfString();
        _getString.setString(java.lang.String.class.getName());
        assertNotNull(
            "The test fails!!!",_getString.getString() );
    }

	/**
	* Test of setString method, of class ArrayOfString.
	*/
	@Test
    public void testSetString() throws java.lang.Throwable {
        // TODO Auto-generated method stub
        Object objectUnderTest = new ArrayOfString();
        objectUnderTest.setString("test");
        ArrayOfString _getString = new ArrayOfString();
        ArrayOfString valueRetval = _getString.setString(value);
        assertNotNull(
            "The test fails!!!",valueRetval.getString() );
    }

	/**
	* Test of addString method, of class ArrayOfString.
	*/
	@Test
    public void testAddString() throws java.lang.Throwable {
        // TODO Auto-generated method stub
        ArrayOfString _getString = new ArrayOfString();
        _getString.setString(value);
        objectUnderTest.addString(_getString);
        ArrayOfString _getString2 = new ArrayOfString();
        _getString2.setString(value);
        objectUnderTest.addString(_getString2);
        ArrayOfString _getString3 = new ArrayOfString();
        _getString3.setString(value);
        objectUnderTest.addString(_getString3);
        ArrayOfString _getString4 = new ArrayOfString();
        _getString4.setString(value);
        objectUnderTest.addString(_getString4);
        ArrayOfString _getString5 = new ArrayOfString();
        _getString5.setString(value);
        objectUnderTest.addString(_getString5);
        ArrayOfString _getString6 = new ArrayOfString();
        _getString6.setString(value);
        objectUnderTest.addString(_getString6);
        ArrayOfString _getString7 = new ArrayOfString();
        _getString7.setString(value);
        objectUnderTest.addString(_getString7);
}
}