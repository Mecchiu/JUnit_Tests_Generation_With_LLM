// AddTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Add}.
* It contains ten unit test cases for the {@link Add#add(int, int)} method.
*/
class AddTest {
			// Test case 1
			@Test
			void testAdd1() {
				int result = Add.add(1, 2);
				assertEquals(3, result);
			}
			
			// Test case 2
			@Test
			void testAdd2() {
				int result = Add.add(0, 0);
				assertEquals(0, result);
			}
			
			// Test case 3
			@Test
			void testAdd3() {
				int result = Add.add(-1, 1);
				assertEquals(0, result);
			}
			
			// Test case 4
			@Test
			void testAdd4() {
				int result = Add.add(1, -1);
				assertEquals(0, result);
			}
			
			// Test case 5
			@Test
			void testAdd5() {
				int result = Add.add(-1, -1);
				assertEquals(-2, result);
			}
			
			// Test case 6
			@Test
			void testAdd6() {
				int result = Add.add(1, 0);
				assertEquals(1, result);
			}
			
			// Test case 7
			@Test
			void testAdd7() {
				int result = Add.add(0, 1);
				assertEquals(1, result);
			}
			
			// Test case 8
			@Test
			void testAdd8() {
				int result = Add.add(1, 1);
				assertEquals(2, result);
			}
			
			// Test case 9
			@Test
			void testAdd9() {
				int result = Add.add(2, 2);
				assertEquals(4, result);
			}
			
			// Test case 10
			@Test
			void testAdd10() {
				int result = Add.add(3, 3);
				assertEquals(6, result);
			}
}