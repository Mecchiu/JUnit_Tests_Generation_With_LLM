// PairsSumToZeroTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PairsSumToZero}.
* It contains one unit test case for the {@link PairsSumToZero#pairsSumToZero(List)} method.
*/
class PairsSumToZeroTest {
@Test
	    public void test1() {
		  Boolean result = new PairsSumToZero().pairsSumToZero(new List<>([1, 2, -3]));
		  Integer actual = new Integer(0);
		  assertThat(result, is(true));
	    }
		@Test
	    public void test2() {
		  Boolean result = new PairsSumToZero().pairsSumToZero(new List<>([]));
		  Integer actual = new Integer(0);
		  assertThat(result, is(false));
	    }
		@Test
	    public void test3() {
		  Boolean result = new PairsSumToZero().pairsSumToZero(new List<>(new List[]{}));
		  Integer actual = new Integer(0);
		  assertThat(result, is(true));
	    }
	    @Test
	    public void test4() {
		  Boolean result = new PairsSumToZero().pairsSumToZero(new List<Integer>([1, 3, 5, 0]));
		  Integer actual = new Integer(0);
		  assertThat(result, is(false));
	    }

	}
