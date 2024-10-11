// FTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link F}.
* It contains one unit test case for the {@link F#f(int)} method.
*/
class FTest {
static int size;
		/**
		* The test method of {@link FTest}
		*/
		@Test
		public void test() {
				F f = new F();
			   size = f.f(5) + f.f(10) + f.f(3);
			   assertEquals("F.f returns 2+3+3", 2+3+3, size);
			}

}