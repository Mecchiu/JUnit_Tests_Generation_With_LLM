// EngineTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Engine}.
* It contains one unit test case for the {@link Engine#getTypeDesc()} method.
*/
class EngineTest {

	
	/**  Test of getTypeDesc method. */
	@Test
	public void testGetTypeDesc() {
		assertEquals(
"Engine",
mygrid.web.SerializationHelper.read(mygrid.web.Engine.class, new org.apache.axis.encoding.StreamingSerializer(mygrid.web.SerializationHelper.getSerializedForm(Enum_ArrayMap.class))),
"EngineTest");
	}

}
