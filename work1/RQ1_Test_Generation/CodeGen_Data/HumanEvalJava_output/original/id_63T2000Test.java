// FibfibTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Fibfib}.
* It contains one unit test case for the {@link Fibfib#fibfib(int)} method.
*/
class FibfibTest {

	private   int actualCalled = 0;
	private int actualMin = 0;
	
	@Test
	public void testFibFib(){
		
		fibfib(1);
		assertEquals(1, actualCalled);
		assertEquals(1, actualMin);
		
		fibfib(2);
		assertEquals(1, actualCalled);
		assertEquals(2, actualMin);
		
		fibfib(4);
		assertEquals(2, actualCalled);
		assertEquals(1, actualMin);
		
		fibfib(8);
		assertEquals(2, actualCalled);
		assertEquals(8, actualMin);
		
		fibfib(10);
		assertEquals(3, actualCalled);
		assertEquals(8, actualMin);
		
		fibfib(12);
		assertEquals(3, actualCalled);
		assertEquals(10, actualMin);
		
		fibfib(14);
		assertEquals(7, actualCalled);
		assertEquals(14, actualMin);
		
		/*
		Actual Min value is 5, but we don't have tests for it
		fibfib(14);
		assertEquals(1, actualMin);
		*/

		
	}
	
	@Test
	public void testMinFib(){
		/*actualMin = fibfib(2);
		
		assertEquals(2, actualMin);
		actualMin = fibfib(4);
		
		assertEquals(4, actualMin);
		actualMin = fibfib(12);
		
		assertEquals(10, actualMin);
		*/
	}
	
	// end  @Test
	
}
