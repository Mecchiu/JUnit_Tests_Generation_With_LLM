// _SetEngineInfoTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _SetEngineInfo}.
* It contains one unit test case for the {@link _SetEngineInfo#getTypeDesc()} method.
*/
class _SetEngineInfoTest {
		@Test
		public void test() {
			_SetEngineInfo obj = new _SetEngineInfo();
			// method has to return type desc
			assertEquals(obj.getName(), org.apache.axis.description.TypeDesc.valueOf(_SetEngineInfo.class));
			assertEquals(obj.size(), 0);
			assertEquals(obj.getOs(), null);
		}
	}