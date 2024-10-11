// EvenOddCountTest.java
package scenario1;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EvenOddCount}.
* It contains one unit test case for the {@link EvenOddCount#evenOddCount(int)} method.
*/
class EvenOddCountTest {
// EvenOddCount.java
package scenario1;

import java.util.Arrays;
import java.util.List;

class EvenOddCount {

    public static List<Integer> evenOddCount(int num) {
        int even = 0;
        int odd = 0;
        if (num == 0) {
            even++;
        }
        while (num!= 0) {
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            num /= 10;
        }
        return Arrays.asList(even, odd);
    }
}

// EvenOddCountTest.java
package scenario1;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EvenOddCount}.
* It contains one unit test case for the {@link EvenOddCount#evenOddCount(int)} method.
*/
class EvenOddCountTest {
		// Test data for {@link EvenOddCount#evenOddCount(int)} method.
		static char[][] data =   {{"1","3","5","7","9"},
                                   {"65","89","90","98","99"},
                                   {"11","25","77","13","75"},
                                   {"77","45","35","75","67"}};
		// Test data for {@link EvenOddCount#getEvenOddCount(int)} method.
		static List<Integer> testData = Arrays.asList( 
				new Integer[] {0,1,0,1,0,0,3,4,0},
				new Integer[] {1,1,1,1,1,1,1,1,1},
				new Integer[] {0,1,1,1,1,0,2,8,0},
				new Integer[] {2,8,13,13,6,27,13,2,1});
		// Test data for {@link EvenOddCount#evenOddCount(int)} method.
		static char[][] dataEvenOdd = {{"4","4","3","3","2","2","0","5","2"},
                                   {"2","1","1","0",'5',"2","8","3","2"}};
				
		// Constructor tests for {@link EvenOddCount#EvenOddCount(int)} method.
		@Test
		public void testEvenOddCountConstructor(){
				{
						EvenOddCount n = new EvenOddCount(100);
						// Check for exception
						assertThrows(IllegalArgumentException.class, ()->{n.evenOddCount(3);});
				}
				{
						EvenOddCount n = new EvenOddCount(100);
						// Check for exception
                        assertThrowsException(IllegalArgumentException.class, ()->{n.oddOddCount(3);});
				}
				{
						EvenOddCount n = new EvenOddCount(testData);
						// Check for exception
                        assertThrowsException(IllegalArgumentException.class, ()->{n.otherOddOddCount(3);});
				}
				{
				EvenOddCount n = new EvenOddCount(testData);
				// Check for exception
				assertThrowsException(IllegalArgumentException.class, ()->{n.otherEvenOddCount(3);});
			}
			{
				EvenOddCount n = new EvenOddCount((List<Integer>)null);
				// Check for exception
			assertThrowsException(IllegalArgumentException.class, ()->{n.otherEvenOddCount(3);});
			}
			{	
				EvenOddCount n = new EvenOddCount(testData);
				// Check for exception
				assertThrowsException(IllegalArgumentException.class, ()->{n.oddEvenOddCount(4);});
			}
			{	
				EvenOddCount n = new EvenOddCount(testData);
				// Check for exception
				assertThrowsException(IllegalArgumentException.class, ()->{n.evenEvenOddCount(4);});
			}
			{	
				EvenOddCount n = new EvenOddCount(testData);
				// Check for exception
				assertThrowsException(IllegalArgumentException.class, ()->{n.oddEvenEvenOddCount(4);});
			}
			{	
				EvenOddCount n = new EvenOddCount(data);
				// Check for exception
				assertThrowsException(IllegalArgumentException.class, ()->{n.oddEvenEvenOddCount(4);});
			}
			{	
				EvenOddCount n = new EvenOddCount(dataEvenOdd);
				// Check for exception
				assertThrowsException(IllegalArgumentException.class, ()->{n.oddEvenEvenOddCount(4);});
			}
		}

}