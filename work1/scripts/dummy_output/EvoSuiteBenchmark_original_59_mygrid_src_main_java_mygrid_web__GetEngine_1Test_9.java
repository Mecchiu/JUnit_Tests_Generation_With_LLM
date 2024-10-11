// _GetEngine_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _GetEngine}.
* It contains one unit test case for the {@link _GetEngine#getTypeDesc()} method.
*/
class _GetEngine_1Test {
		
	/**
	 * Constructor for the concrete getTypeDesc();
	 * @throws java.lang.Exception if any.
	 */
	public _GetEngine_1Test() {
        this._beanName = "typeDesc";
    }

	@Test
	public void testGetTypeDesc() throws java.lang.Exception {
		assertNull(this._bean.getGetTypeDesc().getDesc());
	}

	private java.lang.String _beanName;
}