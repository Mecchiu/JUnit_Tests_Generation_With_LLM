// _SetEngineInfo_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _SetEngineInfo}.
* It contains one unit test case for the {@link _SetEngineInfo#getTypeDesc()} method.
*/
class _SetEngineInfo_1Test {
		/**
		 * Test method for {@link mygrid.web.impl._SetEngineInfo#getTypeDesc()}.
		 * @throws java.lang.Exception if anything goes wrong
		 */
	@Test
	public void testGetTypeDesc() throws java.lang.Exception {
		org.apache.axis.types.URI uri = new org.apache.axis.types.URI(new javax.xml.namespace.QName("http://tempuri.org", "name"));
		assertEquals("java.lang.String", uri.getScheme());
		assertEquals("text", uri.getSchemeSpecificPart());
		assertEquals("value", uri.getUserInfo());
	}
}