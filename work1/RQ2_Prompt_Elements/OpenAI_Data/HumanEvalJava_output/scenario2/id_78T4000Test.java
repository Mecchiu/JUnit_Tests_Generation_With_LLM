// HexKeyTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HexKey}.
* It contains ten unit test cases for the {@link HexKey#hexKey(Object)} method.
*/
class HexKeyTest {

	@Test
	void testHexKey() {
		assertEquals(0, HexKey.hexKey(""));
		assertEquals(0, HexKey.hexKey("1"));
		assertEquals(1, HexKey.hexKey("2"));
		assertEquals(1, HexKey.hexKey("3"));
		assertEquals(1, HexKey.hexKey("5"));
		assertEquals(1, HexKey.hexKey("7"));
		assertEquals(1, HexKey.hexKey("B"));
		assertEquals(1, HexKey.hexKey("D"));
		assertEquals(2, HexKey.hexKey("2B"));
		assertEquals(2, HexKey.hexKey("3D"));
	}
}