// _CompleteTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Complete}.
* It contains one unit test case for the {@link _Complete#getTypeDesc()} method.
*/
class _CompleteTest {
/**
		* getTypeDesc().
		*/
String getTypeDesc() {
		return typeDesc.getTypeDesc();
	}
		
	/**
	* Test case for {@link _Complete#getTypeDesc()} method.
	*
	* <p>The executed operations shall return an instance of the type {@link java.lang.String}.</p>
	*/
@Test
    public void testGetTypeDesc() {
		String result = _Complete.getTypeDesc();
		assertNotNull("_Complete.getTypeDesc() shall return a non-null value.", result);
		assertTrue("_Complete.getTypeDesc() shall result in a String.", result.equals("string"));
    }
}
