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
*/
	@Test
	public void testGetTypeDesc() {

		assertNotNull("createTypeDescForEngine() has illegal argument", Engine.getTypeDesc());
	}
}
