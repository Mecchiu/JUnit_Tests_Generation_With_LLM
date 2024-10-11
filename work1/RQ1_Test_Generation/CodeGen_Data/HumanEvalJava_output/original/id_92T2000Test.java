// AnyIntTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AnyInt}.
* It contains one unit test case for the {@link AnyInt#anyInt(Number, Number, Number)} method.
*/
class AnyIntTest {
@Test
		void testAnyInt() {
				assertEquals(true, AnyInt.anyInt(1, 1, 1));
				assertEquals(true, AnyInt.anyInt(3, 2, 7));
				assertEquals(false, AnyInt.anyInt(3, -2, 1));
				assertEquals(false, AnyInt.anyInt(3.6, 2.2, 2.2));
				assertEquals(false, AnyInt.anyInt(2, 3, 1));
				assertEquals(false, AnyInt.anyInt(2.5, 2.2, 2.2));
				assertEquals(false, AnyInt.anyInt(1.5, 5, 3.5));
				assertEquals(true, AnyInt.anyInt(2.2, 6, 2));
				assertEquals(true, AnyInt.anyInt(4, 8, 2));
				assertEquals(false, AnyInt.anyInt(2, 1, 1));
				assertEquals(false, AnyInt.anyInt(3.0, 5, 3.5));
				assertEquals(true, AnyInt.anyInt(2.2, 1.1, 1.1));
				assertEquals(true, AnyInt.anyInt(1.1, 4.9, 3.2));
		}
}