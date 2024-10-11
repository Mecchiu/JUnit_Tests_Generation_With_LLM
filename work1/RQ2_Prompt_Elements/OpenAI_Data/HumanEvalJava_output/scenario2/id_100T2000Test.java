// MakeAPileTest.java
package scenario2;

import java.util.ArrayList;
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
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(5);
				expected.add(7);
				expected.add(9);
				expected.add(11);
				expected.add(13);
				expected.add(15);
				expected.add(17);
				expected.add(19);
				expected.add(21);
				expected.add(23);
				List<Integer> actual = MakeAPile.makeAPile(5);
				assertEquals(expected, actual);
			}
			
			@Test
			void testMakeAPile2() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(6);
				expected.add(8);
				expected.add(10);
				expected.add(12);
				expected.add(14);
				expected.add(16);
				expected.add(18);
				expected.add(20);
				expected.add(22);
				expected.add(24);
				List<Integer> actual = MakeAPile.makeAPile(6);
				assertEquals(expected, actual);
			}
			
			@Test
			void testMakeAPile3() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(7);
				expected.add(9);
				expected.add(11);
				expected.add(13);
				expected.add(15);
				expected.add(17);
				expected.add(19);
				expected.add(21);
				expected.add(23);
				expected.add(25);
				List<Integer> actual = MakeAPile.makeAPile(7);
				assertEquals(expected, actual);
			}
			
			@Test
			void testMakeAPile4() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(8);
				expected.add(10);
				expected.add(12);
				expected.add(14);
				expected.add(16);
				expected.add(18);
				expected.add(20);
				expected.add(22);
				expected.add(24);
				expected.add(26);
				List<Integer> actual = MakeAPile.makeAPile(8);
				assertEquals(expected, actual);
			}
			
			@Test
			void testMakeAPile5() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(9);
				expected.add(11);
				expected.add(13);
				expected.add(15);
				expected.add(17);
				expected.add(19);
				expected.add(21);
				expected.add(23);
				expected.add(25);
				expected.add(27);
				List<Integer> actual = MakeAPile.makeAPile(9);
				assertEquals(expected, actual);
			}
			
			@Test
			void testMakeAPile6() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(10);
				expected.add(12);
				expected.add(14);
				expected.add(16);
				expected.add(18);
				expected.add(20);
				expected.add(22);
				expected.add(24);
				expected.add(26);
				expected.add(28);
				List<Integer> actual = MakeAPile.makeAPile(10);
				assertEquals(expected, actual);
			}
			
			@Test
			void testMakeAPile7() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(11);
				expected.add(13);
				expected.add(15);
				expected.add(17);
				expected.add(19);
				expected.add(21);
				expected.add(23);
				expected.add(25);
				expected.add(27);
				expected.add(29);
				List<Integer> actual = MakeAPile.makeAPile(11);
				assertEquals(expected, actual);
			}
			
			@Test
			void testMakeAPile8() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(12);
				expected.add(14);
				expected.add(16);
				expected.add(18);
				expected.add(20);
				expected.add(22);
				expected.add(24);
				expected.add(26);
				expected.add(28);
				expected.add(30);
				List<Integer> actual = MakeAPile.makeAPile(12);
				assertEquals(expected, actual);
			}
			
			@Test
			void testMakeAPile9() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(13);
				expected.add(15);
				expected.add(17);
				expected.add(19);
				expected.add(21);
				expected.add(23);
				expected.add(25);
				expected.add(27);
				expected.add(29);
				expected.add(31);
				List<Integer> actual = MakeAPile.makeAPile(13);
				assertEquals(expected, actual);
			}
			
			@Test
			void testMakeAPile10() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(14);
				expected.add(16);
				expected.add(18);
				expected.add(20);
				expected.add(22);
				expected.add(24);
				expected.add(26);
				expected.add(28);
				expected.add(30);
				expected.add(32);
				List<Integer> actual = MakeAPile.makeAPile(14);
				assertEquals(expected, actual);
			}
}