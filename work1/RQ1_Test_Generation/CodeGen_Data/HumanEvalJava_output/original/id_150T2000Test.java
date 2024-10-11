// XOrYTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XOrY}.
* It contains one unit test case for the {@link XOrY#xOrY(int, int, int)} method.
*/
class XOrYTest {

	@Test
	  public void test1() {
		  
	    // test 1a
		  assertEquals(345, (int)XOrY.xOrY(5, 5, 5));
	  }
	 @Test
	    public void test2() {
		  
	    // test 1b
		  assertEquals(345, (int)XOrY.xOrY(10, 10, 10));
	  }
	
}