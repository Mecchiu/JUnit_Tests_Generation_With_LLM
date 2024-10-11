// _SetEngineInfoResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _SetEngineInfoResponse}.
* It contains one unit test case for the {@link _SetEngineInfoResponse#getTypeDesc()} method.
*/
class _SetEngineInfoResponseTest {
/**
		* {@link _SetEngineInfoResponse#getTypeDesc()} method test cases
		* of {@link mygrid.web.AbstractWebSetEngineInfoResponse#getTypeDesc()}.
		*/
	@Test
		public void getTypeDesc() {
			assertEquals(AbstractWebSetEngineInfoResponse.class,
				_SetEngineInfoResponse.getTypeDesc());
		}
	}
