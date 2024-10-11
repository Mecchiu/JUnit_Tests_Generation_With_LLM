// DiscriminatorTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Discriminator}.
* It contains one unit test case for the {@link Discriminator#getTypeDesc()} method.
*/
class DiscriminatorTest {
		
	/**
	* Test method for getTypeDesc()
	*/
	@Test
	public void testGetTypeDesc() {
		
		String expectedTypeDesc = "" + "mygrid.web.DisposableTypeName";
		// We're using the getter method from super class, because it performs no tests,
		// there is no reason to implement a getter method as any of mygrid.web.DisposableTypeName.getTypeDesc() do this.
		expectedTypeDesc = expectedTypeDesc + ";";
		
		// The following types can be used in the XML Deserializers
		
		expectedTypeDesc = expectedTypeDesc + "Processor";
		expectedTypeDesc = expectedTypeDesc + "JavaClass";
		expectedTypeDesc = expectedTypeDesc + "JavaClassType";
		expectedTypeDesc = expectedTypeDesc + "ClassName";
		expectedTypeDesc = expectedTypeDesc + "Classes";
		
		// The following types can be used in the XML Serializers
		
		expectedTypeDesc = expectedTypeDesc + "mygrid.web.ArrayOfArrayOfString";
		expectedTypeDesc = expectedTypeDesc + "mygrid.web.mygrid.web.ArrayOfString";
		expectedTypeDesc = expectedTypeDesc + "mygrid.web.DisposableArrayOfString";
		expectedTypeDesc = expectedTypeDesc + "mygrid.web.DisposableArrayOfStringType";
		expectedTypeDesc = expectedTypeDesc + "mygrid.web.ArrayOfArrayOfStringType";
		expectedTypeDesc = expectedTypeDesc + "mygrid.web.DisposableArrayOfStringType";
		expectedTypeDesc = expectedTypeDesc + "mygrid.web.ArrayOfArrayOfStringType";
		expectedTypeDesc = expectedTypeDesc + "ArrayOfObjects";
		expectedTypeDesc = expectedTypeDesc + "ArrayOfObjectsType";
		expectedTypeDesc = expectedTypeDesc + "ArrayOfString";
		expectedTypeDesc = expectedTypeDesc + "ArrayOfStringType";
		expectedTypeDesc = expectedTypeDesc + "ArrayOfStringType";
		expectedTypeDesc = expectedTypeDesc + "ArrayOfStringType";
		expectedTypeDesc = expectedTypeDesc + "ArrayOfStringType";
		expectedTypeDesc = expectedTypeDesc + "ArrayOfStringType";
		expectedTypeDesc = expectedTypeDesc + "ArrayOfStringType";
		expectedTypeDesc = expectedTypeDesc + "ArrayOfStringType";
		expectedTypeDesc = expectedTypeDesc + "ArrayOfStringType";
		expectedTypeDesc = expectedTypeDesc + "ArrayOfStringType";
		expectedTypeDesc = expectedTypeDesc + "ArrayOfStringType";
		expectedTypeDesc = expectedTypeDesc + "ArrayOfStringType";
		expectedTypeDesc = expectedTypeDesc + "ArrayOfStringType";
		expectedTypeDesc = expectedTypeDesc + "ArrayOfStringType";
		expectedTypeDesc = expectedTypeDesc + "ArrayOfStringType";
		expectedTypeDesc = expectedTypeDesc + "ArrayOfStringType";
		expectedTypeDesc = expectedTypeDesc + "ArrayOfStringType";
		expectedTypeDesc = expectedTypeDesc + "ArrayOfStringType";
		expectedTypeDesc = expectedTypeDesc + "ArrayOfStringType";
		expectedTypeDesc = expectedTypeDesc + "ArrayOfStringType";
		expectedTypeDesc = expectedTypeDesc + "ArrayOfStringType";
		expectedTypeDesc = expectedTypeDesc + "ArrayOfStringType";
		expectedTypeDesc = expectedTypeDesc + "ArrayOfStringType";
		expectedTypeDesc = expectedTypeDesc + "ArrayOfStringType";
		expectedTypeDesc = expectedTypeDesc + "ArrayOfStringType";
		expectedTypeDesc = expectedTypeDesc + "ArrayOfStringType";
		expectedTypeDesc = expectedTypeDesc + "ArrayOfStringType";
		expectedTypeDesc = expectedTypeDesc + "ArrayOfStringType";
		expectedTypeDesc = expectedTypeDesc + "ArrayOfStringType";
		expectedTypeDesc = expectedTypeDesc + "ArrayOfStringType";
		expectedTypeDesc = expectedTypeDesc + "ArrayOfStringType";
		expectedTypeDesc = expectedTypeDesc + "ArrayOfStringType";
		expectedTypeDesc = expectedTypeDesc + "ArrayOfStringType";
		
		assertEquals("Unable to compile type descriptors correctly.", expectedTypeDesc, Discriminator.getTypeDesc());
	}

	@Test
	/**
	* Test method for {@link Discriminator#fromXML(String, mygrid.web.xml.XMLSerializer)}.
	*/
	public void testFromXML() throws Exception {
		
		
	}

}