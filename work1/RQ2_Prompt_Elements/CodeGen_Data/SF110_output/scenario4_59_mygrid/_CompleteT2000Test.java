// _CompleteTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Complete}.
* It contains one unit test case for the {@link _Complete#getTypeDesc()} method.
*/
class _CompleteTest {
public _CompleteTest() {
	}
		
	@javax.xml.bind.Test
		public void testGetTypeDesc() {
				_Complete._CompleteTypeDesc _typeDesc;
				_typeDesc = _Complete._CompleteTypeDesc.valueOf(_Complete.class.getSimpleName());
				assertEquals("Get _Complete.class.getSimpleName()", _typeDesc.name(), "mygrid.web.Complete._Complete.typeDesc()");
	}


}
