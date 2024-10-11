// ArrayOfString_2Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfString}.
* It contains one unit test case for the {@link ArrayOfString#getTypeDesc()} method.
*/
class ArrayOfString_2Test {
		
	private void assertTypeQNameEquals(String text, javax.xml.namespace.QName typeQName) throws java.lang.Exception {
		
		assertEquals(javax.xml.namespace.QName.type, typeQName);
		assertEquals(String.class.getName(), typeQName.getLocalPart());
		if (text!= null) {
			if (text.length() > 0) {
				assertEquals(text, typeQName.getQualifiedNameValue());
			} else {
				assertNull(typeQName.getQualifiedNameValue());
			}
		}
	}

	
	@Test
	public void testTypeDesc() throws java.lang.Exception {
		
		assertTypeQNameEquals("123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890", ArrayOfString.TYPE_DESC);
	}
	
}