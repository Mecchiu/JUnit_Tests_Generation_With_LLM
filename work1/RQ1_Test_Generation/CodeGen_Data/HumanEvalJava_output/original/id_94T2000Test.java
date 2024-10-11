// SkjkasdkdTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Skjkasdkd}.
* It contains one unit test case for the {@link Skjkasdkd#skjkasdkd(List)} method.
*/
class SkjkasdkdTest {
public SkjkasdkdTest() {
	}

	@Test
	void test001() {
            String expectedOutput = "10";

            assertEquals(expectedOutput,
                    skjkasdkd(List.of(1, 0, 8, 4, 1, 21)));

            expectedOutput = "24";

            assertEquals(expectedOutput,
                    skjkasdkd(List.of(1, 0, 8, 4, 1, 21, 23)));

            expectedOutput = "49";

            assertEquals(expectedOutput,
                    skjkasdkd(List.of(5, 0, 32, 5, 1, 1, 2, 3, 2, 0, 2)));
	}

	@Test
	void test002() {
            String expectedOutput = "13";

            assertEquals(expectedOutput,
                    skjkasdkd(List.of(1, 3, 1, 32, 5107, 34, 83278, 109, 163)));

            expectedOutput = "1317";

            assertEquals(expectedOutput,
                    skjkasdkd(List.of(5, 10, 3, 3, 1, 2, 2, 1, 5, 6, 9)));

            expectedOutput = "2633";

            assertEquals(expectedOutput,
                    skjkasdkd(List.of(5, 0, 1, 2, 1, 9)));

            expectedOutput = "1928";

            assertEquals(expectedOutput,
                    skjkasdkd(List.of(19291, 3, 33, 1, 1, 2)));

            expectedOutput = "3827";

            assertEquals(expectedOutput,
                    skjkasdkd(List.of(180972, 4, 3, 2, 1, 2, 3)));
	}

	@Test
	void test003() {
            String expectedOutput = "1928";

            assertEquals(expectedOutput,
                    skjkasdkd(List.of(5, 7, 13, 9)));

            expectedOutput = "1928";

            // TODO: SkjkasdkdTest.skjkasdkd() doesn't compile with -verify-options,
            // however skjkasdkd only returns true.
            //expectedOutput = "192813";

            expectedOutput = "292432";

            assertEquals(expectedOutput,
                    skjkasdkd(List.of(5, 28, 2, 13, 24)));

            expectedOutput = "10";

            assertEquals(expectedOutput,
                    skjkasdkd(List.of(1, 0, 8, 4, 1, 21, 12)));

            expectedOutput = "1282";
		}

		private String check(String expectedOutput,
				String actualOutput) {
			if (!expectedOutput.equals(actualOutput)) {
				fail("Not equal "+expectedOutput+" - "+actualOutput);
			}
		}

		@Test
		void test004() {
			String expectedOutput = "152928"

			try {
				// Should not compile, skjkasdkd().call(5,0) is never called when the result isn't a boolean, so always run test.
			} catch (Exception e) {
				check(expectedOutput, e.toString());
			}
		}

	
			
}
