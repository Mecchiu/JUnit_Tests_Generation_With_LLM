// _GetEngineTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _GetEngine}.
* It contains one unit test case for the {@link _GetEngine#getTypeDesc()} method.
*/
class _GetEngineTest {
/**
		* Test for {@link _GetEngine#getTypeDesc()}.
		* <p>
		* Test description:
		* <ul>
		* <li>Given a null input for field name</li>
		* <li>When generating typeDesc and a null result for type field</li>
		* <li>Then a typeException is thrown when calling the method</li>
		* </ul>
		*/
	@Test
	public void testGetTypeDesc() {
        assertNull(java.util.Optional.empty().get().getTypeDesc());
        assertNull(java.util.Optional.empty().get().getTypeField());
	}
}
