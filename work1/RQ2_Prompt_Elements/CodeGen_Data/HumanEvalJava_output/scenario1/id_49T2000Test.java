// ModpTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Modp}.
* It contains one unit test case for the {@link Modp#modp(int, int)} method.
*/
class ModpTest {
private final int n1;
		private final int p1;
		private final int n2;
		private final int p2;
		private final int n3;
		private final int p3;
		private final int epsilon;

		/** Default constructor used for JUnit4 tests under Java 8. */
		public ModpTest() {
			this.n1 = 10;
			this.p1 = 1;
			this.n2 = n3 = this.n1;
//			this.p2 = 2;
			this.n3 = this.n2;
			this.p3 = 1;
			this.epsilon = 0.0000000001;
		}

		/** Basic constructor. */
		public ModpTest(int n1, int p1, int n2, int p2, int n3, int p3, int epsilon) {
			this.n1 = n1;
			this.p1 = p1;
			this.n2 = n2;
//			this.p2 = p2;
			this.n3 = n3;
			this.p3 = p3;
			this.epsilon = epsilon;
		}

		/** Test of modp method, of class Modp. */
		@Test
		public void testModp() {
			int result = Modp.modp(this.n1, this.p1);
			assertEquals("1", result);
			result = Modp.modp(this.n2, this.p1);
			assertEquals("3", result);
			result = Modp.modp(this.n3, this.p1);
			assertEquals("1", result);
			result = Modp.modp(this.epsilon, this.p1);
			assertEquals("-1", result);
		}
}