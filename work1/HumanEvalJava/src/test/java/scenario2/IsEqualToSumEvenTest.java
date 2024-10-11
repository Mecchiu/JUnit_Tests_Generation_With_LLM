// IsEqualToSumEvenTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsEqualToSumEven}.
* It contains ten unit test cases for the {@link IsEqualToSumEven#isEqualToSumEven(int)} method.
*/
class IsEqualToSumEvenTest {
			@Test
			void testIsEqualToSumEven() {
				// Test case 1
				int n1 = 8;
				Boolean result1 = IsEqualToSumEven.isEqualToSumEven(n1);
				assertTrue(result1);
				
				// Test case 2
				int n2 = 10;
				Boolean result2 = IsEqualToSumEven.isEqualToSumEven(n2);
				assertTrue(result2);
				
				// Test case 3
				int n3 = 12;
				Boolean result3 = IsEqualToSumEven.isEqualToSumEven(n3);
				assertTrue(result3);
				
				// Test case 4
				int n4 = 14;
				Boolean result4 = IsEqualToSumEven.isEqualToSumEven(n4);
				assertTrue(result4);
				
				// Test case 5
				int n5 = 16;
				Boolean result5 = IsEqualToSumEven.isEqualToSumEven(n5);
				assertTrue(result5);
				
				// Test case 6
				int n6 = 18;
				Boolean result6 = IsEqualToSumEven.isEqualToSumEven(n6);
				assertTrue(result6);
				
				// Test case 7
				int n7 = 20;
				Boolean result7 = IsEqualToSumEven.isEqualToSumEven(n7);
				assertTrue(result7);
				
				// Test case 8
				int n8 = 22;
				Boolean result8 = IsEqualToSumEven.isEqualToSumEven(n8);
				assertTrue(result8);
				
				// Test case 9
				int n9 = 24;
				Boolean result9 = IsEqualToSumEven.isEqualToSumEven(n9);
				assertTrue(result9);
				
				// Test case 10
				int n10 = 26;
				Boolean result10 = IsEqualToSumEven.isEqualToSumEven(n10);
				assertTrue(result10);
			}
}