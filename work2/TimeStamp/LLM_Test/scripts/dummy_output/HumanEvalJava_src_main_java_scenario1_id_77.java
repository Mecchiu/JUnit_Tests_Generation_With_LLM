// IscubeTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Iscube}.
* It contains ten unit test cases for the {@link Iscube#iscube(int)} method.
*/
class IscubeTest {
			// Test case 1: 0
			@Test
			void test1() {
				Boolean result = Iscube.iscube(0);
				assertEquals(true, result);
			}
			
			// Test case 2: 1
			@Test
			void test2() {
				Boolean result = Iscube.iscube(1);
				assertEquals(true, result);
			}
			
			// Test case 3: 2
			@Test
			void test3() {
				Boolean result = Iscube.iscube(2);
				assertEquals(false, result);
			}
			
			// Test case 4: 3
			@Test
			void test4() {
				Boolean result = Iscube.iscube(3);
				assertEquals(false, result);
			}
			
			// Test case 5: 4
			@Test
			void test5() {
				Boolean result = Iscube.iscube(4);
				assertEquals(false, result);
			}
			
			// Test case 6: 5
			@Test
			void test6() {
				Boolean result = Iscube.iscube(5);
				assertEquals(false, result);
			}
			
			// Test case 7: 6
			@Test
			void test7() {
				Boolean result = Iscube.iscube(6);
				assertEquals(false, result);
			}
			
			// Test case 8: 7
			@Test
			void test8() {
				Boolean result = Iscube.iscube(7);
				assertEquals(false, result);
			}
			
			// Test case 9: 8
			@Test
			void test9() {
				Boolean result = Iscube.iscube(8);
				assertEquals(false, result);
			}
			
			// Test case 10: 9
			@Test
			void test10() {
				Boolean result = Iscube.iscube(9);
				assertEquals(true, result);
			}
}