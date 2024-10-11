// _SetEngineInfo_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _SetEngineInfo}.
* It contains one unit test case for the {@link _SetEngineInfo#getTypeDesc()} method.
*/
class _SetEngineInfo_1Test {
		public _SetEngineInfo_1Test() {
		}
		
		@Test
		public void testGetTypeDesc() {
			assertEquals(new org.apache.axis2.databinding.utils.ConverterFactory().createSerializerConverter(_SetEngineInfo.class), "1");
		}
}