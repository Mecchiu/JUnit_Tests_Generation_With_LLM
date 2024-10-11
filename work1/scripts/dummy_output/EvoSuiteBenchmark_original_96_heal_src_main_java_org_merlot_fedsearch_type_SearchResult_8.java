// SearchResultTest.java
package org.merlot.fedsearch.type;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SearchResult}.
* It contains one unit test case for the {@link SearchResult#getTypeDesc()} method.
*/
class SearchResultTest {
		
	/**
	 * getTypeDesc
	 */
	@Test
	public void testGetTypeDesc() {
		assertEquals(org.apache.axis.types.AtomicType.getInstance().toString(), SearchResult.getTypeDesc(javax.xml.ws.soap.SOAPFault.class, org.apache.axis2.jaxws.core.InvocationContext.class, org.merlot.fedsearch.type.SearchResult.class).toURI());
	}
	
}