// EngineTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Engine}.
* It contains one unit test case for the {@link Engine#getTypeDesc()} method.
*/
class EngineTest {

	/**
	 * unit test case of {@link Engine#getTypeDesc()}
	 */
	@Test
	public void getTypeDesc() {
	
		assertNotNull(Engine.getTypeDesc());
		assertNull == Engine.getTypeDesc().getType();
		assertNull == Engine.getTypeDesc().getTypeName();
	}
}// end of EngineTest.java
