// EatTest.java
package scenario2;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Eat}.
* It contains one unit test case for the {@link Eat#eat(int, int, int)} method.
*/
class EatTest {

    int counter;
	
	List<Integer> expected;
	
	@Test
	public void eatConstraint() {
		new Eat().eat(7, 10, 5);
		expected = Arrays.asList(13, 19);

		new Eat().eat(7, 10, 100);
		expected = Arrays.asList(19, 19);

		new Eat().eat(7, 10, 50);
		expected = Arrays.asList(0);

		new Eat().eat(7, 10, 0);
		expected = Arrays.asList(10, 0);

		new Eat().eat(7, 10, 1);
		expected = Arrays.asList(0);

		new Eat().eat(10, 10, 1);
		expected = Arrays.asList(2, 2);
	}
	
	@Test
	public void eatReturnArrayResult() {
		new Eat().eat(7, 10, 150);
		expected = Arrays.asList(4, 10);

		new Eat().eat(7, 10, 100);
		expected = Arrays.asList(10, 20);
	}
	
	@Test
	public void eatArrayResult() {
		new Eat().eat(7, 10, 100);
		expected = Arrays.asList(1, 2);
	}
	
	
	@Test
	public void eatListResult() {
		new Eat().eat(10, 10, 5, true);
		expected = Arrays.asList(10, 25);
		
		new Eat().eat(10, 10, 100, true);
		expected = Arrays.asList(50, 70, 80, 90, 95, 100, 200);
	}
	
	@Test
	public void eatConstantArrayItemResult() {
		new Eat().eat(10, 10, 10, true);
		expected = Arrays.asList(10, 10, 10, true);
	}
	
	@Test
	public void eatConstantArrayItemConstrainResult() {
		new Eat().eat(10, 10, 100, true);
		expected = Arrays.asList(0, 10, 20, 15, 30);

		new Eat().eat(10, 10, 50, true);
		expected = Arrays.asList(1, 10, 15, 15, 15, 30, 15, 15, 15, 10, 10, 30, 30, 30, 15, 15, 10, 30, 30);

		new Eat().eat(10, 10, 10, true);
		expected = Arrays.asList(2, 10);
	}

	@Test
	public void eatConstantNullResult() {
		new Eat().eat(10, 10, 1);
		expected = Arrays.asList(0);
	}

	@Test
	public void eatListArrayItemResult() {
		new Eat().eat(10, 10, 10, false);
		expected = Arrays.asList(10, 0);

		new Eat().eat(10, 10, 0, false);
		expected = Arrays.asList(5, 10);

		new Eat().eat(7, 10, 0, 5);
		expected = Arrays.asList(0, 5);

		new Eat().eat(7, 10, 1, 5);
		expected = Arrays.asList(10, 20);
	}
	
	@Test
	public void eatMixedConstantAndArrayItemResult() {
		new Eat().eat(10, 10, 10, true);
		expected = Arrays.asList(10, 10, 5, 100);
	}
	
	
}
