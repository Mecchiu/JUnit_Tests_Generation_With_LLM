// EatTest.java
package original;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Eat}.
* It contains one unit test case for the {@link Eat#eat(int, int, int)} method.
*/
class EatTest {
/**
		* Unit test case for {@link Eat#eat(int, int, int)} method.
		* Creates a default Eat instance, which should return its expected values.
		*
		* @return
		*/
		@Test
		public void eatTest(){
				assertEquals(new Eat(), Arrays.asList(10,1,4));
				assertEquals(new Eat(2, 1), Arrays.asList(1));
				assertEquals(new Eat(3, 1), Arrays.asList(1,2));
		}
}
