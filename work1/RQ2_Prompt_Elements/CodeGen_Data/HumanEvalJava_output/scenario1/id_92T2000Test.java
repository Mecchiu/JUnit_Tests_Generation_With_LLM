// AnyIntTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AnyInt}.
* It contains one unit test case for the {@link AnyInt#anyInt(Number, Number, Number)} method.
*/
class AnyIntTest {
@Test
		void anyInt(Number x, Number y, Number z) {
				assertEquals(Boolean.TYPE, x.getClass());
				assertEquals(Boolean.TYPE, y.getClass());
				assertEquals(Integer.TYPE, z.getClass());
	}
}