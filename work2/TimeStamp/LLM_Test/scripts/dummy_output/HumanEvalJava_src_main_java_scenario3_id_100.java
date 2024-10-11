// MakeAPileTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MakeAPile}.
* It contains ten unit test cases for the {@link MakeAPile#makeAPile(int)} method.
*/
class MakeAPileTest {
			@Test
			void testMakeAPile() {
				List<Integer> result = MakeAPile.makeAPile(3);
				assertEquals(3, result.size());
				assertEquals(3, result.get(0));
				assertEquals(5, result.get(1));
				assertEquals(7, result.get(2));
			}

			@Test
			void testMakeAPile2() {
				List<Integer> result = MakeAPile.makeAPile(4);
				assertEquals(4, result.size());
				assertEquals(4, result.get(0));
				assertEquals(6, result.get(1));
				assertEquals(8, result.get(2));
				assertEquals(10, result.get(3));
			}

			@Test
			void testMakeAPile3() {
				List<Integer> result = MakeAPile.makeAPile(5);
				assertEquals(5, result.size());
				assertEquals(5, result.get(0));
				assertEquals(7, result.get(1));
				assertEquals(9, result.get(2));
				assertEquals(11, result.get(3));
				assertEquals(13, result.get(4));
			}

			@Test
			void testMakeAPile4() {
				List<Integer> result = MakeAPile.makeAPile(6);
				assertEquals(6, result.size());
				assertEquals(6, result.get(0));
				assertEquals(8, result.get(1));
				assertEquals(10, result.get(2));
				assertEquals(12, result.get(3));
				assertEquals(14, result.get(4));
				assertEquals(16, result.get(5));
			}

			@Test
			void testMakeAPile5() {
				List<Integer> result = MakeAPile.makeAPile(8);
				assertEquals(8, result.size());
				assertEquals(8, result.get(0));
				assertEquals(10, result.get(1));
				assertEquals(12, result.get(2));
				assertEquals(14, result.get(3));
				assertEquals(16, result.get(4));
				assertEquals(18, result.get(5));
				assertEquals(20, result.get(6));
				assertEquals(22, result.get(7));
			}

			@Test
			void testMakeAPile6() {
				List<Integer> result = MakeAPile.makeAPile(10);
				assertEquals(10, result.size());
				assertEquals(10, result.get(0));
				assertEquals(12, result.get(1));
				assertEquals(14, result.get(2));
				assertEquals(16, result.get(3));
				assertEquals(18, result.get(4));
				assertEquals(20, result.get(5));
				assertEquals(22, result.get(6));
				assertEquals(24, result.get(7));
				assertEquals(26, result.get(8));
				assertEquals(28, result.get(9));
			}

			@Test
			void testMakeAPile7() {
				List<Integer> result = MakeAPile.makeAPile(12);
				assertEquals(12, result.size());
				assertEquals(12, result.get(0));
				assertEquals(14, result.get(1));
				assertEquals(16, result.get(2));
				assertEquals(18, result.get(3));
				assertEquals(20, result.get(4));
				assertEquals(22, result.get(5));
				assertEquals(24, result.get(6));
				assertEquals(26, result.get(7));
				assertEquals(28, result.get(8));
				assertEquals(30, result.get(9));
				assertEquals(32, result.get(10));
				assertEquals(34, result.get(11));
			}

			@Test
			void testMakeAPile8() {
				List<Integer> result = MakeAPile.makeAPile(14);
				assertEquals(14, result.size());
				assertEquals(14, result.get(0));
				assertEquals(16, result.get(1));
				assertEquals(18, result.get(2));
				assertEquals(20, result.get(3));
				assertEquals(22, result.get(4));
				assertEquals(24, result.get(5));
				assertEquals(26, result.get(6));
				assertEquals(28, result.get(7));
				assertEquals(30, result.get(8));
				assertEquals(32, result.get(9));
				assertEquals(34, result.get(10));
				assertEquals(36, result.get(11));
				assertEquals(38, result.get(12));
				assertEquals(40, result.get(13));
			}

			@Test
			void testMakeAPile9() {
				List<Integer> result = MakeAPile.makeAPile(16);
				assertEquals(16, result.size());
				assertEquals(16, result.get(0));
				assertEquals(18, result.get(1));
				assertEquals(20, result.get(2));
				assertEquals(22, result.get(3));
				assertEquals(24, result.get(4));
				assertEquals(26, result.get(5));
				assertEquals(28, result.get(6));
				assertEquals(30, result.get(7));
				assertEquals(32, result.get(8));
				assertEquals(34, result.get(9));
				assertEquals(36, result.get(10));
				assertEquals(38, result.get(11));
				assertEquals(40, result.get(12));
				assertEquals(42, result.get(13));
				assertEquals(44, result.get(14));
				assertEquals(46, result.get(15));
			}

			@Test
			void testMakeAPile10() {
				List<Integer> result = MakeAPile.makeAPile(18);
				assertEquals(18, result.size());
				assertEquals(18, result.get(0));
				assertEquals(20, result.get(1));
				assertEquals(22, result.get(2));
				assertEquals(24, result.get(3));
				assertEquals(26, result.get(4));
				assertEquals(28, result.get(5));
				assertEquals(30, result.get(6));
				assertEquals(32, result.get(7));
				assertEquals(34, result.get(8));
				assertEquals(36, result.get(9));
				assertEquals(38, result.get(10));
				assertEquals(40, result.get(11));
				assertEquals(42, result.get(12));
				assertEquals(44, result.get(13));
				assertEquals(46, result.get(14));
				assertEquals(48, result.get(15));
				assertEquals(50, result.get(16));
				assertEquals(52, result.get(17));
			}
}