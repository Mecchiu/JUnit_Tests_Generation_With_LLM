// SumSquares1Test.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumSquares1}.
* It contains one unit test case for the {@link SumSquares1#sumSquares(List)} method.
*/
class SumSquares1Test {

	private SumSquares1 instance;
	private List<Object> lst;
		
	public void setUp() throws Exception {
		
		lst = new List<Object>();
		
		instance = new SumSquares1();
		
}
			
	// Test of sumSquares method, of class SumSquares1.
	@Test
	public void testSumSquares1() {
		
		lst.add(-2);
		
		assertEquals(2, instance.sumSquares(lst));
	
	}
	
	// Test of sumSquares method, of class Sumsquares1.
	@Test
	public void testNegative() {
		
		lst.set(-1);
		
		assertEquals(-1, instance.sumSquares(lst));
		
	}
	
	// Test of sumSquares method, of class Sumsquares1.
	@Test
	public void testPositive() {
		
		lst.add(2);
		
		assertEquals(2, instance.sumSquares(lst));
		
	}
	
	// Test of sumSquares method, of class Sumsquares1.
	@Test
	public void testNonzero() {
		
		lst.add(0);
		
		assertEquals(0, instance.sumSquares(lst));
		
	}
	
	// Test of sumSquares method, of class Sumsquares1.
	@Test
	public void testSet() {
		
		lst.add(-2);
		
		instance.sumSquares(lst);
		
		assertEquals(2, instance.sumSquares(lst));
		
	}
	
	// Test of sumSquares method, of class Sumsquares1.
	@Test
	public void testClear() {
		
		lst.add(-2);
		
		instance.sumSquares(lst);
		
		lst.clear();
		
		assertEquals(0, instance.sumSquares(lst));
		
	}

	@Test
	public void testIterable() {
		
		List<Object> lstIter = new List<Object>();
		
		lstIter.add(3);
		lstIter.add(7);
		
		assertEquals(5, instance.sumSquares(lstIter));
		
	}
	
	@Test
	public void testGet() {
	
		Object value = null;
		
		instance.sumSquares(lst);
		
		value = instance.get();
		
		assertSame(lst, value);
		
	}
	

}
