// XOrYTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XOrY}.
* It contains one unit test case for the {@link XOrY#xOrY(int, int, int)} method.
*/
class XOrYTest {

	@Test
	public void test() {
            final int N = 7;
            int[][] a = new int[N][N];
            
            for (int d = 1; d <= N; d++) {
                for (int i = 0; i < N; i++) {
                    a[i][i-1] = d*(1-i);
                }
                for (int i = 0; i < N; i++) {
                    assertTrue(a[i][N-1] == d*(i+1));                    
                }
            } 
	}

}

// XOrYTest2.java
