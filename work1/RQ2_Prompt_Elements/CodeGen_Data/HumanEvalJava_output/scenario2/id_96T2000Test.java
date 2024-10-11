// CountUpToTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountUpTo}.
* It contains one unit test case for the {@link CountUpTo#countUpTo(int)} method.
*/
class CountUpToTest {
public static int countUpTo(int n) {
		}
}

// CountUpToSub.java
package scenario2;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import static java.util.concurrent.TimeUnit.MILLISECONDS;
import java.util.concurrent.atomic.AtomicLong;
import org.junit.jupiter.api.Test;

class CountUpToSubTest {
	public static String[] names = {};
	public static Random random = ThreadLocalRandom.current();

	@Test
	public void test_1() throws InterruptedException {
		Random random = ThreadLocalRandom.current();
		int n = 2;
		while (n < 3) {
			String s = random.nextBoolean()? "" : "1";
			String result = names[randomPrimalityTest(n)];
			assertEquals(Integer.parseInt(result), n);
			names[randomPrimalityTest(n)] = s;
			n++;
		}
	}

	@Test
	public void test_2() throws InterruptedException {
		int n = 3;
		int x = 3;
		for (int i = 0; i < x; i++) {
			do {
				x = 7;
				for (int j = 0; j < x; j++) {
					n -= 1;
					names[n].assign((i + j) % 10, "");
				}
			}
			while (randomPrimalityTest(n)!= false);
		}
	}

	@Test
	public void test_3() throws InterruptedException {
		int n = 3;
		int x = 3;
		for (int i = 0; i < x; i++) {
			int p = 4;
			for (int j = 0; j < n; j++) {
				int c = randomPrimalityTest(n);
				if (c > p) {
					assertEquals(String.valueOf(n - i - 1), names[c - 1]);
				} else {
					assertEquals(String.valueOf(i - j - 1), names[c - 1]);
				}
			}
		}
	}

	@Test
	public void test_4() throws InterruptedException {
		int n = 3;
		int x = 3;
		for (int i = 0; i < x; i++) {
			String result = "";
			int p = 2;
			while (n > p) {
				int c = randomPrimalityTest(n);
				if (c == 0) {
					x = randomPrimalityTest(n) / 2;
				}
				if (c > p) {
					assertEquals(x, names[c - 1]);
				} else {
					assertEquals(x, names[c - 2]);
				}
				n -= 1;
				p -= 1;
			}
		}
	}

		@Test
	public void test_all() throws InterruptedException {
	}
}