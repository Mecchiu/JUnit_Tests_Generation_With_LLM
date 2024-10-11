// _SetEngineInfoTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _SetEngineInfo}.
* It contains one unit test case for the {@link _SetEngineInfo#getTypeDesc()} method.
*/
class _SetEngineInfoTest {
		private static org.mycore.common.xml.types.MyxTypeMock my_xmlTypeMock = new org.mycore.common.xml.types.MyxTypeMock();

		private static void verifyValues(java.lang.String actual, float expectedFloat) {
			if (!java.lang.Float.floatToIntBits(expectedFloat).equals(java.lang.Float.floatToIntBits(actual))) {
				assertEquals(expectedFloat, java.lang.Float.parseFloat(actual), 0.00001);
			}
		}

		@Test
		public void setType_setTypeDesc() throws java.lang.Exception {

			java.lang.String actual = _SetEngineInfoTest.getTypeDesc().toString();
			java.lang.String expected = "mygrid.web.engine.my_engine_type_desc";
			assertEquals(expected, actual);
		}





	}