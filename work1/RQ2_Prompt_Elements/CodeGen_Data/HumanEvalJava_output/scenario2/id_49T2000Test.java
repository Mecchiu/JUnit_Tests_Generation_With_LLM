// ModpTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Modp}.
* It contains one unit test case for the {@link Modp#modp(int, int)} method.
*/
class ModpTest {

	int test_mod1(int n) {
		return Modp.modp(n, 3);
	}

	int test_mod2(int n) {
		return Modp.modp(n, 4);
	}

	int test_mod3(int n) {
		return Modp.modp(n, 15);
	}

	int test_mod4(int n) {
		return Modp.modp(n, 10);
	}

	int test_mod5(int n) {
		return Modp.modp(n, 9);
	}

	@Test
	void test_mod() {
		assertEquals(Modp.test_mod1(3), Modp.15);
		assertEquals(Modp.test_mod2(3), Modp.10);
		assertEquals(Modp.test_mod3(3), Modp.9);
		assertEquals(Modp.test_mod4(3), Modp.8);
		assertEquals(Modp.test_mod5(3), Modp.7);
	}

}
