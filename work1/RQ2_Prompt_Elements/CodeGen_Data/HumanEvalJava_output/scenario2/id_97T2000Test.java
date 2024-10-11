// MultiplyTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Multiply}.
* It contains one unit test case for the {@link Multiply#multiply(int, int)} method.
*/
class MultiplyTest {

	@Test
	void test() {
		int numbers[][] = {
				{1, 100},
				{2, 200},
		};
		for (int [][]a : numbers) {
			System.out.println(a[0][0] + a[1][1]);
		}
		//assertEquals(6, Multiply.multiply(6, 1000));
	}
}


// The main() method has no effect, so no action is necessary here.




