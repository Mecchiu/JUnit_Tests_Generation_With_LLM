// ModpTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Modp}.
* It contains ten unit test cases for the {@link Modp#modp(int, int)} method.
*/
class ModpTest {
			@Test
			void testModp1() {
				assertEquals(3, Modp.modp(3, 5));
			}
			
			@Test
			void testModp2() {
				assertEquals(2, Modp.modp(1101, 101));
			}
			
			@Test
			void testModp3() {
				assertEquals(1, Modp.modp(0, 101));
			}
			
			@Test
			void testModp4() {
				assertEquals(8, Modp.modp(3, 11));
			}
			
			@Test
			void testModp5() {
				assertEquals(1, Modp.modp(100, 101));
			}
			
			@Test
			void testModp6() {
				assertEquals(3, Modp.modp(3, 5));
			}
			
			@Test
			void testModp7() {
				assertEquals(2, Modp.modp(1101, 101));
			}
			
			@Test
			void testModp8() {
				assertEquals(1, Modp.modp(0, 101));
			}
			
			@Test
			void testModp9() {
				assertEquals(8, Modp.modp(3, 11));
			}
			
			@Test
			void testModp10() {
				assertEquals(1, Modp.modp(100, 101));
			}
}