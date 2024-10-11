// ConcatenateTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Concatenate}.
* It contains one unit test case for the {@link Concatenate#concatenate(List)} method.
*/
class ConcatenateTest {

	@Test
	void concatenate() {
		final List<String> strings    =  List.of("A", "one", "two", "three");
		final String    expected =  "oneonetwothree";
		assertEquals("concatenate", expected, concatenate(strings));
	}


	@Test
	void concatenate_no_strings_null() {
		assertNull(concatenate());
	}
}
// ConcatenateTest.java