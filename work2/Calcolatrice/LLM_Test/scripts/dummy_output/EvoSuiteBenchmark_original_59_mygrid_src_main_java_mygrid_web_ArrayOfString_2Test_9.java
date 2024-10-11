// ArrayOfString_2Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfString}.
* It contains one unit test case for the {@link ArrayOfString#getTypeDesc()} method.
*/
class ArrayOfString_2Test {
		
	@Test
	public void testGetTypeDesc() {
		testGetTypeDescInternal();
	}
	@Test
	public void testGetType() {
		testGetTypeInternal();
	}
	@Test
	public void testGet() {
		testGetInternal();
	}
	@Test
	public void testSet() {
		testSetInternal();
	}

    /**
     * testSetSerialized is internal and has a dependency on the type of object
     * that was passed when the class was created.
     */
    void testSetSerialized() {
        ArrayOfString obj2 = new ArrayOfString();
        byte[] byteArray = new byte[100];
        float float2 = 32 * 32;
        int int2 = 200;
        int int1 = 100;
        byte byteArray2[] = new byte[500];
        int intArray2[] = new int[500];
        int intArray3[] = new int[500];
    }
	@Test
	public void testSetSerializedWithObject() {
		ArrayOfString obj2 = new ArrayOfString();
		obj2.setString(string);
		byte[] byteArray = obj2.toByteArray();
		ArrayOfString obj3 = null;
		try {
			byteArray2 = obj2.toByteArray();
		} catch (Exception e) {
			e.printStackTrace();
			fail("Failed.");
		}
	}
	@Test
	public void testSetSerializedWithString() {
		ArrayOfString obj2 = new ArrayOfString();
		String string2 = "string";
		obj2.setString(string2);
		byte[] byteArray = obj2.toByteArray();
		ArrayOfString obj3 = null;
		try {
			byteArray2 = obj2.toByteArray();
		} catch (Exception e) {
			e.printStackTrace();
			fail("Failed.");
		}
	}

	


	
	/**
     * testSetInternal is not used and should have a dependency on the type of object
     * that was passed when the class was created.
	 */
    void testSetInternal() {
        ArrayOfString obj2 = new ArrayOfString();
        obj2.setString(string);
        byte[] byteArray = obj2.toByteArray();
        ArrayOfString obj3 = obj2;
        byte[] byteArray2[] = obj2.toByteArray();
    }

    /**
     * testGetInternal is not used and should have a dependency on the type of object
     * that was passed when the class was created.
     */
    void testGetInternal() {
        ArrayOfString obj2 = new ArrayOfString();
        byte[] byteArray = obj2.toByteArray();
        ArrayOfString obj3 = obj2;
        byte[] byteArray2[] = obj2.toByteArray();
    }
	
	/**
     * testGetInternal is not used and should have a dependency on the type of object
     * that was passed when the class was created.
     */
    void testGet() {
        ArrayOfString obj2 = new ArrayOfString();
        byte[] byteArray = obj2.toByteArray();
        ArrayOfString obj3 = obj2;
        byte[] byteArray2[] = obj2.toByteArray();
    }
	
	/**
     * testSetSerialized is not used and should have a dependency on the type of object
     * that was passed when the class was created.
     */
    void testSetSerialized() {
        ArrayOfString obj2 = new ArrayOfString();
        obj2.setString(string);
        byte[] byteArray = obj2.toByteArray();
        ArrayOfString obj3 = obj2;
}
}